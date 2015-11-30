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
The framework is an encapsulation of `swing`.

There are three interfaces in this package, which are 
`IUIUpdatable`, `IUIStateSavable`, `IUIEventHandler`.

  * `IUIUpdatable` indicates a class can be updated
     by invoking `updateUI()` method
  * `IUIStateSavable` indicates a class can be save and 
     restore its state in the form of `String`
  * `IUIEventHandler` indicates a class can be used as 
     a event handler. 

Then, the tiny UI framework has a root class for all of 
the visual element called `UIElement`. From this root, 
there are some independent classes which extend from 
it and implement the `IUIUpdatable` and `IUIStateSavable`
interface.

To manage the UI elements that implemented `IUIStateSavable`
interface, there is a singleton named `UIStateManager` which provides
`saveState` and `loadState` method to perform IO operations.

The `Main` class contains a `main` function which is a
 entry point for testing this framework.

***

### update ###
* Nov 28, 2015
  * Rename identifiers with `Ui` to ``

* Nov 11, 2015
  * Add UIStateManager
  * Update the state string of `UIBox` to make is more recognizable
  * Add buttons to control blink
  
* Nov 10, 2015
  * First commit

***

Jack Q
