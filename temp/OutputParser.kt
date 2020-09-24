class OutputParser (value1: Float?,
                    value2: Float?) {

    enum class PeakFlowRateValue { GREEN, YELLOW, RED }

    getPeakFlowValueRate(val1: Float, val2: Float) {
        val peakFlowValueRate: PeakFlowRateValue = {
            /*
            * Code to translate ML data to alert
             */
        }

        return peakFlowValueRate
    }
}