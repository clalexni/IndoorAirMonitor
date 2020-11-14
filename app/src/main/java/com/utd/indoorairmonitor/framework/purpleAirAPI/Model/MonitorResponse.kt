package com.utd.indoorairmonitor.framework.purpleAirAPI.Model

class MonitorDataPoint (
        val ID : Int?,
        val pm : Double?,
        val pm_cf_1 : Double?,
        val pm_atm : Double?,
        val age : Double?,
        val pm_0 : Double?,
        val pm_1 : Double?,
        val pm_2 : Double?,
        val pm_3 : Double?,
        val pm_4 : Double?,
        val pm_5 : Double?,
        val pm_6 : Double?,
        val conf : Double?,
        val pm1 : Double?,
        val pm_10 : Double?,
        val p1 : Double?,
        val p2 : Double?,
        val p3 : Double?,
        val p4 : Double?,
        val p5 : Double?,
        val p6 : Double?,
        val Humidity : Double?,
        val Temperature : Double?,
        val Pressure : Double?,
        val Elevation : Double?,
        val Type : Double?,
        val Label : String?,
        val Lat : Double?,
        val Lon : Double?,
        val Icon : Double?,
        val isOwner : Double?,
        val Flags : Double?,
        val Voc : Double?,
        val Ozone1 : Double?,
        val Adc : Double?,
        val CH : Double?
)

class MonitorResponse(
        val version : String,
        val fields : List<String>,
        val data : List<MonitorDataPoint>,
        val count : Int
)