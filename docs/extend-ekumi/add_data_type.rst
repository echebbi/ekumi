Add a new Data Type
#############################

.. important:: This section requires some knowledge about `Eclipse Extension Points <https://www.vogella.com/tutorials/EclipseExtensionPoint/article.html>`_.

What is a data type?
------------------------------

A data type is a language that can be used to specify the format of a data. The term data represents both inputs and outputs. Concretely, a datatype is a parser that can:

1. Instantiate an ``Object`` from a given String
2. Create a String from an existing ``Object``.

It is hence responsible of serializing and deserializing data so that they can both be persisted and used during the execution.

How to add a new datatype?
-------------------------------------

A new one can be defined by contributing to the ``fr.kazejiyu.ekumi.core.datatypes`` extension point.

It requires one class that implements the ``DataType<T>`` interface.

The interface is defined as follows:

.. code-block:: java
   :linenos:

    public interface DataType<T> {

        /**
        * Returns an identifier for this type.
        * @return an identifier for this type.
        */
        String getId();

        /**
        * Returns the name of the type.
        * @return the name of the type.
        */
        String getName();

        /**
        * Returns the Java class corresponding to this type.
        * @return the Java class corresponding to this type.
        */
        Class<T> getJavaClass();

        /**
        * Returns the default value of a new instance of this type.
        * @return the default value of a new instance of this type.
        */
        T getDefaultValue();

        /**
        * Returns a String representation of the type.<br>
        * <br>
        * For any type {@code type}, the following assertion must be {@code true}:
        * <pre>{@code instance.equals( type.unserialize(type.serialize(instance)) );}</pre>
        *
        * @return a String representation of the type.
        *
        * @throws DataTypeSerializationException if T cannot be turned into a String
        *
        * @see #unserialize(String)
        */
        String serialize(T instance);

        /**
        * Returns a new instance of the type from a given representation.<br>
        * <br>
        * For any type {@code type}, the following assertion must be {@code true}:
        * <pre>{@code instance.equals( type.unserialize(type.serialize(instance)) );}</pre>
        *
        * @param representation
        * 			The string representation of the type.
        *
        * @throws DataTypeUnserializationException if representation cannot be turned into an instance of T
        *
        * @see #serialize()
        */
        T unserialize(String representation);
    }

How to use the new datatype within the workflow diagram editor?
------------------------------------------------------------------------------------

.. important:: Feature not implemented yet.