package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button feed,gd,qb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Feedbackact(View v){
    feed=(Button)findViewById(R.id.feedbackForm);
    feed.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            try{

// your intent here
                Intent intent=new Intent(MainActivity.this,Feedback.class);
                startActivity(intent);

            } catch (ActivityNotFoundException e) {
// show message to user

            }

        }
    }
    );
    }

    public void gd(View v){
        gd=(Button)findViewById(R.id.gd);
        try{

// your intent here
            Intent intent=new Intent(MainActivity.this,GD.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void quesBank(View v){
        qb=(Button)findViewById(R.id.qb);
        try{

// your intent here
            Intent intent=new Intent(MainActivity.this,aptitude.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void sTopics(View v){
        qb=(Button)findViewById(R.id.qb);
        try{

// your intent here
            Intent intent=new Intent(MainActivity.this,studyTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void testActivity(View v){
        qb=(Button)findViewById(R.id.qb);
        try{

// your intent here
            Intent intent=new Intent(MainActivity.this,Test.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }

    public void companiesActivity(View v){
        qb=(Button)findViewById(R.id.qb);
        try{

// your intent here
            Intent intent=new Intent(MainActivity.this,companies.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
}
