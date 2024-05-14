package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView button4 = findViewById(R.id.button4);
        button4.setOnClickListener(view -> {
            Intent register =new Intent(Register.this, Loginpage.class);
            this.startActivity(register);
        });


    }
}