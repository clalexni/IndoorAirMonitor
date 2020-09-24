package org.cs4485.IndoorAirMonitorFramework

class QuestionnaireParser (val reponses = IntArray(3)) {

    getQuestionResponses(): IntArray {
        for(i in 0..2) {
            reponses[i] = // code to get reponse values from UI
        }

        return reponses
    }
}
