package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class educationTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_topics);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tIf Winning isn't everything, why do they Keep the Score?\n" +
                "•\tCricket in India has lost its Sheen\n" +
                "•\tIs T20 Cricket killing Real Cricketing Skills?\n" +
                "•\tSix Billion and One Bronze!\n" +
                "•\tAre Cricketers to be blamed for Match Fixing?\n" +
                "•\tModern Day Sport in Industrialized Society is an Industry\n" +
                "•\tCricket as a National Obsession is a Detriment to Other Sports\n" +
                "•\tAdvantages of Co-education\n" +
                "•\tExaminations - has it killed education\n" +
                "•\tDo we really Need Education to be Successful?\n" +
                "•\tGovernment Control in Higher Education is Interfering and Not Required\n" +
                "•\tPrivatization of Higher Education\n" +
                "•\tShould the Government Set-up More IITs and IIMs, OR should it be use the Money for Primary & Secondary Education?\n" +
                "•\tForeign Universities in India\n" +
                "•\tE-Learning: A Substitute for Classroom Learning?\n" +
                "•\tIs Reservation in Higher Education Only Alternative for Social Equality?\n" +
                "•\tPrivate Educational Institutions: Good or Bad\n" +
                "•\tShould Management Education be subsidized?\n" +
                "•\tHow effective are Indian B-schools?\n");
        t.setTextSize(18);
    }
}
