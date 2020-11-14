package com.utd.indoorairmonitor.presentation.questionaire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.utd.indoorairmonitor.R
import com.utd.indoorairmonitor.databinding.FragmentQuestionaireBinding


class QuestionaireFragment : Fragment() {

    data class Question(
        val text: String,
        val answers: List<String>
    )

    // fields of the class QuestionaireFragment
    private val questions: MutableList<Question> = mutableListOf(
        Question(text = "How do you feel today?",
                answers = listOf("Very well", "Indifferent", "Not well but ok so far",
                "I had an asthma attack")),
        Question(text = "Do you think our app is useful?",
                answers = listOf("Very useful", "Works sometimes", "Not so useful", "Will not use again")),
        Question(text = "How often did we predict correctly for the past 5 times?",
                answers = listOf("5 out of 5", "4 out of 5", "3 out of 5", "less than 3 times"))
    )

    lateinit var currentQuestion: Question
    lateinit var answers: MutableList<String>
    private var questionIndex = 0
    private val numQuestions = questions.size

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentQuestionaireBinding>(
               inflater, R.layout.fragment_questionaire, container, false
        )

        // set the first question
        setQuestion()

        // bind this fragment class to the layout
        binding.questinoaire = this

        // set onClickListener for the submit button
        binding.submitButton.setOnClickListener @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        {view: View ->
            val checkedId = binding.questionRadioGroup.checkedRadioButtonId

            var answerIndex = 0
            when (checkedId) {
                R.id.secondAnswerRadioButton -> answerIndex = 2
                R.id.thirdAnswerRadioButton -> answerIndex = 1
                R.id.fourthAnswerRadioButton -> answerIndex = 0
            }

            // TODO: save the answer to DB somehow

            // go to the next question or go to the next fragment
            questionIndex ++
            if (questionIndex < numQuestions){
                //advance to next question
                currentQuestion = questions[questionIndex]
                setQuestion()
                binding.invalidateAll()
            }
            else{
                // go to completeQuestionaireFragment
                view.findNavController().navigate(
                        R.id.action_questionaireFragment_to_completeQuestionFragment)
            }
        }

        return binding.root
    }

    private fun setQuestion() {
        currentQuestion = questions[questionIndex]
        answers = currentQuestion.answers.toMutableList()
        (activity as AppCompatActivity).supportActionBar?.title = "Questionnaire " + (questionIndex + 1).toString() + "/" + numQuestions.toString()
    }
}