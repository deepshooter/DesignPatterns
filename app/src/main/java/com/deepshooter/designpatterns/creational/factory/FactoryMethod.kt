package com.deepshooter.designpatterns.creational.factory

import org.junit.jupiter.api.Test

sealed class Country {

    object Canada : Country()

}


object Spain : Country()
class Greece(val someProperty: String) : Country()
data class USA(val someProperty: String) : Country()
object India : Country()


class Currency(val code: String)

object CurrencyFactory {

    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
            is India -> Currency("INR")
        }

}


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