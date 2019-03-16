Create a new Workflow project
##############################

.. important:: Section under construction, please come back later!


Use the New Workflow Project wizard
-------------------------------------

To create a new project:

1. ``File`` > ``New...``
2. In the ``EKumi`` category select ``New Workflow Project``.
3. Fill in the name of the project, then ``Next``
4. Fill in the name of the workflow to create
5. Check ``Java`` to allow defining tasks' behaviour using Java
6. Click ``Finish``

Wait a few seconds, then you should see the project being added to the Explorer.

.. note:: If ``Java`` is not available, please see :ref:`part-installing`.

Understand the content of the project
---------------------------------------

The project already contains several files and folders which purposes are important.

- ``model/<workflow.name>.spec``: the specification of the workflow, defining the different tasks which it's made of
- ``representations.aird``: the description of the workflow diagram

If ``Java`` has been selected as a scripting language the following should also exist:

- ``src/``: directory for Java source files
- ``META-INF/MANIFEST.MF``: defines project's dependencies, including EKumi's API
- ``build.properties``: defines the files to include when the project is packaged