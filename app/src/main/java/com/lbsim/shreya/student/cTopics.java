package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class cTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_topics);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tAre digital payments secure enough for the Indian economy to go cashless?\n" +
                "•\tBan 500, 1000 notes - Corruption Uprooted or just changing clothes!\n" +
                "•\tCan we dream of hosting the Olympics?\n" +
                "•\tChinese Goods vs Indian Goods\n" +
                "•\tDo we really need Smart Cities?\n" +
                "•\tEconomic growth is more important than Ecological protection\n" +
                "•\tEQ or IQ\n" +
                "•\tExtra curricular activities should be made compulsory in school\n" +
                "•\tFacebook needs to clarify policies on content removal!\n" +
                "•\tHow demonetization is affecting common people more than black money holders?\n" +
                "•\tHow is Technology impacting the Banking sector?\n" +
                "•\tIs compulsory attendance really needed in college?\n" +
                "•\tIs it fair to spare political parties from income tax investigation?\n" +
                "•\tIs the youth of India confident or confused?\n" +
                "•\tNon-execution of GST bill might herald end of present government\n" +
                "•\tOne India One Election - Pros and Cons\n" +
                "•\tPM's vision to make India a Manufacturing Hub - dream or a practical possibility?\n" +
                "•\tPolythene bags must be banned!\n" +
                "•\tProblems unite us, Religion divides us\n" +
                "•\tShould Hindi be the official language of India?\n" +
                "•\tShould national anthem be played in cinema halls?\n" +
                "•\tShould we change the present system of education in our country?\n" +
                "•\tSolution of corruption is a mirage till we catch top public figure\n" +
                "•\tWill Reliance Jio be a sustainable business model in a country like India?\n" +
                "•\tYouth in Politics\n");
        t.setTextSize(18);
    }
}
