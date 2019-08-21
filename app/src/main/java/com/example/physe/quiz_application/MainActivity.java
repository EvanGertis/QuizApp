package com.example.physe.quiz_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String questionText = "Java is which type of the following programming lanaguages?";
        String[] questionArray = new String[3];
        questionArray[0] = "executable language";
        questionArray[1]= "english language";
        questionArray[2] = "compiled language";


        setContentView(R.layout.activity_main);

        //initialize question
        TextView question = (TextView)findViewById(R.id.question);
        question.setText(questionText);

        //initialize answer choices
        Button answerChoiceA = (Button)findViewById(R.id.button1);
        Button answerChoiceB = (Button)findViewById(R.id.button2);
        Button answerChoiceC = (Button)findViewById(R.id.button3);

        answerChoiceA.setText(questionArray[0]);
        answerChoiceB.setText(questionArray[1]);
        answerChoiceC.setText(questionArray[2]);

    }
}
