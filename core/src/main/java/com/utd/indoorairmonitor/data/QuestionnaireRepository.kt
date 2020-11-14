package com.utd.indoorairmonitor.data
import com.utd.indoorairmonitor.domain.Questionnaire

class QuestionnaireRepository (private val dataSource: QuestionnaireDataSource) {

    suspend fun getQuestionnaire(questionnaire: Questionnaire) {
        dataSource.read(questionnaire)
    }

}
