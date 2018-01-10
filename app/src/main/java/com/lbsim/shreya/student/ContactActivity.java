package com.lbsim.shreya.student;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class ContactActivity extends AppCompatActivity {

    private Button divanshu, shreya, ansh;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // Check the LogCat to get your test device ID
                .addTestDevice("ca-app-pub-3940256099942544/6300978111")
                .build();
        mAdView.loadAd(adRequest);


        divanshu = (Button) findViewById(R.id.divanshu);
        shreya = (Button) findViewById(R.id.shreya);
        ansh = (Button) findViewById(R.id.ansh);


        divanshu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent("android.intent.action.DIAL");
                callIntent.setData(Uri.parse("tel:9711333822"));
                startActivity(callIntent);

            }
        });
    }
}