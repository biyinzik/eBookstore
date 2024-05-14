package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class eBookStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook_store);

       TextView travel = findViewById(R.id.textView56);
        travel.setOnClickListener(view -> {
            Intent activity_travel =new Intent(eBookStore.this, Travel.class);
            this.startActivity(activity_travel);
        });

    }
    }

