package com.deepshooter.designpatterns.creational.factory

import com.deepshooter.designpatterns.creational.factory.country.Country
import com.deepshooter.designpatterns.creational.factory.country.Greece
import com.deepshooter.designpatterns.creational.factory.country.India
import com.deepshooter.designpatterns.creational.factory.country.Spain
import com.deepshooter.designpatterns.creational.factory.country.USA

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
