package com.example.ebookonlinebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//Linking from button named trend
        Button trend = findViewById(R.id.trend);
        trend.setOnClickListener(view -> {
            Intent trending_books =new Intent(Home.this, TrendingBooks.class);
            this.startActivity(trending_books);
        });




        //Linking from button named home2
         ImageView bookmark1 = findViewById(R.id.bookmark1);
            bookmark1.setOnClickListener(view -> {
            Intent activity_ebook_store =new Intent(Home.this, eBookStore.class);
            this.startActivity(activity_ebook_store);
        });


        //Linking from button named Cart1
        ImageView cart1 = findViewById(R.id.cart1);
        cart1.setOnClickListener(view -> {
            Intent activity_payments  =new Intent(Home.this, Payments.class);
            this.startActivity(activity_payments );
        });

 }
}