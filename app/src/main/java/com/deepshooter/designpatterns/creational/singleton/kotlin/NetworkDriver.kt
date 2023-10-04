package com.deepshooter.designpatterns.creational.singleton.kotlin


object NetworkDriver {

    init {
        println("Initializing :$this")
    }


    fun log(): NetworkDriver = apply { println("Network Driver: $this") }

}





