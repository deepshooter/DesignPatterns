package com.deepshooter.designpatterns.creational.factory.kotlin

import com.deepshooter.designpatterns.creational.factory.kotlin.country.Country
import com.deepshooter.designpatterns.creational.factory.kotlin.country.Greece
import com.deepshooter.designpatterns.creational.factory.kotlin.country.India
import com.deepshooter.designpatterns.creational.factory.kotlin.country.USA
import org.junit.jupiter.api.Test

class FactoryMethodTest {

    @Test
    fun currencyTest() {

        val greekCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
        println("Greek Currency: $greekCurrency")

        val usaCurrency = CurrencyFactory.currencyForCountry(USA("")).code
        println("USA Currency: $usaCurrency")

        val indianCurrency = CurrencyFactory.currencyForCountry(India).code
        println("Indian Currency: $indianCurrency")

        val canadianCurrency = CurrencyFactory.currencyForCountry(Country.Canada).code
        println("Canadian Currency: $canadianCurrency")


        assert(greekCurrency == "EUR")
        assert(usaCurrency == "USD")
        assert(indianCurrency == "INR")
        assert(canadianCurrency == "CAD")

    }

}