package com.deepshooter.designpatterns.structural.facade

/**
 *
 * ----- Facade Design Pattern -------
 *
 * -> Structural Design Pattern
 *
 * -> Used when there is multiple interface of similar kind of jobs, then we add a Facade interface,
 * Which provide better interface to these interfaces and clients.It basically help in routing to
 * related interface.
 *
 * Eg. Drivers, Databases
 *
 * -> We will implement a facade helper class, which will route to method related to specific class
 *  based on Input.
 *
 *
 * ---------------------------------------
 * Facade Design Pattern: Describes a higher-level interface that makes the subsystem easier to use.
 * Every Abstract Factory is a Facade Design Pattern.
 *
 * Advantages : It protects the end-users from the complex sub-system components.
 *
 * */