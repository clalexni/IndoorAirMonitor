package com.example.appCore.data

import com.example.appCore.domain.Questionnaire

interface QuestionnaireDataSource{

    suspend fun read(questionnaire: Questionnaire): Questionnaire

}