package com.raywenderlich.android.majesticreader.framework.purpleAirAPI.Model

//From Documentation on Page 2: https://docs.google.com/document/d/15ijz94dXJ-YAZLi9iZ_RaBwrZ4KtYeCy08goGBwnbCU/edit
class MonitorDataPoint (
        val ID : Int,
        val ParentID : Int?,    //sometimes there if channel B
        val Label : String,
        val THINGSPEAK_PRIMARY_ID : String,
        val THINGSPEAK_PRIMARY_ID_READ_KEY : String,
        val THINGSPEAK_SECONDARY_ID : String,
        val THINGSPEAK_SECONDARY_ID_READ_KEY : String,
        val Lat : Double,
        val Lon : Double,
        val PM2_5Value : String,
        val State : String?,    //hidden value
        val LastSeen : Int, //10 digit number maybe change to Long is in UTC
        val Type : String,
        val Hidden : String,
        val Flag : String?, //hidden value
        val DEVICE_BRIGHTNESS : String,
        val DEVICE_HARDWAREDISCOVERED : String,
        val A_H : Boolean?,
        val temp_f : String?,
        val humidity : String?,
        val pressure : String?,
        val Version : String,
        val LastUpdateCheck : Int, //10 digit number in UTC format
        val Created : Int, //10 digit number
        val Uptime : String, //in secs
        val RSSI : String,
        val Adc : String,
        val p_0_3_um : String,
        val p_0_5_um : String,
        val p_1_0_um : String,
        val p_2_5_um : String,
        val p_5_0_um : String,
        val p_10_0_um : String,
        val pm1_0_cf_1 : String,
        val pm2_5_cf_1 : String,
        val pm10_0_cf_1 : String,
        val pm1_0_atm : String,
        val pm2_5_atm : String,
        val pm10_0_atm : String,
        val isOwner : Int,
        val AGE : Int,  //7 digit number
        val Stats : String
)

class MonitorResponse(
        val mapVersion : String,
        val baseVersion : String,
        val mapVersionString : String,
        val results : List<MonitorDataPoint>
)