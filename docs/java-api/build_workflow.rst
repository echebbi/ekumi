Build a workflow
=================

Create an activity
------------------

An activity is a single unit of process that takes inputs and produces outputs. The ``Activity`` interface defines the exact behavior of an activity.

In order to create a new activity, the simplest way is to create a class that extends ``AbstractActivityWithStateManagement``. This abstract class hides all the complexity related to state, inputs and outputs management as well as error handling. It only requires the sub-class to implement the ``doRun(Context)`` method, which is then called each time the activity is executed.

The following example shows a simple ``HelloWorld`` activity:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Context;
    import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

    /**
     * An activity that prints "Hello World!" when run.
     */
    public class HelloWorld extends AbstractActivityWithStateManagement {

        @Override
        public void doRun(Context context) {
            System.out.println("Hello World!");
        }

    }

About the execution context
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

As shown in the example above, the ``doRun`` method takes a ``Context`` instance as parameter. This instance represents the context of the execution and can be used, among other things, to:

- set/get global variables
- cancel the execution

The following activity prints different sentence depending on whether the execution has been cancelled:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Context;
    import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

    /**
     * An activity that, when run, prints:
     *  - "Cancelled" if the execution has been cancelled
     *  - "Succeeded" otherwise
     */
    public class HelloWorld extends AbstractActivityWithStateManagement {

        @Override
        public void doRun(Context context) {
            if (context.execution().isCancelled()) {
                System.out.println("Cancelled");
            }
            else {
                System.out.pritnln("Succeeded");
            }
        }

    }

Provide inputs and outputs
~~~~~~~~~~~~~~~~~~~~~~~~~~

An activity's inputs and outputs can be accessed through the ``inputs`` and ``outputs`` methods.

The following example shows how to create an ``AplusB`` activity that:

- has two inputs called `a` and `b` of type ``double``
- has one output called `c` of type ``double``
- set `c` to the value of `a + b`

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Context;
    import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;
    import fr.kazejiyu.ekumi.datatypes.DoubleType;

    /**
     * An activity that computes its outputs 'c' from the addition of its two inputs 'a' and 'b'.
     */
    public class AplusB extends AbstractActivityWithStateManagement {

        public AplusB(String id) {
            super(id, "a + b = c");

            inputs().create("a", new DoubleType());
            inputs().create("b", new DoubleType());
            outputs().create("c", new DoubleType());
        }

        @Override
        protected void doRun(Context context) throws Exception {
            double a = (double) input("a").value();
            double b = (double) input("b").value();

            output("c").set(a + b);
        }

    }

From lambda expressions
~~~~~~~~~~~~~~~~~~~~~~~

Alternatively, the ``Activity`` interface provides factory methods allowing to creates activities from lambda methods:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;

    public class Main {

        public static void main(String[] args) {
            Activity sayHello = Activity.of(() -> System.out.println("Hello!");
            Activity sayIfCancelled = Activity.of(context -> System.out.println(context.execution().isCancelled());
        }

    }

Bind activities
---------------

Configure execution order
~~~~~~~~~~~~~~~~~~~~~~~~~

The execution order of two activities can be specified through a predecessor/successor relationship. A predecessor is always executed **before** its successor.

This relationship can be created via the ``precede`` and ``succeed`` methods:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;

    public class Main {

        public static void main(String[] args) {
            Activity first = Activity.of(() -> System.out.println("First");
            Activity second = Activity.of(() -> System.out.println("second");

            // 'first' will be executed before 'second'
            first.precede(second);

            // Can also be written this way:
            second.succeed(first);
        }

    }

Bind outputs to inputs
~~~~~~~~~~~~~~~~~~~~~~~~~

Outputs and inputs must be connected in order to share data between activities. An input can be connected to another data by calling the `Input.bind(Data)` method.

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;

    public class Main {

        public static void main(String[] args) {
            Activity add1 = new AplusB("add1");
            Activity add2 = new AplusB("add2");

            // At runtime, the value of add2's 'b' input
            // will be set to the value of add1's 'c' output
            add2.input("b").bind(add1.output("c"));
        }

    }

Create a sequence of activities
-------------------------------

Usually successors and predecessors must be executed sequentially. A ``Sequence`` is a composite activity that owns a root activity and which, when run, executes its root activity then all its successors and the successors of the successors and so on.

One can be created as follows:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;
    import fr.kazejiyu.ekumi.core.workflow.Sequence;
    import fr.kazejiyu.ekumi.core.workflow.impl.BasicSequence;

    public class Main {

        public static void main(String[] args) {
            Activity print1 = new Print("print1", "1");
            Activity print2 = new Print("print2", "2");

            // Create a predecessor/successor relationship,
            // Thus ensuring the sequence will execute print1 then print2
            print1.precede(print2);

            Sequence print1Then2 = new BasicSequence("id", "Print 1 then 2", print1);
        }

    }

Create parallel activities
--------------------------

A ``Parallel Split`` is a composite activity that executes its own activities concurrently.

Once can be created as follows:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;
    import fr.kazejiyu.ekumi.core.workflow.ParallelSplit;
    import fr.kazejiyu.ekumi.core.workflow.impl.BasicParallelSplit;

    public class Main {

        public static void main(String[] args) {
            List<Activity> concurrentActivities = new ArrayList<>();
            for (int i = 0 ; i < 4; ++i) {
                Activity concurrentActivity = Activity.of(() -> System.out.println("I run concurrently");
                concurrentActivities.add(concurrentActivity);
            }
            ParallelSplit split = new BasicParallelSplit("id", "Run branches in parallel", concurrentActivities);
        }

    }

Create loop of activities
-----------------------------

A ``Structured Loop`` is a composite activity that executes another activity until a specified pre or post condition is verified.

One can be created as follows:

.. code-block:: java
   :linenos:

    import fr.kazejiyu.ekumi.core.workflow.Activity;
    import fr.kazejiyu.ekumi.core.workflow.Condition;
    import fr.kazejiyu.ekumi.core.workflow.StructuredLoop;
    import fr.kazejiyu.ekumi.core.workflow.impl.BasicStructuredLoop;

    public class Main {

        public static void main(String[] args) {
            Condition preCondition = null; // the loop has no pre-condition
            Condition postCondition = Condition.of(() -> true); // the loop will end after the first execution

            Activity greet = Activity.of(() -> System.out.println("Hello"));

            StructuredLoop loop = new BasicStructuredLoop("id", "name", greet, preCondition, postCondition);
        }

    }