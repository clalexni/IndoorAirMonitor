package org.cs4485.IndoorAirMonitorFramework

import org.xmlpull.v1.XmlPullParser
import android.util
import java.io
import android.Manifest
import android.app.Activity
import android.content.Context
import android.support.v4.app.ActivityCompat
import android.location.LocationManager
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.os.Bundle
import android.location.LocationListener
import android.content.Context.LOCATION_SERVICE
import android.location.Location

/* See the API information here: https://openweathermap.org/current
*  View this resource for XML parsing:
*       https://developer.android.com/training/basics/network-ops/xml
*/

public class WeatherXMLParser (private val apiKey: String,
                               private val latitude: Float,
                               private val longitude: Float) {

    init  {
        /*
        Constuctor for the WeatherXMLParser class

        TODO() = Initialize latitude and longitude from Google Play Services
        View this resource: https://developer.android.com/training/location/retrieve-current

        You will probably want to set up an outside class and methods for this, but keeping
        it in the same file should be ok, since it's only being used by the weather parser
        */
    }

    /*
    This method instantiates the parser and gives it the input feed to parse
     */

    @Throws(XmlPullParserException::class, IOException::class)
    fun parse(inputStream: InputStream): Weather {
        inputStream.use { inputStream ->
            val parser: XmlPullParser = Xml.newPullParser()
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false)
            parser.setInput(inputStream, null)
            parser.nextTag()
            return readFeed(parser)
        }
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun readFeed(parser: XmlPullParser): Weather {

        val weather: Weather
        /*
        Code to read the XMLPullParser and extract the temperature string from the XML
        example XML:
        "
        ...
        <temperature value="278.07" min="273.15" max="282.59" unit="kelvin" />
        ...
        "
        We want to read the feed and extract the temperature value and unit
        and the humidity value.
        You may want to create one or more extra functions to do this
         */

        return weather
    }

    data class Weather(val temperature: Float?,
                       val unit: String?,
                       val humidity: Float?) {

        /*
        This is a data class to store the weather information.
        I'm including conversion functions for K to C and K to F in case we need them
         */

        fun convertKelvinToFahrenheit(temperature: Float?, unit: String): Unit {
            temperature = (temperature - 273.15) * (9.0 / 5.0) = 32.0
            unit = "Fahrenheit"
        }

        fun convertKelvinToCelsius(temperature: Float?, unit: String): Unit {
            temperature = temperature - 273.15
            unit = "Celsius"
        }
    }

    /*
    Function to skip the tags we don't want
     */

    @Throws(XmlPullParserException::class, IOException::class)
    private fun skip(parser: XmlPullParser) {
        if (parser.eventType != XmlPullParser.START_TAG) {
            throw IllegalStateException()
        }
        var depth = 1
        while (depth != 0) {
            when (parser.next()) {
                XmlPullParser.END_TAG -> depth--
                XmlPullParser.START_TAG -> depth++
            }
        }
    }

    private fun downloadFeed(): InputStream? {
        /*
        I've supplied the address and API key for the weather XML, we just need code to grab the
            input stream
         */
        val inputStream: InputStream
        val urlString: String =
            "api.openweathermap.org/data/2.5/weather?lat=$latitude&lon=$longitude&appid=$apiKey"

        // val inputStream: InputStream = code to get inputStream

        return inputStream
    }
}