package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnRaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_races);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tRaces: A contest of speed in running, riding, driving, sailing or rowing is called a race.\n" +
                "2.\tRace Course: The ground or path on which contests are made is called a race course.\n" +
                "3.\tStarting Point: The point from which a race begins is known as a starting point.\n" +
                "4.\tWinning Point or Goal: The point set to bound a race is called a winning point or a goal.\n" +
                "5.\tWinner: The person who first reaches the winning point is called a winner.\n" +
                "6.\tDead Heat Race: If all the persons contesting a race reach the goal exactly at the same time, the race is said to be dead heat race.\n" +
                "7.\tStart: Suppose A and B are two contestants in a race. If before the start of the race, A is at the starting point and B is ahead of A by 12 meters, then we say that 'A gives B, a start of 12 meters'.\n" +
                "To cover a race of 100 meters in this case, A will have to cover 100 meters while B will have to cover only (100 - 12) = 88 meters.\n" +
                "In a 100 race, 'A can give B 12 m' or 'A can give B a start of 12 m' or 'A beats B by 12 m' means that while A runs 100 m, B runs (100 - 12) = 88 m.\n" +
                "8.\tGames: 'A game of 100, means that the person among the contestants who scores 100 points first is the winner'.\n" +
                "If A scores 100 points while B scores only 80 points, then we say that 'A can give B 20 points'.\n" +
                "\n");
    }
    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, racesQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
