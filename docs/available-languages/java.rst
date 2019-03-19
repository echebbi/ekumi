.. _part_java_language:

Java
=====

.. important:: Section under construction

Currently, Java is the only available scripting language. It allows to specify the behaviour of tasks by writting Java scripts. Each script is a class that extends the ``RunnerImpl`` class.

Impacts on project
------------------

When Java is enabled on a Workflow Project, it creates the following files:

+---------------------------------+------------------------------------------------------------------------+
| File                            | Purpose                                                                |
+---------------------------------+------------------------------------------------------------------------+
| ``src/``                        | Directory containing Java source files.                                |
+---------------------------------+------------------------------------------------------------------------+
| ``META-INF/MANIFEST.MF``        | Defines project's dependencies, including EKumi's API.                 |
+---------------------------------+------------------------------------------------------------------------+
| ``build.properties``            | Defines the files to include when the project is packaged as a binary. |
+---------------------------------+------------------------------------------------------------------------+

The ``Java`` and ``Plugin`` natures are also added to the project. That enables the Java builder to compile the sources and allows the dependencies toward EKumi API to be resolved.

Script implementation
---------------------

A new script can be added to a task by specifying the class' canonical name as script id. The class must extend the ``RunnerImpl`` class as in the example below:

.. code-block:: java
   :linenos:

    /**
     * A script that prints 'Hello' when the corresponding task is executed.
     */
    public class SayHello extends RunnerImpl {

        @Override
        public void run(Context context) {
            System.out.println("Hello!");
        }

    }

Dependency Injection
--------------------

Java scripts can be injected with some environment objects. Currently two objects can be injected:

- ``Events``: allows to send specific events and to register new listener
- ``ExecutionStatus``: allows to check the current status of the execution (failed, cancelled, etc.)

.. code-block:: java
   :linenos:

    /**
     * A script that waits until the execution is cancelled.
     */
    public class WaitCancellation extends RunnerImpl {

        @Inject
        private final ExecutionStatus execution;

        @Override
        public void run(Context context) {
            while (! execution.isCancelled()) {
                // wait
            }
        }

    }