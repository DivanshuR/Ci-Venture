package com.lbsim.shreya.student;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class problemOnHcf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_on_hcf);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tFactors and Multiples:\n" +
                "If number a divided another number b exactly, we say that a is a factor of b.\n" +
                "In this case, b is called a multiple of a.\n" +
                "2.\tHighest Common Factor (H.C.F.) or Greatest Common Measure (G.C.M.) or Greatest Common Divisor (G.C.D.):\n" +
                "The H.C.F. of two or more than two numbers is the greatest number that divides each of them exactly.\n" +
                "There are two methods of finding the H.C.F. of a given set of numbers:\n" +
                "I.\tFactorization Method: Express the each one of the given numbers as the product of prime factors. The product of least powers of common prime factors gives H.C.F.\n" +
                "II.\tDivision Method: Suppose we have to find the H.C.F. of two given numbers, divide the larger by the smaller one. Now, divide the divisor by the remainder. Repeat the process of dividing the preceding number by the remainder last obtained till zero is obtained as remainder. The last divisor is required H.C.F.\n" +
                "Finding the H.C.F. of more than two numbers: Suppose we have to find the H.C.F. of three numbers, then, H.C.F. of [(H.C.F. of any two) and (the third number)] gives the H.C.F. of three given number.\n" +
                "Similarly, the H.C.F. of more than three numbers may be obtained.\n" +
                "3.\tLeast Common Multiple (L.C.M.):\n" +
                "The least number which is exactly divisible by each one of the given numbers is called their L.C.M.\n" +
                "There are two methods of finding the L.C.M. of a given set of numbers:\n" +
                "I.\tFactorization Method: Resolve each one of the given numbers into a product of prime factors. Then, L.C.M. is the product of highest powers of all the factors.\n" +
                "II.\tDivision Method (short-cut): Arrange the given numbers in a rwo in any order. Divide by a number which divided exactly at least two of the given numbers and carry forward the numbers which are not divisible. Repeat the above process till no two of the numbers are divisible by the same number except 1. The product of the divisors and the undivided numbers is the required L.C.M. of the given numbers.\n" +
                "4.\tProduct of two numbers = Product of their H.C.F. and L.C.M.\n" +
                "5.\tCo-primes: Two numbers are said to be co-primes if their H.C.F. is 1.\n" +
                "6.\tH.C.F. and L.C.M. of Fractions:\n" +
                "H.C.F.= H.C.F. of Numerator/L.C.M. of Denominator  \n" +
                "H.C.F.= L.C.M. of Numerator/H.C.F. of Denominator  \n" +
                "7.H.C.F. and L.C.M. of Decimal Fractions:\n" +
                "In a given numbers, make the same number of decimal places by annexing zeros in some numbers, if necessary. Considering these numbers without decimal point, find H.C.F. or L.C.M. as the case may be. Now, in the result, mark off as many decimal places as are there in each of the given numbers.\n" +
                "8.Comparison of Fractions:\n" +
                "Find the L.C.M. of the denominators of the given fractions. Convert each of the fractions into an equivalent fraction with L.C.M as the denominator, by multiplying both the numerator and denominator by the same number. The resultant fraction with the greatest numerator is the greatest.\n" +
                "\n" +
                "\n");
    }

    public void pracQues(View v) {
        Button b = (Button) findViewById(R.id.prac);
        try {
            Intent intent = new Intent(this, hcfQues.class);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }
}
