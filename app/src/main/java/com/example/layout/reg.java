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
        checkbox = (CheckBox) findViewById(R.id.checkBox4);
        edtPassword = (EditText) findViewById(R.id.editTextTextPassword3);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    // show password
                    edtPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password

                    edtPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
        checkbox1 = (CheckBox) findViewById(R.id.checkBox3);
        edtPassword1 = (EditText) findViewById(R.id.editTextTextPassword5);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (!isChecked) {
                    // show password
                    edtPassword1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password

                    edtPassword1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
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