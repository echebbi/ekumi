.. _part_ekumi_default_representation:

EKumi Default Representation
============================

.. important:: Section under construction

A BPMN-inspired editor
----------------------

This is the default built-in representation of an activity. It provides a BPMN-inspired diagram workflow editor.

Use Cases
---------

This representation should be used when a graphical representation makes easier to design an activity.

Features
--------

This representation allows anyone to:

- Design an activity made of multiple tasks,
- Add inputs and outputs to a task,
- Associate a script to a task,
- Specify that several tasks must be executed concurrently.

Impacts on project
------------------

When this representation is chosen for a project, it creates the following files:

+---------------------------------+---------------------------------------------------------------------+
| File                            | Purpose                                                             |
+---------------------------------+---------------------------------------------------------------------+
| ``representations.aird``        | Describes the workflow diagram.                                     |
+---------------------------------+---------------------------------------------------------------------+
| ``model/<activity-name>.eds``   | Describes the activity, defining the different tasks it is made of. |
+---------------------------------+---------------------------------------------------------------------+

It also adds the ``Modeling`` nature to the project.

Understand the diagram editor
-----------------------------

.. image:: ../getting-started/images/workflow_diagram_editor.png
    :alt: Workflow diagram editor

The workflow diagram editor is made of two parts:

- the edition area, which is the blank area on the left,
- the palette, which is the section on the right.

The edition area provides a visual representation of the workflow. Tools can be applied on it in order to modify the representation. The circle represents the start node, which is the entry point of the workflow when it is executed.

The palette provides access to the different tools that can be used to modify the workflow. A tool can be used by:

1. Clicking on the tool in the palette
2. Clicking on the edition area

Available tools are described in the following chapters.

Create a new task
-----------------

.. |external-task-tool| image:: images/external_task_tool.png

A new Task can be created thanks to the |external-task-tool| tool.

Link two tasks
--------------

.. |precede-tool| image:: images/precede_tool.png

Two task can be linked in order to specify which one should be executed first. This can be achieved thanks to the |precede-tool|.