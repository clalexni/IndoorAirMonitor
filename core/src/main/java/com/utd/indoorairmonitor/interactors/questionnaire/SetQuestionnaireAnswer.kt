package com.utd.indoorairmonitor.interactors.questionnaire

import com.utd.indoorairmonitor.data.PeakFlowRepository
import com.utd.indoorairmonitor.data.QuestionnaireAnswerRepository

class SetQuestinonnaireAnswer (private val questionnaireAnswerRepository: QuestionnaireAnswerRepository)
{
    suspend operator fun invoke(answers: IntArray) =
            questionnaireAnswerRepository.setQuestionnaireAnswer(answers)
}