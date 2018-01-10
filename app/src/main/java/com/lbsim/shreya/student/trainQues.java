package com.lbsim.shreya.student;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class trainQues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_ques);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("1.\tThe length of the bridge, which a train 130 metres long and travelling at 45 km/hr can cross in 30 seconds, is:\n" +
                "\n" +
                "Answer: 245m\n" +
                "\n" +
                "Explanation:\n" +
                "Speed = [45 X 5/18] m/sec = [25/2] m/sec Time = 30 sec Let the length of bridge be x metres. Then, (130 + x)/30 = 25/2 => 2(130 + x) = 750 => x = 245 m.\n" +
                "\n" +
                "\n" +
                "2.\tA train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?\n" +
                "\n" +
                "\n" +
                "Answer: 150m\n" +
                "\n" +
                "Explanation:\n" +
                "Speed=(60 * 5/18) m/sec = (50/3) m/sec Length of the train = (Speed x Time) = (50/3 * 9) m = 150 m.\n" +
                "\n" +
                "\n" +
                "3.\tA train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:\n" +
                "\n" +
                "\n" +
                "Answer: 50Km/hr\n" +
                "\n" +
                "Explanation:\n" +
                "Speed of the train relative to man = (125/10) m/sec = (25/2) m/sec. [(25/2) * (18/5)] km/hr = 45 km/hr. Let the speed of the train be x km/hr. Then, relative speed = (x - 5) km/hr. x - 5 = 45 ==> x = 50 km/hr.\n" +
                "\n" +
                "\n" +
                "4.\tThe length of the bridge, which a train 130 meters long and travelling at 45 km/hr can cross in 30 seconds, is:\n" +
                "\n" +
                "\n" +
                "Answer: 245m\n" +
                "\n" +
                "Explanation:\n" +
                "Speed = (45 * 5/18) m/sec = (25/2) m/sec. Time = 30 sec. Let the length of bridge be x meters. Then, (130 + X)/30 = 25/2 ==> 2(130 + X) = 750 ==> X = 245 m.\n" +
                "\n" +
                "\n" +
                "5.\tTwo trains running in opposite directions cross a man standing on the platform in 27 seconds and 17 seconds respectively and they cross each other in 23 seconds. The ratio of their speeds is:\n" +
                "\n" +
                "\n" +
                "Answer: 3:2\n" +
                "\n" +
                "Explanation:\n" +
                "Let the speeds of the two trains be x m/sec and y m/sec respectively. Then, length of the first train = 27 x meters, and length of the second train = 17 y meters. (27 x + 17 y) / (x + y) = 23 ==> 27 x + 17 y = 23 x + 23 y ==> 4 x = 6 y ==> x/y = 3/2.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


    }
}
