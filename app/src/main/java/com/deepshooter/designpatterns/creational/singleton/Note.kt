package com.deepshooter.designpatterns.creational.singleton

/**
 *
 * -----Singleton-----
 *
 * -Only One Instance
 * -Single Point of access for a  Resource
 *
 * Uses :
 * 1.Network Manager
 * 2.Database Access
 * 3.Logging
 * 4.Utility Classes
 *
 *
 * Properties:
 * 1.Creational Design Pattern - Creation Of Object
 * 2.Only One Instance of the class should exist
 * 3.Other Classes Should be able to get instance of Singleton Class
 * 4.Used in Logging, Cache, Sessions
 *
 *
 * Single Design Pattern : Implementation
 *--Constructor should be private
 *--Public Method for returning instance
 *--Instance Type - Private Static
 *
 * Initialisation Type
 * --Eager Initialisation
 * --Lazy Initialisation
 * --Thread Safe Method Initialisation
 *--Thread Safe Block Initialisation
 *
 * */