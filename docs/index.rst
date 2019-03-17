.. EKumi documentation master file, created by
   sphinx-quickstart on Sat Mar 16 02:21:30 2019.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

EKumi: an extensible workflow management system
===================================================

EKumi is a workflow management system licensed under the `Eclipse Public License 2.0 <https://www.eclipse.org/legal/epl-2.0/>`_.

EKumi allows to automate the execution of a chain of tasks. To this end, it provides:

- a graphical workflow editor,
- a workflow engine.

The behaviour of a task is defined by writting a `runner` using one of the supported scripting language. Java is the only built-in scripting language.

.. toctree::
   :maxdepth: 2
   :caption: Getting Started

   getting-started/introduction
   getting-started/installation

.. toctree::
   :maxdepth: 2
   :caption: Design a workflow

   design-workflow/create_workflow_project

.. toctree::
   :maxdepth: 2
   :caption: Execute a workflow

   execute-workflow/execute_workflow

.. toctree::
   :maxdepth: 2
   :caption: Extend EKumi

   extend-ekumi/add_scripting_language
   extend-ekumi/add_data_type
   extend-ekumi/add-specification