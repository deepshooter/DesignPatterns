package com.deepshooter.designpatterns.creational.singleton

class MySingleton private constructor() {

    private object HOLDER {
        val INSTANCE = MySingleton()
    }

    companion object {
        val instance: MySingleton by lazy { HOLDER.INSTANCE }
    }

}