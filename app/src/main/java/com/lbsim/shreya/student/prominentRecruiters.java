package com.lbsim.shreya.student;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class prominentRecruiters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prominent_recruiters);
    }
    public void company_ttn(View v){
        Uri uri = Uri.parse("http://www.tothenew.com/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void company_nagarro(View v){
        Uri uri = Uri.parse("http://www.nagarro.com/us/en"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void company_exp(View v){
        Uri uri = Uri.parse("http://www.expicient.com"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void company_ivp(View v){
        Uri uri = Uri.parse("https://www.ivp.in/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void company_knoldus(View v){
        Uri uri = Uri.parse("http://www.knoldus.com/home.knol"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
