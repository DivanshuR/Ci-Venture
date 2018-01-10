package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class boatsQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boats_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tA person can swim in still water at 4 km/h. If the speed of water 2 km/h, how many hours will the man take to swim back against the current for 6km?\n" +
                "\n" +
                "Answer: 3\n" +
                "\n" +
                "Explanation:\n" +
                "M = 4\n" +
                "S = 2\n" +
                "US =  4 - 2 = 2\n" +
                "D = 6\n" +
                "T = 6/2 = 3\n" +
                "\n" +
                "\n" +
                "2.\tA man can row his boat with the stream at 6 km/h and against the stream in 4 km/h. The man's rate is?\n" +
                "Answer: 1kmph\n" +
                "\n" +
                "Explanation:\n" +
                "DS = 6\n" +
                "US = 4\n" +
                "S = ?\n" +
                "S = (6 - 4)/2 = 1 kmph\n" +
                "\n" +
                "\n" +
                "3.\tA man can swim in still water at 4.5 km/h, but takes twice as long to swim upstream than downstream. The speed of the stream is?\n" +
                "\n" +
                "\n" +
                "Answer: 1.5 \n" +
                "\n" +
                "Explanation:\n" +
                "M = 4.5\n" +
                "S = x\n" +
                "DS = 4.5 + x\n" +
                "US = 4.5 + x\n" +
                "4.5 + x = (4.5 - x)2\n" +
                "4.5 + x = 9 -2x\n" +
                "3x = 4.5\n" +
                "x = 1.5\n" +
                "\n" +
                "\n" +
                "4.\tA man can row with a speed of 15 kmph in still water. If the stream flows at 5 kmph, then the speed in downstream is?\n" +
                "\n" +
                "\n" +
                "Answer:20\n" +
                "\n" +
                "Explanation:\n" +
                "M = 15\n" +
                "S = 5\n" +
                "DS = 15 + 5 = 20\n" +
                "\n" +
                "\n" +
                "\n");
    }
}
