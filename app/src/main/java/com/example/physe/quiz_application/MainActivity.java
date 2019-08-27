package com.example.physe.quiz_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mTopButton;
    Button mBottomButton;
    boolean choice1 = false;
    boolean choice2 = false;
    TextView mQuestionText;
    Integer mIndex = 0;

    public AnswerChoice[] mChoiceBank = new AnswerChoice[]{
            new AnswerChoice(R.string.T1_Question, R.string.T1_Ans1, R.string.T2_Ans2),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTopButton = (Button)findViewById(R.id.button1);
        mBottomButton = (Button)findViewById(R.id.button2);
        mQuestionText = (TextView)findViewById(R.id.question);

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice1 = false;
                choice2 = true;
                updateSelection(choice1, choice2);
            }
        });

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choice1 = false;
                choice2 = false;
                updateSelection(choice1, choice2);
            }
        });

    }

    private void updateSelection(boolean choice1, boolean choice2){
        switch(mIndex){
            case 0:
                if(choice1){
                    mTopButton.setText(mChoiceBank[0].getmAnswerChoiceTwoId());
                    mBottomButton.setText(mChoiceBank[0].getmAnswerChoiceThreeId());
                    mQuestionText.setText(mChoiceBank[mIndex].getmQuestionId());
                    mIndex = 1;
                }
                else{
                    mTopButton.setText(mChoiceBank[0].getmAnswerChoiceTwoId());
                    mBottomButton.setText(mChoiceBank[0].getmAnswerChoiceThreeId());
                    mQuestionText.setText(mChoiceBank[0].getmQuestionId());
                    mIndex = 2;
                }
                break;

        }
    }
}
