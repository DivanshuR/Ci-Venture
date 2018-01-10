package com.lbsim.shreya.student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class aptitude extends AppCompatActivity {

   Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude);
    }

    public void probOnTrain(View v){
       b=(Button)findViewById(R.id.trains);
        Intent intent=new Intent(this,trainQues.class);
        startActivity(intent);
    }
    public void probOnSI(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,siQues.class);
        startActivity(intent);
    }
    public void probOnRaces(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,siQues.class);
        startActivity(intent);
    }
    public void probOnProbability(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,probQues.class);
        startActivity(intent);
    }
    public void probOnBoats(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,boatsQues.class);
        startActivity(intent);
    }
    public void probOnhcf(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,hcfQues.class);
        startActivity(intent);
    }
    public void probOnAges(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,agesQues.class);
        startActivity(intent);
    }
    public void probOnStocks(View v){
        b=(Button)findViewById(R.id.si);
        Intent intent=new Intent(this,stocksQues.class);
        startActivity(intent);
    }
}
