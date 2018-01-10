package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class studyTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_topics);
    }

    public void prob_trains(View v) {
        Button b = (Button) findViewById(R.id.trains);
        try {
            Intent intent = new Intent(this, problemOnTrains.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
    public void prob_ages(View v) {
       Button b = (Button) findViewById(R.id.ages);
        try {
            Intent intent = new Intent(this, problemOnAges.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }


    public void prob_si(View v) {
        Button b = (Button) findViewById(R.id.si);
        try {
            Intent intent = new Intent(this, problemOnSi.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    public void prob_stocks(View v){
        Button b = (Button) findViewById(R.id.shares);
        try {
            Intent intent = new Intent(this, problemOnStocks.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
    public void prob_races(View v){
        Button b = (Button) findViewById(R.id.races);
        try {
            Intent intent = new Intent(this, problemOnRaces.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    public void prob_probability(View v){
        Button b = (Button) findViewById(R.id.probability);
        try {
            Intent intent = new Intent(this, problemOnProbability.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    public void prob_boats(View v){
        Button b = (Button) findViewById(R.id.boats);
        try {
            Intent intent = new Intent(this, problemOnBoats.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }


    public void prob_hcf(View v){
        Button b = (Button) findViewById(R.id.hcf);
        try {
            Intent intent = new Intent(this, problemOnHcf.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }


}
