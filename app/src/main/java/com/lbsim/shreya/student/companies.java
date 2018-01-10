package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class companies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies);
    }

    public void prominentR(View v) {
        Button b = (Button) findViewById(R.id.PR);
        try {
            Intent intent = new Intent(this, prominentRecruiters.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
