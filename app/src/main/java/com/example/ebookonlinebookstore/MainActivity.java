package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getstarted = findViewById(R.id.getStarted);

        getstarted.setOnClickListener(view -> {
            Intent register=new Intent(MainActivity.this, Register.class);
            startActivity(register);
        });
    }



}