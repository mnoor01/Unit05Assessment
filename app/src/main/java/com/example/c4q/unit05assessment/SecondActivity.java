package com.example.c4q.unit05assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView locationView,dobView,emailView;
    private ImageView infopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        locationView=findViewById(R.id.locationinfo);
        dobView=findViewById(R.id.dobinfo);
        emailView=findViewById(R.id.emailinfo);
        Intent intent= getIntent();
        String location= intent.getStringExtra("location");
        String email= intent.getStringExtra("email");
        String dob= intent.getStringExtra("dob");
        locationView.setText(location);
        emailView.setText(email);
        dobView.setText(dob);




    }
}
