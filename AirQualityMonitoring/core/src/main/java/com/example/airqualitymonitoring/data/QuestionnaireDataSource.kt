package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.Questionnaire

interface QuestionnaireDataSource{

    suspend fun add(questionnaire: Questionnaire)

    suspend fun read(questionnaire: Questionnaire): List<Questionnaire>

    suspend fun remove(questionnaire: Questionnaire)

}