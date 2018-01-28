package com.example.c4q.unit05assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView infos;
    private ImageView infopic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        infos=findViewById(R.id.infos);
        Intent intent= getIntent();
        String location= intent.getStringExtra("location");
        String email= intent.getStringExtra("email");
        String dob= intent.getStringExtra("dob");
        infos.setText(location+" "+email+" "+dob);

    }
}
