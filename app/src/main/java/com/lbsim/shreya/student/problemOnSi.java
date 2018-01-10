package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnSi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_si);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("Important Formulas:\n" +
                "\n" +
                "1.\tPrincipal:\n" +
                "The money borrowed or lent out for a certain period is called the principal or the sum.\n" +
                "2.\tInterest:\n" +
                "Extra money paid for using other's money is called interest.\n" +
                "3.\tSimple Interest (S.I.):\n" +
                "If the interest on a sum borrowed for certain period is reckoned uniformly, then it is called simple interest.\n" +
                "Let Principal = P, Rate = R% per annum (p.a.) and Time = T years. Then\n" +
                "\n" +
                "\n" +
                "Simple Interest = (P*R*T)/100\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
    }
    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, siQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
