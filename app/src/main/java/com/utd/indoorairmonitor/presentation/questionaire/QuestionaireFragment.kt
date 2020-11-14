package com.utd.indoorairmonitor.presentation.questionaire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
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

        // bind this fragment class to the layout
        binding.questinoaire = this

        // set onClickListener for the submit button
        binding.submitButton.setOnClickListener @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        {
            val checkedId = binding.questionRadioGroup.checkedRadioButtonId

            // check if no radio button is selected
            if (checkedId != -1){
                var answerIndex = 3
                when (checkedId) {
                    R.id.secondAnswerRadioButton -> answerIndex = 2
                    R.id.thirdAnswerRadioButton -> answerIndex = 1
                    R.id.fourthAnswerRadioButton -> answerIndex = 0
                }




            }
        }

        return inflater.inflate(R.layout.fragment_questionaire, container, false)
    }

}