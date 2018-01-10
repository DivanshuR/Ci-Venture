package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class probQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tThe probability that a number selected at random from the first 50 natural numbers is a composite number is -.\n" +
                "\n" +
                "Answer: 17/25\n" +
                "\n" +
                "Explanation:\n" +
                "The number of exhaustive events = ⁵⁰C₁ = 50.\n" +
                "We have 15 primes from 1 to 50.\n" +
                "Number of favorable cases are 34.\n" +
                "Required probability = 34/50 = 17/25.\n" +
                "\n" +
                "\n" +
                "2.\tA coin is tossed live times. What is the probability that there is at the least one tail?\n" +
                "\n" +
                "\n" +
                "Answer: 31/32\n" +
                "\n" +
                "Explanation:\n" +
                "Let P(T) be the probability of getting least one tail when the coin is tossed five times.\n" +
                "P(T) = There is not even a single tail.\n" +
                "i.e. all the outcomes are heads.\n" +
                "P(T)’= 1/32 ; P(T) = 1 - 1/32 = 31/32\n" +
                "\n" +
                "\n" +
                "3.\tIf a number is chosen at random from the set {1, 2, 3, ...., 100}, then the probability that the chosen number is a perfect cube is -.\n" +
                "\n" +
                "\n" +
                "Answer: 1/25\n" +
                "\n" +
                "Explanation:\n" +
                "We have 1, 8, 27 and 64 as perfect cubes from 1 to 100.\n" +
                "Thus, the probability of picking a perfect cube is\n" +
                "4/100 = 1/25.\n" +
                "\n" +
                "\n" +
                "4.\tOut of first 20 natural numbers, one number is selected at random. The probability that it is either an even number or a prime number is -.\n" +
                "\n" +
                "\n" +
                "Answer: 17/20\n" +
                "\n" +
                "Explanation:\n" +
                "n(S) = 20\n" +
                "n(Even no) = 10 = n(E)\n" +
                "n(Prime no) = 8 = n(P)\n" +
                "P(EᴜP) = 10/20 + 8/20 - 1/20 = 17/20\n" +
                "\n" +
                "\n" +
                "5.\tIf two dice are thrown together, the probability of getting an even number on one die and an odd number on the other is -.\n" +
                "\n" +
                "\n" +
                "Answer: 1/2\n" +
                "\n" +
                "Explanation:\n" +
                "The number of exhaustive outcomes is 36.\n" +
                "Let E be the event of getting an even number on one die and an odd number on the other. Let the event of getting either both even or both odd then P(E)’ = 18/36 = 1/2\n" +
                "P(E) = 1 - 1/2 = 1/2.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
    }
}
