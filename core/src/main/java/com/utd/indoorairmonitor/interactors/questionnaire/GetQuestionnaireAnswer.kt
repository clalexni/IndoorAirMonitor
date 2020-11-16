package com.utd.indoorairmonitor.interactors.questionnaire

import com.utd.indoorairmonitor.data.QuestionnaireAnswerRepository

class GetQuestionnaireAnswer (private val questionnaireRepository: QuestionnaireAnswerRepository) {
    suspend operator fun invoke() =
        questionnaireRepository.getQuestionnaireAnswer()
}