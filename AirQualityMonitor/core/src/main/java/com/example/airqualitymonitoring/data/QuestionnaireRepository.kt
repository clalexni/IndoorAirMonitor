package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.Questionnaire

class QuestionnaireRepository (private val dataSource: QuestionnaireDataSource) {

    suspend fun getQuestionnaire(questionnaire: Questionnaire) {
        dataSource.read(questionnaire)
    }

}
