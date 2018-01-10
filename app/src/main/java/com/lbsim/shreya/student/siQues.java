package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class siQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tFind the principle on a certain sum of money at 5% per annum for 2 2/5 years if the amount being Rs.1120?\n" +
                "\n" +
                "Answer: Rs. 1000\n" +
                "\n" +
                "Explanation:\n" +
                "1120 = P [1 + (5*12/5)/100]\n" +
                " P= 1000\n" +
                "\n" +
                "2.\tWhat sum of money will produce Rs.70 as simple interest in 4 years at 3 1/2 percent?\n" +
                "\n" +
                "\n" +
                "Answer: Rs. 500\n" +
                "\n" +
                "Explanation:\n" +
                "70 = (P*4*7/2)/100\n" +
                "P = 500\n" +
                "\n" +
                "3.\tAt what rate percent on simple interest will Rs.750 amount to Rs.900 in 5 years?\n" +
                "\n" +
                "\n" +
                "Answer: 4%\n" +
                "\n" +
                "Explanation:\n" +
                "150 = (750*5*R)/100\n" +
                "R = 4%\n" +
                "\n" +
                "\n" +
                "4.\tWhat is the rate percent when the simple interest on Rs.800 amount to Rs.160 in 4 Years?\n" +
                "\n" +
                "Answer: 5%\n" +
                "\n" +
                "Explanation:\n" +
                "160 = (180*4*R)/100\n" +
                "R = 5%\n" +
                "\n" +
                "5.\tFind the simple interest on Rs.500 for 9 months at 6 paisa per month?\n" +
                "\n" +
                "\n" +
                "Answer: Rs. 270\n" +
                "\n" +
                "Explanation:\n" +
                "I = (500*9*6)/100 = 270\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
    }
}
