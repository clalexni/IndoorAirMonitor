package com.utd.indoorairmonitor.data

interface QuestionnaireAnswerDataSource{

    suspend fun getAnswers(): IntArray
    suspend fun setAnswers(answers: IntArray)

}