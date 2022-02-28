package com.example.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes;
    Button no;
    private String []questions={"Java is a person?","Java was introduced in 1233?","Java was created by Rahul Garg","Java was created using python?",
                                 "Java has abstract classes?","Java supports interface?"};
    private boolean []answers={false,false,false,false,true,true};
    int score=0,index=0;
    TextView question;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.question);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question.setText(questions[index]);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1)
                {
                    if(!answers[index])
                        score++;
                    index++;
                    if(index<=questions.length-1)
                        question.setText(questions[index]);
                     else
                        Toast.makeText(MainActivity.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Please restart your app to play again", Toast.LENGTH_SHORT).show();
            }
        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1)
                {
                    if(answers[index])
                        score++;
                    index++;
                    if(index<=questions.length-1)
                        question.setText(questions[index]);
                    else
                        Toast.makeText(MainActivity.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Please restart your app to play again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}