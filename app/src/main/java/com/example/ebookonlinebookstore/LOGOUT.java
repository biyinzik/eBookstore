package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LOGOUT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        ImageView home1 = findViewById(R.id.home1);
        home1.setOnClickListener(view -> {
            Intent activity_home =new Intent(LOGOUT.this, Home.class);
            startActivity(activity_home);
        });
    }
    }
