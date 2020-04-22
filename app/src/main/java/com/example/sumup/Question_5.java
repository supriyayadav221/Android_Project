package com.example.sumup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Question_5 extends AppCompatActivity implements  fragment3.C{
public void putValues(String s)
        {
        fragment4 frag=(fragment4) getSupportFragmentManager().findFragmentById(R.id.fra2);
        frag.updateValues(s);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_5);
    }
}
