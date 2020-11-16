package com.utd.indoorairmonitor.framework.questionnaire

import com.utd.indoorairmonitor.data.QuestionnaireAnswerDataSource
import com.utd.indoorairmonitor.domain.QuestionnaireAnswer

class QuestionnaireAnswerDataSourceImp: QuestionnaireAnswerDataSource {

    private var questionnaireAnswers: QuestionnaireAnswer
            = QuestionnaireAnswer(intArrayOf(0,0,0))

    override suspend fun getAnswers(): IntArray {
        return questionnaireAnswers.answers
    }

    override suspend fun setAnswers(answers: IntArray) {
        questionnaireAnswers.answers = answers
    }
}