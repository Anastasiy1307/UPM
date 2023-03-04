package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class LogIn extends AppCompatActivity {

    private AppCompatAutoCompleteTextView autoTextView;
    private AppCompatAutoCompleteTextView autoTextViewCustom;
    private android.widget.EditText edtPassword;
    private CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        checkbox = (CheckBox) findViewById(R.id.checkBox2);
        edtPassword = (EditText) findViewById(R.id.editTextTextPassword);
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
    }
    public void Registr(View v) {
        Intent intent = new Intent(LogIn.this, reg.class);
        startActivity(intent);

    }
}