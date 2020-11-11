package com.example.appCore.data

import com.example.appCore.domain.Questionnaire

class QuestionnaireRepository (private val dataSource: QuestionnaireDataSource) {

    suspend fun getQuestionnaire(questionnaire: Questionnaire) {
        dataSource.read(questionnaire)
    }

}
