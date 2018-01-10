package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class socialTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_topics);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tTerrorism in India\n" +
                "•\tReligion should not be mixed with politics\n" +
                "•\tShould Smoking be Banned Completely?\n" +
                "•\tEffects of Television on Youth\n" +
                "•\tLove Marriages Vs Arranged Marriages\n" +
                "•\tAre beauty contests degrading womanhood?\n" +
                "•\tFilms are corrupting the Indian Youth\n" +
                "•\tMorals & Values among Indians is Degenerating\n" +
                "•\tCensorship in Movies & Our Culture\n" +
                "•\tForeign Television Channels are Destroying Our Culture\n" +
                "•\tWith Media Publishing and Telecasting Trivia, Censorship is the Need of the Hour\n" +
                "•\tWomen are not fit for Defense Services\n" +
                "•\tWomen Empowerment - A Cause for Increasing Divorce Rate in India\n" +
                "•\tShowing Violence and Crimes should not be allowed in films and on television.\n" +
                "•\tClassical Music Heritage and the Growing Pop-Culture\n" +
                "•\tIndividual Freedom and Civil Society\n" +
                "•\tInfluence of Online Social Networks on our Youth\n" +
                "•\tIs Remixing Good Trend in Music?\n" +
                "•\tBride burning and dowry may look bad, but are an integral part of India.\n" +
                "•\tOur Culture is Decaying\n" +
                "•\tWe are not serious about saving Wildlife/Environment\n" +
                "•\tThe education system needs serious reforms\n" +
                "•\tThe Internet is an exercise in hype\n" +
                "•\tMarriage is a social trap\n");
        t.setTextSize(18);
    }
}
