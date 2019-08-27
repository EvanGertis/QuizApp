package com.example.physe.quiz_application;

public class AnswerChoice {

    private int mQuestionId;
    private int mAnswerChoiceTwoId;
    private int mAnswerChoiceThreeId;

    public AnswerChoice(int answerChoiceOne, int answerChoiceTwo, int answerChoiceThree){
        mQuestionId = answerChoiceOne;
        mAnswerChoiceTwoId = answerChoiceTwo;
        mAnswerChoiceThreeId = answerChoiceThree;
    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public int getmAnswerChoiceTwoId() {
        return mAnswerChoiceTwoId;
    }

    public int getmAnswerChoiceThreeId() {
        return mAnswerChoiceThreeId;
    }

    public void setmQuestionId(int mmQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public void setmAnswerChoiceThreeId(int mAnswerChoiceThreeId) {
        this.mAnswerChoiceThreeId = mAnswerChoiceThreeId;
    }

    public void setmAnswerChoiceTwoId(int mAnswerChoiceTwoId) {
        this.mAnswerChoiceTwoId = mAnswerChoiceTwoId;
    }
}
