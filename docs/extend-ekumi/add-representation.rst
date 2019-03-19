.. _part-add-representation:

Add a new Representation
#############################

.. important:: This section requires some knowledge about `Eclipse Extension Points <https://www.vogella.com/tutorials/EclipseExtensionPoint/article.html>`_.

What is a representation?
------------------------------

A specification describes a possible representation of a workflow. The main purposes of represenations is allowing new workflow editors (which can visual, textual or even in-memory).

How to add a new representation?
-------------------------------------

A new one can be defined by contributing to the ``fr.kazejiyu.ekumi.ide.project_customization`` extension point.

It requires a contribution to the `representations` attribute.


How to integrate the new representation within the IDE?
------------------------------------------------------------------------------------

The representation is automatically proposed to the user in the `New Workflow Project` wizard as soon as the new extension is completed.