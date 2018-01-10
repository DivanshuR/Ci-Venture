package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class creativeTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative_topics);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tA Ship Docked in Harbor cannot face the Storms\n" +
                "•\tDo Beauty and Brains Go Together?\n" +
                "•\tEvery Cloud has a Silver Lining\n" +
                "•\tRules are Meant to be Broken\n" +
                "•\tFood Comes First, Ethics Later\n" +
                "•\tLet Sleeping Dogs Lie\n" +
                "•\tThere is No Right Way of Doing the Wrong Thing\n" +
                "•\tIs Love Precious or Poisonous?\n" +
                "•\tIs God Male?\n" +
                "•\tGood Things Always Come from Good Thinking\n" +
                "•\tIn Today's World, Everything is Uncertain except Death & Taxes\n" +
                "•\tMen are from Mars; Women are from Venus\n" +
                "•\tCleanliness is a Fundamental Responsibility of an Indian Citizen\n" +
                "•\tA Person should not be too honest; Straight Trees are cut first\n" +
                "•\tNice Guys Finish Last\n" +
                "•\tAll Work and No Play Makes Jack a Dull Boy\n" +
                "•\tThe Wheel is Turning Round and Round\n" +
                "•\tIf I was the Finance Minister/Prime Minister\n" +
                "•\tGroup Task: How can we have Mount Everest in India?\n" +
                "•\tWhen I woke up in the morning I saw?\n" +
                "•\tUp the Down Staircase\n" +
                "•\tJust as we have smoke free zones, we should have child free zones\n" +
                "•\tThe Nostradamus Code: World War III\n");
        t.setTextSize(18);

    }
}
