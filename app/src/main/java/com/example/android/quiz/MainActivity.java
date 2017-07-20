package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //when the 'submit' button is pressed
    public void submit(View view) {

        score = 0;
        //question 1
        CheckBox q1_1 = (CheckBox) findViewById(R.id.q1_1);
        boolean walleCheck = q1_1.isChecked();
        CheckBox q1_2 = (CheckBox) findViewById(R.id.q1_2);
        boolean bugsCheck = q1_2.isChecked();
        CheckBox q1_3 = (CheckBox) findViewById(R.id.q1_3);
        boolean turtleCheck = q1_3.isChecked();
        CheckBox q1_4 = (CheckBox) findViewById(R.id.q1_4);
        boolean monstersCheck = q1_4.isChecked();
        CheckBox q1_5 = (CheckBox) findViewById(R.id.q1_5);
        boolean legoCheck = q1_5.isChecked();
        if(walleCheck && bugsCheck && monstersCheck && !turtleCheck && !legoCheck)
            score++;

        //question 2
        RadioButton q2_1 = (RadioButton) findViewById(R.id.q2_1);
        boolean mosDefChecked = q2_1.isChecked();
        RadioButton q2_2 = (RadioButton) findViewById(R.id.q2_2);
        boolean iceCubeChecked = q2_2.isChecked();
        RadioButton q2_3 = (RadioButton) findViewById(R.id.q2_3);
        boolean rakimChecked = q2_3.isChecked();
        if(mosDefChecked && !iceCubeChecked && !rakimChecked)
            score++;

        //question 3
        CheckBox q3_1 = (CheckBox) findViewById(R.id.q3_1);
        boolean illmatic = q3_1.isChecked();
        CheckBox q3_2 = (CheckBox) findViewById(R.id.q3_2);
        boolean thriller = q3_2.isChecked();
        CheckBox q3_3 = (CheckBox) findViewById(R.id.q3_3);
        boolean okc = q3_3.isChecked();
        CheckBox q3_4 = (CheckBox) findViewById(R.id.q3_4);
        boolean isThisIt = q3_4.isChecked();
        if(!illmatic && thriller && !okc && isThisIt)
            score++;

        //question 4
        EditText president = (EditText) findViewById(R.id.q4_1);
        String presidentName = president.getText().toString();
        String answer = "George W. Bush";
        boolean compare = presidentName.equals(answer);
        if(compare)
            score++;


        //question 5
        RadioButton q5_1 = (RadioButton) findViewById(R.id.q5_1);
        boolean pepsi = q5_1.isChecked();
        RadioButton q5_2 = (RadioButton) findViewById(R.id.q5_2);
        boolean microsoft = q5_2.isChecked();
        RadioButton q5_3 = (RadioButton) findViewById(R.id.q5_3);
        boolean google = q5_3.isChecked();
        RadioButton q5_4 = (RadioButton) findViewById(R.id.q5_4);
        boolean amazon = q5_4.isChecked();
        if(amazon && !pepsi && !microsoft && !google)
            score++;

        displayString(score);

    }


    //returns the final string to be displayed
    public void displayString(int finalScore) {
        TextView finalText = (TextView) findViewById(R.id.score);
        finalText.setText("You have scored a " + finalScore + "!");
    }
}
