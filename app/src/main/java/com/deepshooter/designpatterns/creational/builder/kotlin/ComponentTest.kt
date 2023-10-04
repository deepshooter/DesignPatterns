package com.deepshooter.designpatterns.creational.builder.kotlin

import org.junit.jupiter.api.Test

class ComponentTest {

    @Test
    fun builderTest() {

        val component = Component.Builder()
            .setParam1("Some Value")
            .setParam3(true)
            .build()

        println(component)
        println(component.param1)
        println(component.param3)
        println(component.param2)

        assert(component.param1 == "Some Value")
        assert(component.param3 == true)
        assert(component.param2 == null)

    }


}