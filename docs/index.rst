.. EKumi documentation master file, created by
   sphinx-quickstart on Sat Mar 16 02:21:30 2019.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

===================================================
EKumi: an extensible workflow management system
===================================================

EKumi is a workflow management system licensed under the `Eclipse Public License 2.0 <https://www.eclipse.org/legal/epl-2.0/>`_.

EKumi allows to automate the execution of chains of tasks. Its bigger strength is its extensibility as it allows anyone to provide  and share new:

- workflow editors,
- scripting languages,
- datatypes,
- execution hooks.

Please follow **Getting Started** chapters to learn how to create and execute a workflow using EKumi's built-in features.

Table of Contents
-----------------

.. toctree::
   :maxdepth: 2
   :caption: Getting Started

   getting-started/main_concepts
   getting-started/installation
   getting-started/create_workflow_project
   getting-started/design_activity
   getting-started/launch_activity
   getting-started/good_practices

.. toctree::
   :maxdepth: 2
   :caption: Available Representations

   available-representations/ekumi-default-representation

.. toctree::
   :maxdepth: 2
   :caption: Available Scripting Languages

   available-languages/java

.. toctree::
   :maxdepth: 2
   :caption: Extend EKumi

   extend-ekumi/monitor_executions
   extend-ekumi/add_scripting_language
   extend-ekumi/add_data_type
   extend-ekumi/add-specification
   extend-ekumi/add-representation
   extend-ekumi/share-activity

.. toctree::
   :maxdepth: 2
   :caption: Java API

   java-api/build_workflow
   java-api/execute_workflow

.. toctree::
   :maxdepth: 2
   :caption: Architecture