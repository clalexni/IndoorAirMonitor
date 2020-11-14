package com.utd.indoorairmonitor.data

import com.utd.indoorairmonitor.domain.Questionnaire

interface QuestionnaireDataSource{

    suspend fun read(questionnaire: Questionnaire): Questionnaire

}