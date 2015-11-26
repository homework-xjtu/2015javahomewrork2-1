# 2015 Java Homework 2-1 #

***

* *Name:* 乔波
* *Class:* 软件44
* *Student ID:* 2141601066

***

## introduce ##

In this homework, I implemented a set of components 
which simulates a simple UI framework including a 
button control, a text control and a box control.
The framework is an ecapsulation of `swing`.

There are three interfaces in this package, which are 
`IUiUpdatable`, `IUiStateSavable`, `IUiEventHandler`.

  * `IUiUpdatable` indecates a class can be updated
     by invocating `updateUi()` method
  * `IUiStateSavable` indecates a class can be save and 
     restore its state in the form of `String`
  * `IUiEventHandler` indecates a class can be used as 
     a event handler. 

Then, the tiny UI framework has a root class for all of 
the visual element called `UiElement`. From this root, 
there are some independent classes which extend from 
it and implement the `IUiUpdatable` and `IUiStateSavable`
interface.

To manage the ui elements that implemented `IUiStateSavable`
interface, there is a singlton named `UiStateManager` which provides
`saveState` and `loadState` method to perform IO operations.

The `Main` class contains a `main` function which is a
 entry point for testing this framework.

***

### update ###
* Nov 11, 2015
  * Add UiStateManager
  * Update the state string of `UiBox` to make is more recognizable
  * Add buttons to control blink
  
* Nov 10, 2015
  * First commit

***

Jack Q
