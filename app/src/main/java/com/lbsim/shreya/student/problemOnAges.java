package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnAges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_ages);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("Important Formulas:\n" +
                "\n" +
                "1. If the current age is x, then n times the age is nx\n" +
                "\n" +
                "2. If the current age is x, then age n years later/hence = x + n.\n" +
                "\n" +
                "3. If the current age is x, then age n years ago = x - n.\n" +
                "\n" +
                "4. The ages in a ratio a : b will be ax and bx.\n" +
                "\n"+
                "5. If the current age is x, then 1/n of the age is x/n.\n" +
                "\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\n");
    }
    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, agesQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
