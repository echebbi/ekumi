Execute a Workflow
==================

Launch a background execution
-----------------------------

An ``Execution`` instance is required to execute properly an activity.

EKumi provides a ``JobsExecution`` class that can be used to execute activities in background, relying on Eclipse Jobs API.

The following code shows how to use it:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;
    import fr.kazejiyu.ekumi.core.workflow.Execution;
    import fr.kazejiyu.ekumi.core.workflow.impl.JobsExecution;

    public class Main {

        public static void main(String[] args) {
            Activity print1 = new Print("print1", "1");
            Activity print2 = new Print("print2", "2");

            // Create a predecessor/successor relationship,
            // Thus ensuring the sequence will execute print1 then print2
            print1.precede(print2);

            Sequence print1Then2 = new BasicSequence("id", "Print 1 then 2", print1);

            Execution execution = new JobsExecution(print1Then2);

            // Launches the execution in background
            execution.start();

            // Wait for the execution to end
            execution.join();
        }

    }

Listen for events
-----------------

Callbacks can be add to the execution in order to react when the workflow changes. This can for instance used to persist the workflow or to update an UI.

The following code shows how to print a message each time a new activity starts:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;
    import fr.kazejiyu.ekumi.core.workflow.Execution;
    import fr.kazejiyu.ekumi.core.workflow.impl.JobsExecution;

    public class Main {

        public static void main(String[] args) {
            Activity workflow = ...
            Execution execution = new JobsExecution(workflow);

            // Register a callback
            execution.context()
                     .events()
                     .onActivityStarted(activity -> System.out.println(activity.name() + " starts"));

            // Launches the execution in background
            execution.start();

            // Wait for the execution to end
            execution.join();
        }

    }