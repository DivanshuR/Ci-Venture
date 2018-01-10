package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class agesQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ages_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tRaju age after 15 years will be 5 times his age 5 years back, What is the present age of Raju.\n" +
                "\n" +
                "\n" +
                "Answer: 10\n" +
                "\n" +
                "Explanation:\n" +
                "Clearly,\n" +
                "x+15 = 5(x-5) \n" +
                "<=> 4x = 40 => x = 10\n" +
                "\n" +
                "\n" +
                "2.\tSachin is younger than Rahul by 7 years. If the ratio of their ages is 7:9, find the age of Sachin\n" +
                "\n" +
                "\n" +
                "Answer: 24.5\n" +
                "\n" +
                "Explanation:\n" +
                "If Rahul age is x, then Sachin age is x-7,\n" +
                "so (x-7)/x = 7/9\n" +
                "=> 9x-63 = 7x \n" +
                "=> 2x = 63\n" +
                "=> x = 31.5\n" +
                "\n" +
                "So Sachin age is 31.5 - 7 = 24.5 \n" +
                "\n" +
                "\n" +
                "3. The ratio between the present ages of P and Q is 6:7. If Q is 4 years old than P, what will be the ratio of the ages of P and Q after 4 years\n" +
                "\n" +
                "\n" +
                "Answer: 7:8\n" +
                "\n" +
                "Explanation:\n" +
                "Let P age and Q age is 6x years and 7x years.\n" +
                "Then 7x - 6x = 4 <=> x = 4\n" +
                "\n" +
                "So required ratio will be (6x+4): (7x+4) => 28:32 => 7:8\n" +
                "\n" +
                "\n" +
                "4. Ages of two persons differ by 16 years. If 6 year ago, the elder one be 3 times as old the younger one, find their present age\n" +
                "\n" +
                "\n" +
                "Answer: 30\n" +
                "\n" +
                "Explanation:\n" +
                "Let the age of younger person is x,\n" +
                "Then elder person age is (x+16)\n" +
                "=> 3(x-6) = (x+16-6) [6 years before]\n" +
                "=> 3x-18 = x+10\n" +
                "=> x = 14.\n" +
                "So other person age is x + 16 = 30\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
    }
}
