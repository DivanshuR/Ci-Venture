package com.lbsim.shreya.student;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends Activity {

    private Button rtry,qu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        rtry=(Button)findViewById(R.id.retry);
        qu=(Button)findViewById(R.id.quit);


        rtry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,Test.class));
            }
        });

        qu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,MainActivity.class));
            }
        });

        //get rating bar object
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
        bar.setNumStars(5);
        bar.setStepSize(0.5f);
        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
        Bundle b = getIntent().getExtras();
        int score= b.getInt("score");
        //display score
        bar.setRating(score);
        bar.getNumStars();
        bar.getRating();
        switch (score)
        {
            case 1:
            case 2: t.setText("Hard luck. Keep trying.");
                break;
            case 3:
            case 4:t.setText("You're Awesome. On the right track mate.");
                break;
            case 5:t.setText("Wow that's something... Excellent. Bravo");
                break;
        }
    }

}