package com.deepshooter.designpatterns.creational.singleton


object NetworkDriver {

    init {
        println("Initializing :$this")
    }


    fun log(): NetworkDriver = apply { println("Network Driver: $this") }

}





