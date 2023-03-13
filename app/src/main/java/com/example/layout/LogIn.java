package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class LogIn extends AppCompatActivity {

    EditText email;
    EditText password;
    Button button;
    SharedPreferences preferences;
    public static UserM users;
    final static String Email = "Email";
    final static String Password = "Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = findViewById(R.id.Email);
        button = findViewById(R.id.button2);

    }

    public void Registr(View v) {
        Intent intent = new Intent(LogIn.this, reg.class);
        startActivity(intent);
    }

    public void LogIn(View v) {
        Intent intent = new Intent(LogIn.this, Glavn.class);
        startActivity(intent);
    }
}