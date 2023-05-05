package com.robby.dicoding.cekgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        getSupportActionBar().setTitle("About Me");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}