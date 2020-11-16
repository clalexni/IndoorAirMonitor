package com.utd.indoorairmonitor.data

class QuestionnaireAnswerRepository (private val dataSource: QuestionnaireAnswerDataSource) {

    suspend fun getQuestionnaireAnswer() = dataSource.getAnswers()

    suspend fun setQuestionnaireAnswer(answers: IntArray){
        dataSource.setAnswers(answers)
    }

}