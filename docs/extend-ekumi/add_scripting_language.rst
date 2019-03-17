Add a new Scripting Language
#############################

.. important:: This section requires some knowledge about `Eclipse Extension Points <https://www.vogella.com/tutorials/EclipseExtensionPoint/article.html>`_.

What is a scripting language?
------------------------------

A scripting language is a language that can be used to specify the behaviour of a task. Concretely, a language is a parser that can:

1. Instantiate an ``Activity`` from a given String
2. Create a String from an existing ``Activity``.

It is hence responsible of serializing and deserializing Activities so that they can both be persisted and executed.

How to add a new scripting language?
-------------------------------------

A new one can be defined by contributing to the ``fr.kazejiyu.ekumi.model.languages`` extension point.

It requires one class that implements the ``ScriptingLanguage`` interface.

The interface is defined as follows:

.. code-block:: java
   :linenos:

    public interface ScriptingLanguage {

        /**
        * Returns a unique id identifying the language.
        * @return a unique id identifying the language
        */
        String id();

        /**
        * Returns a human-readable name of the language.
        * @return a human-readable name of the language
        */
        String name();

        /**
        * Turns a runner written with the language into a EKumi {@link Runner}.
        *
        * @param identifier
        * 			Uniquely identifies the runner to resolve.
        * 			Must not be {@code null}.
        * @param context
        * 			The context of the {@link Execution}. Can be null if the execution
        * 			does not provide any context, or if the Runner is not resolved in
        * 			the context of an execution.
        *
        * @return a runner that can be handled by EKumi.
        *
        * @throws ScriptLoadingFailureException if the script cannot be loaded.
        * @throws IllegalScriptIdentifierException if the given identifier is not properly formatted.
        */
        Runner resolveRunner(String identifier, Context context);
    }

How to use the new scripting language within the workflow diagram editor?
------------------------------------------------------------------------------------

.. important:: Feature not implemented yet.