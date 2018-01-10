package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_topics);
        TextView t=(TextView)findViewById(R.id.tv);
        t.setText("•\tWe Need More Entrepreneurs than Managers\n" +
                "•\tRise in MBA Salaries is Not Sustainable in the Long Run\n" +
                "•\tCan One Contribute to the Social Sector while Being Employed in the Corporate World?\n" +
                "•\tThe Rush for MBA is really a Rush for Big Money\n" +
                "•\tWill Mumbai's Film Industry ever evolve into a Truly Modern Corporative One?\n" +
                "•\tIndians Perform Better as Individuals than in Groups/Teams\n" +
                "•\tPositive Attitude and not Knowledge is required for Business Success\n" +
                "•\tAre Ethics just Business Pretense?\n" +
                "•\tEthics in Business are just a passing fashion\n" +
                "•\tIs an MBA necessary to succeed in life?\n" +
                "•\tFamily owned business vs. professionally run businesses\n" +
                "•\tSmaller businesses and start-ups have more scope for professional growth.\n" +
                "•\tDot com or doubt com?\n" +
                "•\tManagerial skills learnt in the classroom can never match those learnt from experience\n" +
                "•\tManagement Education in India\n" +
                "•\tIs Leaders Born or are they made in Business Schools?\n" +
                "•\tIs Management an Art or a Science?\n" +
                "•\tThe objective of Management is to maximize profits\n" +
                "•\tShould GD be Part of Campus Placements?\n" +
                "•\tRole of Ethics in Business\n" +
                "•\tIs Management Education Required for Business?\n" +
                "•\tWhether Hard-Working or Smart-Working is Desirable?\n" +
                "•\tWomen are better at Multi-Tasking\n" +
                "•\tDoes Morality have an Essence in Corporate Life?\n" +
                "•\tRetention of Employees\n" +
                "•\tDo Women make Good Managers?\n" +
                "•\tCelebrity Brand Endorsement: Effective Advertising?\n" +
                "•\tThe Salaries that MBAs Get is more than they deserve\n" +
                "•\tEngineering Students are wasting their Time in Management Studies; they have Another Way to go\n" +
                "•\tMBA in India is highly Over-rated\n" +
                "\n");
        t.setTextSize(18);
    }
}
