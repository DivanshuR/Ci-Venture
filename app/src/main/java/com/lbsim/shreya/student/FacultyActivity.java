package com.lbsim.shreya.student;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class FacultyActivity extends AppCompatActivity {

    private AdView mAdView;
    private  Button facsign,facback,facres;
    private EditText facmail,facpass;

    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // Check the LogCat to get your test device ID
                .addTestDevice("ca-app-pub-3940256099942544/6300978111")
                .build();
        mAdView.loadAd(adRequest);


        facsign = (Button) findViewById(R.id.facsign);
        //facres=(Button)findViewById(R.id.facres);
        facmail = (EditText) findViewById(R.id.facemail);
        facpass = (EditText) findViewById(R.id.facpass);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        facback = (Button) findViewById(R.id.facback);




       /* facres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FacultyActivity.this, StudentActivity.class));

            }
        });*/

    }}