package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnProbability extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_probability);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tExperiment:\n" +
                "An operation which can produce some well-defined outcomes is called an experiment.\n" +
                "2.\tRandom Experiment:\n" +
                "An experiment in which all possible outcomes are know and the exact output cannot be predicted in advance, is called a random experiment.\n" +
                "Examples:\n" +
                "i.\tRolling an unbiased dice.\n" +
                "ii.\tTossing a fair coin.\n" +
                "iii.\tDrawing a card from a pack of well-shuffled cards.\n" +
                "iv.\tPicking up a ball of certain colour from a bag containing balls of different colours.\n" +
                "Details:\n" +
                "v.\tWhen we throw a coin, then either a Head (H) or a Tail (T) appears.\n" +
                "vi.\tA dice is a solid cube, having 6 faces, marked 1, 2, 3, 4, 5, 6 respectively. When we throw a die, the outcome is the number that appears on its upper face.\n" +
                "vii.\tA pack of cards has 52 cards.\n" +
                "It has 13 cards of each suit, name Spades, Clubs, Hearts and Diamonds.\n" +
                "Cards of spades and clubs are black cards.\n" +
                "Cards of hearts and diamonds are red cards.\n" +
                "There are 4 honours of each unit.\n" +
                "There are Kings, Queens and Jacks. These are all called face cards.\n" +
                "3.\tSample Space:\n" +
                "When we perform an experiment, then the set S of all possible outcomes is called the sample space.\n" +
                "Examples:\n" +
                "1.\tIn tossing a coin, S = {H, T}\n" +
                "2.\tIf two coins are tossed, the S = {HH, HT, TH, TT}.\n" +
                "3.\tIn rolling a dice, we have, S = {1, 2, 3, 4, 5, 6}.\n" +
                "4.\tEvent:\n" +
                "Any subset of a sample space is called an event.\n" +
                "5.\tProbability of Occurrence of an Event:\n" +
                "Let S be the sample and let E be an event.\n" +
                "Then, E   S.\n" +
                "\tP(E) = n(E)/n(S)\n" +
                "Results on Probability:\n" +
                "i.\tP(S) = 1\n" +
                "ii.\t0   P (E)   1\n" +
                "iii.\tP( ) = 0\n" +
                "iv.\tFor any events A and B we have : P(A   B) = P(A) + P(B) - P(A   B)\n" +
                "v.\tIf A denotes (not-A), then P(A) = 1 - P(A).\n" +
                "\n" +
                "\n");
    }
    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, probQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
