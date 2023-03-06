package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;


public class LogIn extends AppCompatActivity {

    EditText email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = findViewById(R.id.Email);
        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateEmailAddress(email);

            }
        });
    }

    private boolean validateEmailAddress(EditText email) {
        String emailInput = email.getText().toString();
        if (!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            Intent intent = new Intent(LogIn.this, Glavn.class);
            startActivity(intent);
            Toast.makeText(this,"Все хорошо",Toast.LENGTH_SHORT).show();
            return true;
        } else{
            Toast.makeText(this,"Введен неправильный Email",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    public void Registr(View v) {
        Intent intent = new Intent(LogIn.this, reg.class);
        startActivity(intent);

    }
}