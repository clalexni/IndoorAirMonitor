package com.example.appCore.interactors

import com.example.appCore.data.QuestionnaireRepository
import com.example.appCore.domain.Questionnaire

class GetQuestionnaire (private val questionnaireRepository: QuestionnaireRepository) {
    suspend operator fun invoke(questionnaire: Questionnaire) =
        questionnaireRepository.getQuestionnaire(questionnaire)
}