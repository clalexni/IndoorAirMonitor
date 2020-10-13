package com.example.airqualitymonitoring.data

import com.example.airqualitymonitoring.domain.Questionnaire

interface QuestionnaireDataSource{

    suspend fun read(questionnaire: Questionnaire): Questionnaire

}