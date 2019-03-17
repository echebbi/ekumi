Add a new Specification
#############################

.. important:: This section requires some knowledge about `Eclipse Extension Points <https://www.vogella.com/tutorials/EclipseExtensionPoint/article.html>`_.

What is a specification?
------------------------------

A specification describes a possible representation of a workflow. The main purposes of specifications is allowing new workflow editors.

How to add a new specification?
-------------------------------------

A new one can be defined by contributing to the ``fr.kazejiyu.ekumi.model.specs`` extension point.

It requires one class that implements the ``ActivityAdapter`` interface.

The interface is defined as follows:

.. code-block:: java
   :linenos:

     public interface ActivityAdapter {

        /**
         * Returns whether the adapter can turn the given specification into an Activity.
         *
         * @param specification
         * 			The specification to adapt, may be null.
         *
         * @return whether the adapter can turn the given specification into an Activity
         */
         boolean canAdapt(Object specification);

        /**
         * Creates an Activity from the given specification.
         *
         * @param specification
         * 			The specification to adapt.
         * @param datatypes
         * 			The factory used to instantiate available datatypes.
         * @param languages
         * 			The factory used to instantiate available scripting languages.
         *
         * @return a new Activity
         */
         Optional<Activity> adapt(Object specification, DataTypeFactory datatypes, ScriptingLanguageFactory languages);

      }

An ``ActivityAdapter`` is responsible of turning your own specification model into an ``Activity`` so that the framework can execute it.

How to integrate the new specification within the IDE?
------------------------------------------------------------------------------------

.. important:: Feature not implemented yet.