package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnBoats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_boats);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tDownstream/Upstream:\n" +
                "In water, the direction along the stream is called downstream. And, the direction against the stream is called upstream.\n" +
                "2.\tIf the speed of a boat in still water is u km/hr and the speed of the stream is v km/hr, then:\n" +
                "Speed downstream = (u + v) km/hr.\n" +
                "Speed upstream = (u - v) km/hr.\n" +
                "3.\tIf the speed downstream is a km/hr and the speed upstream is b km/hr, then:\n" +
                "\n" +
                "Speed in still water = ½ (a+b) km/hr.\n" +
                "Rate of stream = ½(a-b) km/hr.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
    }
    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, boatsQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
