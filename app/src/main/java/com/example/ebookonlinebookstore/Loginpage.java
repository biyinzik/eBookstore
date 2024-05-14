package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        Button button4 = findViewById(R.id.button4);

        button4.setOnClickListener(view -> {
            Intent Home =new Intent(Loginpage.this, Home.class);
            startActivity(Home);
        });
        }
    }
