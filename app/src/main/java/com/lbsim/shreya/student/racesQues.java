package com.lbsim.shreya.student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class racesQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_races_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tIn a kilometer race, A beats B by 50 meters or 10 seconds. What time does A take to complete the race?\n" +
                "\n" +
                "Answer: 190sec\n" +
                "\n" +
                "Explanation:\n" +
                "Time taken by B run 1000 meters = (1000 * 10)/50 = 200 sec.\n" +
                "Time taken by A = 200 - 10 = 190 sec.\n" +
                "\n" +
                "\n" +
                "2.\tA can give B 100 meters start and C 200 meters start in a kilometer race. How much start can B give C in a kilometer race?\n" +
                "\n" +
                "Answer: 111.12m\n" +
                "\n" +
                "Explanation:\n" +
                "A runs 1000 m while B runs 900 m and C runs 800 m.\n" +
                "The number of meters that C runs when B runs 1000 m,\n" +
                "= (1000 * 800)/900 = 8000/9 = 888.88 m.\n" +
                "B can give C = 1000 - 888.88 = 111.12 m.\n" +
                "\n" +
                "\n" +
                "3.\tA can run a kilometer race in 4 1/2 min while B can run same race in 5 min. How many meters start can A give B in a kilometer race, so that the race mat end in a dead heat?\n" +
                "\n" +
                "Answer: 100m\n" +
                "\n" +
                "Explanation:\n" +
                "A can give B (5 min - 4 1/2 min) = 30 sec start.\n" +
                "The distance covered by B in 5 min = 1000 m.\n" +
                "Distance covered in 30 sec = (1000 * 30)/300 = 100 m.\n" +
                "A can give B 100m start.\n" +
                "\n" +
                "\n" +
                "4.\tIn a race of 1000 m, A can beat by 100 m, in a race of 800m, B can beat C by 100m. By how many meters will A beat C in a race of 600 m?\n" +
                "\n" +
                "Answer: 127.5m\n" +
                "\n" +
                "Explanation:\n" +
                "When A runs 1000 m, B runs 900 m and when B runs 800 m, C runs 700 m.\n" +
                "When B runs 900 m, distance that C runs = (900 * 700)/800 = 6300/8 = 787.5 m.\n" +
                "In a race of 1000 m, A beats C by (1000 - 787.5) = 212.5 m to C.\n" +
                "In a race of 600 m, the number of meters by which A beats C = (600 * 212.5)/1000 = 127.5 m.\n" +
                "\n" +
                "\n" +
                "\n");
    }
}
