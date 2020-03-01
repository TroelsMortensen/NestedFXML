# Nested FXML
This repository contains 3 examples, all about nested views, using different approaches.

Examples 1 and 2 are in package tabviewexample, and show how one fxml file can include others. This is benefitial, when doing e.g. a tab view, and instead of having one controller responsible for everything, you can define a controller for each tab pane.

Example 3 is in package "exchangablecontent". It shows how part of a view can be swapped out with views defined in separate fxml files. These separate views all have their own controller.

Reflection is used in the MasterViewController to call the appropriate method on ViewHandler. A switch-statement could have been used instead.

The example uses our JavaFX MVVM approach.

The difference between examples 1 and 2, versus example 3, is that in 1 and 2 the "master" fxml file references the tab pane fxml files. This is static.
In example 3 the fxml files knows nothing about each other.

Example 3 is based on an example constructed by my student, Daniel Moscaliciuc. I have modified the code to fit better into our standard approach. He had some other clever ideas, though irrelevant to the point I'm making here about nesting fxml. Thanks for the input, Daniel.