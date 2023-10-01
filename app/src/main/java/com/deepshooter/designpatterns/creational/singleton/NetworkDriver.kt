package com.deepshooter.designpatterns.creational.singleton

import org.junit.jupiter.api.Test


object NetworkDriver {

    init {
        println("Initializing :$this")
    }


    fun log(): NetworkDriver = apply { println("Network Driver: $this") }

}


class SingletonTest {

    @Test
    fun testSingleton() {

        println("Start")
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()
        assert(networkDriver1 == NetworkDriver)
        assert(networkDriver2 == NetworkDriver)
        assert(networkDriver1 == networkDriver2)

    }


}



