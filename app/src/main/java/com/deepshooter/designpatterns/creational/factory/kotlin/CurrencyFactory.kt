package com.deepshooter.designpatterns.creational.factory.kotlin

import com.deepshooter.designpatterns.creational.factory.kotlin.country.Country
import com.deepshooter.designpatterns.creational.factory.kotlin.country.Greece
import com.deepshooter.designpatterns.creational.factory.kotlin.country.India
import com.deepshooter.designpatterns.creational.factory.kotlin.country.Spain
import com.deepshooter.designpatterns.creational.factory.kotlin.country.USA

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
