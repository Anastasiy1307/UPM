package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class reg extends AppCompatActivity {

    private AppCompatAutoCompleteTextView autoTextView;
    private AppCompatAutoCompleteTextView autoTextViewCustom;
    private android.widget.EditText edtPassword;
    private CheckBox checkbox;
    private android.widget.EditText edtPassword1;
    private CheckBox checkbox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void Con(View v) {
        Intent intent = new Intent(this, Congr.class);
        startActivity(intent);

    }


    public void LogIn(View v) {
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);

    }
}