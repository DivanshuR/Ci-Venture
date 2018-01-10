package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnStocks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_stocks);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tStock Capital:\n" +
                "The total amount of money needed to run the company is called the stock capital.\n" +
                "2.\tShares or Stock:\n" +
                "The whole capital is divided into small units, called shares or stock.\n" +
                "For each investment, the company issues a 'share-certificate', showing the value of each share and the number of shares held by a person.\n" +
                "The person who subscribes in shares or stock is called a share holder or stock holder.\n" +
                "3.\tDividend:\n" +
                "The annual profit distributed among share holders is called dividend.\n" +
                "Dividend is paid annually as per share or as a percentage.\n" +
                "4.\tFace Value:\n" +
                "The value of a share or stock printed on the share-certificate is called its Face Value or Nominal Value or Par Value.\n" +
                "5.\tMarket Value:\n" +
                "The stock of different companies are sold and bought in the open market through brokers at stock-exchanges. A share or stock is said to be:\n" +
                "i.\tAt premium or Above par, if its market value is more than its face value.\n" +
                "ii.\tAt par, if its market value is the same as its face value.\n" +
                "iii.\tAt discount or Below par, if its market value is less than its face value.\n" +
                "Thus, if a Rs. 100 stock is quoted at premium of 16, then market value of the stock = Rs.(100 + 16) = Rs. 116.\n" +
                "Likewise, if a Rs. 100 stock is quoted at a discount of 7, then market value of the stock = Rs. (100 -7) = 93.\n" +
                "6.\tBrokerage:\n" +
                "The broker's charge is called brokerage.\n" +
                "(i)  When stock is purchased, brokerage is added to the cost price.\n" +
                "(ii) When stock is sold, brokerage is subtracted from the selling price.\n" +
                "Remember:\n" +
                "i.\tThe face value of a share always remains the same.\n" +
                "ii.\tThe market value of a share changes from time to time.\n" +
                "iii.\tDividend is always paid on the face value of a share.\n" +
                "iv.\tNumber of shares held by a person\n" +
                "\n" +
                "=Total Investment/Investment in 1 share\n" +
                "=Total Income/Income from 1 share\n" +
                "=Total Face Value/Face of 1 share.\n" +
                "7.Thus, by a Rs. 100, 9% stock at 120, we mean that:\n" +
                "i.\tFace Value of stock = Rs. 100.\n" +
                "ii.\tMarket Value (M.V) of stock = Rs. 120.\n" +
                "iii.\tAnnual dividend on 1 share = 9% of face value = 9% of Rs. 100 = Rs. 9.\n" +
                "iv.\tAn investment of Rs. 120 gives an annual income of Rs. 9.\n" +
                "v.\tRate of interest p.a   =   Annual income from an investment of Rs. 100 (=7.5%)\n" +
                "\n");
    }
    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, stocksQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
