package com.deepshooter.designpatterns.creational.singleton

import org.junit.jupiter.api.Test

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
