package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class politicsTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics_topics);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tShould voters be given a NOTA (None Of The Above) choice?\n" +
                "•\tIs our Political System Reason for our Backwardness?\n" +
                "•\tEducational qualification for Politicians\n" +
                "•\tNecessity of Women Quota Bill for Women Empowerment\n" +
                "•\tVoters, not Political Parties, are Responsible for the Criminalization of Politics\n" +
                "•\tShould We Pursue our Policy of Dialogue with Pakistan?\n" +
                "•\tThe Way Forward for India is to Join Hands with Pakistan on Nuclear Matters\n" +
                "•\tNeed for Good Leaders in India\n" +
                "•\tPolitics is run by the Barrel of Gun\n" +
                "•\tRetirement Age for Politicians\n" +
                "•\tCorruption is the Price we pay for Democracy\n" +
                "•\tWhat India needs is a Dictatorship?\n" +
                "•\tValue-based Politics is the Need of the Hour\n" +
                "•\tReligion should not be mixed with Politics\n" +
                "•\tDemocracy is Hampering India's Progress\n" +
                "•\tShould Tainted Ministers Allowed to Contest Elections?\n" +
                "•\tPresidential v/s Parliamentary Form of Government in India\n" +
                "•\tReservations in the Private Sector\n" +
                "•\tDecreasing defense expenditure and increasing social expenditure is the need of the hour\n" +
                "•\tIndia should go for the presidential form of democracy\n");
        t.setTextSize(18);
    }
}
