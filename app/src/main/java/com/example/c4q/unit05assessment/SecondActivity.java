package com.example.c4q.unit05assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {
    private TextView locationView, dobView, emailView;
    private ImageView infopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String location = intent.getStringExtra("location");
        String dob = intent.getStringExtra("dob");
        String image =intent.getStringExtra("picture");

        locationView = findViewById(R.id.locationinfo);
        dobView = findViewById(R.id.dobinfo);
        emailView = findViewById(R.id.emailinfo);
        infopic=findViewById(R.id.infopic);
        emailView.setText(email);
        locationView.setText(location);
        dobView.setText(dob);
        Picasso.with(this).load(image).resize(400,400).centerCrop().into(infopic);


    }
}
