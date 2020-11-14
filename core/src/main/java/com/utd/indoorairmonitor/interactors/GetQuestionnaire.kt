package com.utd.indoorairmonitor.interactors

import com.utd.indoorairmonitor.data.QuestionnaireRepository
import com.utd.indoorairmonitor.domain.Questionnaire

class GetQuestionnaire (private val questionnaireRepository: QuestionnaireRepository) {
    suspend operator fun invoke(questionnaire: Questionnaire) =
        questionnaireRepository.getQuestionnaire(questionnaire)
}