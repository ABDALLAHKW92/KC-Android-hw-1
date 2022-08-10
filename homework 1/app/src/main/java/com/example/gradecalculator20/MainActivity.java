package com.example.gradecalculator20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Double2;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Tv1 = findViewById(R.id.TV1);
        TextView Results = findViewById(R.id.Result);

        EditText Quiz = findViewById(R.id.quizzes);
        EditText HW = findViewById(R.id.Homework);
        EditText Mid = findViewById(R.id.MidTerms);
        EditText Finals = findViewById(R.id.Finals);



        Button batata = findViewById(R.id.calc);
        Button Reset = findViewById(R.id.Reset);




        batata.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                int quiz2 = Integer.parseInt(Quiz.getText().toString());
               Double quiz3= quiz2 * 0.15  ;



               int HW2 = Integer.parseInt(HW.getText().toString());
               Double HW3 = HW2 * 0.25;


               int Mid2 = Integer.parseInt(Mid.getText().toString());
               Double Mid3 = Mid2 * 0.3;


               int Finals2=Integer.parseInt(Finals.getText().toString());
                Double Finals3 = Finals2 *0.3;

                Double two = quiz3 + HW3;
                Double TwoTwo= Mid3 + Finals3;

                Double twoTwoTwo = two + TwoTwo;

                Results.setText(String.valueOf(twoTwoTwo));






            }

        });
        Reset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Results.setText(" ");
                Quiz.setText("");
                HW.setText("");
                Mid.setText("");
                Finals.setText("");

            }
        });
    }




    }
