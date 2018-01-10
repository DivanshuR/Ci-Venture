package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class stocksQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1. \tIn order to obtain an income of Rs. 650 from 10% stock at Rs. 96, one must make an investment of: \n" +
                "\n" +
                "Answer: Rs. 6240\n" +
                "Explanation:\n" +
                "To obtain Rs. 10, investment = Rs. 96.\n" +
                "To obtain Rs. 650,investment= Rs.(96/10)*650=Rs. 6240\n" +
                "\n" +
                "2.  Discover the expense of Rs 16000, 6% stock at 84.\n" +
                "\n" +
                "Answer –Rs. 13440\n" +
                "Explanation\n" +
                "Cost of Rs 100 stock=Rs 84. \n" +
                "Expense of Rs 16000 stock =Rs (84/100*16000) =Rs 13440. \n" +
                "\n" +
                "\n" +
                "3. Discover the expense of Rs 4500, 5% stock at 4 premiums.\n" +
                "Answer –Rs.4680\n" +
                "Explanation\n" +
                "Cost of Rs 100 stock=Rs (100+4) +Rs104. \n" +
                "Expense of Rs 4500 stock =Rs (104/100*4500) =Rs 4680. \n" +
                "\n" +
                "4. Discover the expense of Rs 5000, 8% stock at 12 markdowns.\n" +
                "Answer –Rs.4400\n" +
                "Explanation\n" +
                "Cost of Rs 100 stock =Rs (100-12) =Rs 88. \n" +
                "Expense of Rs 5000 stock = Rs (88/100*5000) =Rs 4400 \n" +
                "\n" +
                "\n");
    }
}
