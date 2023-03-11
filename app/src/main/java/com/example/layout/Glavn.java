package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Glavn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavn);
    }
    public void List(View v) {
        Intent intent = new Intent(Glavn.this, Listening.class);
        startActivity(intent);

    }
    public void Menu(View v) {
        Intent intent = new Intent(Glavn.this, Menu.class);
        startActivity(intent);

    }
}