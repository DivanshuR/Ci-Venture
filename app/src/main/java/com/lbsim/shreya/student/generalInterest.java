package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class generalInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_interest);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tIs India a Soft Nation?\n" +
                "•\tShould Research on Human Cloning be banned?\n" +
                "•\tShould Sting Operations be Carried Out?\n" +
                "•\tNuclear War cannot be won and should not be fought\n" +
                "•\tIs Swapping Terrorists for Hostages an Encouragement to Plane-Hijackers?\n" +
                "•\tBrain-Drain has to be stopped\n" +
                "•\tDoctors' Accountability to Improve Health-Care\n" +
                "•\tUniversal Disarmament is a Must\n" +
                "•\tIs India Aping the Western Obsession with Celebrities?\n" +
                "•\tIndia at 60: A Senior Citizen?\n" +
                "•\tUnrest in Countries around India\n" +
                "•\tFlexi Timings or Fixed Timings - Which is better at Work?\n" +
                "•\tIndividual Brilliance Certainly makes a Difference\n" +
                "•\tIs Paperless Office a Reality or Not?\n" +
                "•\tRules & Regulation Breed Corruption\n" +
                "•\tDo NGOs in India Really Work for Others OR Work for their Own Vested Interests?\n" +
                "•\tScience Is A Boon Or Bane\n" +
                "•\tShould Animals be used for Testing New Drugs & Medical Procedures?\n" +
                "•\tSecurity Cameras & Privacy\n" +
                "•\tAdvertisements Cheat People, Hence Should Be Banned\n" +
                "•\tBorderless World: A Threat?\n" +
                "•\tBorderless World: A Myth or Reality?\n" +
                "•\tSecularism has become a Tool to Justify the Wrongs done by the Minorities\n" +
                "•\tWhat is the Difference between People who do Things Rightly and People who do Right Things?\n" +
                "•\tCorruption is a Necessary Evil for Success in Any Sphere\n" +
                "•\tBeauty Pageants are a Must\n" +
                "•\tHow to Deal with International Terrorism?\n" +
                "•\tAre Peace and Non-Violence Outdated Concepts?\n" +
                "•\tIndian Army as a Career Option\n" +
                "•\tCapital Punishment should be Banned or Allowed?\n" +
                "•\tIs Dependence on Computers a Good Thing?\n");
        t.setTextSize(18);
    }
}
