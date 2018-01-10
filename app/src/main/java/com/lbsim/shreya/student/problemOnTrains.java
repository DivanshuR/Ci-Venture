package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnTrains extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_trains);
        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText("Important Formulas:\n" +
                "\n" +
                "1.\tTime taken by a train of length l meters to pass a pole or standing man or a signal post is equal to the time taken by the train to cover l meters.\n" +
                "2.\tTime taken by a train of length l meters to pass a stationery object of length b meters is the time taken by the train to cover (l + b) meters.\n" +
                "3.\tSuppose two trains or two objects bodies are moving in the same direction at u m/s and v m/s, where u > v, then their relative speed is = (u - v) m/s.\n" +
                "4.\tSuppose two trains or two objects bodies are moving in opposite directions at u m/s and v m/s, then their relative speed is = (u + v) m/s.\n" +
                "5.\tIf two trains of length a meters and b meters are moving in opposite directions at u m/s and v m/s, then:\n" +
                "The time taken by the trains to cross each other =\t(a + b)\tsec.\n" +
                "\t(u + v)\t\n" +
                "6.\tIf two trains of length a meters and b meters are moving in the same direction at u m/s and v m/s, then:\n" +
                "The time taken by the faster train to cross the slower train =\t(a + b)\tsec.\n" +
                "\t(u - v)\t\n" +
                "7.\tIf two trains (or bodies) start at the same time from points A and B towards each other and after crossing they take a and b sec in reaching B and A respectively, then:\n" +
                "(A's speed) : (B's speed) = (b : a)\n" +
                "\n");
    }

    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, trainQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}