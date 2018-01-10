package com.lbsim.shreya.student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Test extends AppCompatActivity {
    private Button start;
    private EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        start=(Button)findViewById(R.id.starttest);
        value=(EditText)findViewById(R.id.testpass);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test.this,QuizActivity.class));
            }
        });



    }

}
