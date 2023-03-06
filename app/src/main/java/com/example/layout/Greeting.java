package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
    }
    public void Reg(View v) {
        Intent intent = new Intent(Greeting.this, reg.class);
        startActivity(intent);
    }
    public void Log(View v) {
        Intent intent = new Intent(Greeting.this, LogIn.class);
        startActivity(intent);
    }
}