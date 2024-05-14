package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);


        //Linking from button named Paynow
        Button paynow1 = findViewById(R.id.paynow1);
        paynow1.setOnClickListener(view -> {
            Intent activity_payments =new Intent(Payments.this,logout.class);
            this.startActivity(activity_payments);
        });

    }
