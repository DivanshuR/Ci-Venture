package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hcfQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcf_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1. \tFind the greatest number that will divide 43, 91 and 183 so as to leave the same remainder in each case.\n" +
                "\n" +
                "\n" +
                "Answer:4\n" +
                "Explanation:\n" +
                "Required number = H.C.F. of (91 - 43), (183 - 91) and (183 - 43)\n" +
                "     = H.C.F. of 48, 92 and 140 = 4.\n" +
                "\n" +
                "2. \tThe H.C.F. of two numbers is 23 and the other two factors of their L.C.M. are 13 and 14. The larger of the two numbers is:\n" +
                "\n" +
                "\n" +
                "Answer: 322\n" +
                "\n" +
                "Explanation:\n" +
                "Clearly, the numbers are (23 x 13) and (23 x 14).\n" +
                " \tLarger number = (23 x 14) = 322.\n" +
                "\n" +
                "3. \tLet N be the greatest number that will divide 1305, 4665 and 6905, leaving the same remainder in each case. Then sum of the digits in N is:\n" +
                "\n" +
                "\n" +
                "Answer: 4\n" +
                "\n" +
                "Explanation:\n" +
                "N = H.C.F. of (4665 - 1305), (6905 - 4665) and (6905 - 1305)\n" +
                "  = H.C.F. of 3360, 2240 and 5600 = 1120.\n" +
                "Sum of digits in N = ( 1 + 1 + 2 + 0 ) = 4\n" +
                "\n" +
                "4.\tThe greatest number of four digits which is divisible by 15, 25, 40 and 75 is:\n" +
                "\n" +
                "\n" +
                "Answer: 9600\n" +
                "\n" +
                "Explanation:\n" +
                "Greatest number of 4-digits is 9999.\n" +
                "L.C.M. of 15, 25, 40 and 75 is 600.\n" +
                "On dividing 9999 by 600, the remainder is 399.\n" +
                " \tRequired number (9999 - 399) = 9600.\n" +
                "\n" +
                ". 5.\tThe product of two numbers is 4107. If the H.C.F. of these numbers is 37, then the greater number is:\n" +
                "\n" +
                "\n" +
                "Answer: 111\n" +
                "\n" +
                "Explanation:\n" +
                "Let the numbers be 37a and 37b.\n" +
                "Then, 37a x 37b = 4107\n" +
                "  ab = 3.\n" +
                "Now, co-primes with product 3 are (1, 3).\n" +
                "So, the required numbers are (37 x 1, 37 x 3) i.e., (37, 111).\n" +
                "  Greater number = 111.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");
    }
}
