package com.example.airqualitymonitoring.interactors

import com.example.airqualitymonitoring.data.QuestionnaireRepository
import com.example.airqualitymonitoring.domain.Questionnaire

class GetQuestionnaire (private val questionnaireRepository: QuestionnaireRepository) {
    suspend operator fun invoke(questionnaire: Questionnaire) =
        questionnaireRepository.getQuestionnaire(questionnaire)
}