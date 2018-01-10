package com.lbsim.shreya.student;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class LoginActivity extends AppCompatActivity {
    private Button student, faculty, contact, about;
    private AdView mAdView;
    private ViewFlipper simpleViewFlipper;
    int[] images = {R.drawable.ci, R.drawable.imagess, R.drawable.banner};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // get The references of ViewFlipper
        simpleViewFlipper = (ViewFlipper) findViewById(R.id.simpleViewFlipper); // get the reference of ViewFlipper

        // loop for creating ImageView's
        for (int i = 0; i < images.length; i++) {
            // create the object of ImageView
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(images[i]); // set image in ImageView
            simpleViewFlipper.addView(imageView); // add the created ImageView in ViewFlipper
        }
        // Declare in and out animations and load them using AnimationUtils class
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        // set the animation type's to ViewFlipper
        simpleViewFlipper.setInAnimation(in);
        simpleViewFlipper.setOutAnimation(out);
        // set interval time for flipping between views
        simpleViewFlipper.setFlipInterval(7000);
        // set auto start for flipping between views
        simpleViewFlipper.setAutoStart(true);



        student = (Button) findViewById(R.id.student);
        faculty = (Button) findViewById(R.id.faculty);
        contact = (Button) findViewById(R.id.contact);
        about = (Button) findViewById(R.id.about);


        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view.getId() == R.id.student) {
                    Intent stu = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(stu);
                }
            }
        });

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.faculty) {
                    Intent fac = new Intent(LoginActivity.this, FacultyActivity.class);
                    startActivity(fac);
                }
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.contact) {
                    Intent con = new Intent(LoginActivity.this, ContactActivity.class);
                    startActivity(con);
                }
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.about) {
                    Intent abo = new Intent(LoginActivity.this, AboutActivity.class);
                    startActivity(abo);
                }
            }
        });


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // Check the LogCat to get your test device ID
                .addTestDevice("ca-app-pub-3940256099942544/6300978111")
                .build();
        mAdView.loadAd(adRequest);

    }}

