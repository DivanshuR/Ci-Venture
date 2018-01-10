package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GD extends AppCompatActivity {

    Button point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gd);
    }
    public void getPoints(View v){
        point=(Button)findViewById(R.id.def);
        try{

// your intent here
            Intent intent=new Intent(GD.this,points.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void currTopics(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,cTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void eco(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,Economics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void gi(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,generalInterest.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void management(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,mTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void creative(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,creativeTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void social(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,socialTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void politics(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,politicsTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
    public void education(View v){
        point=(Button)findViewById(R.id.currentTopics);
        try{

// your intent here
            Intent intent=new Intent(GD.this,educationTopics.class);
            startActivity(intent);

        } catch (ActivityNotFoundException e) {
// show message to user

        }
    }
}
