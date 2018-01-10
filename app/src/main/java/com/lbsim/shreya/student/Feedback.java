package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {
    RatingBar rb;
    Button ratingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void submitclick(View v) {
        rb = (RatingBar) findViewById(R.id.ratingBar);
        ratingButton= (Button) findViewById(R.id.rate_submit);
        Float f = rb.getRating();
        String s = Float.toString(f);
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        toast.show();

    }
}
