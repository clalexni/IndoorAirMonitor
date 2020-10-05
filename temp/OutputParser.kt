class OutputParser (val value1: Float?,
                    val value2: Float?) {

    enum class PeakFlowRateValue { GREEN, YELLOW, RED }

    getPeakFlowValueRate(val1: Float, val2: Float): PeakFlowValueRate {
        val peakFlowValueRate: PeakFlowRateValue = {
            /*
            * Code to translate ML data to alert
             */
        }

        return peakFlowValueRate
    }
}
