package com.t2004eandroid.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

import com.t2004eandroid.R;

public class RegisterActivity extends AppCompatActivity {
   EditText firstName,lastName,password,address,phone,avatar,gender,email,birthday;
   Button register;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initData();
    }
    public void initData(){
        firstName = findViewById(R.id.inputUsername);
        lastName = findViewById(R.id.inputLastName);
        password = findViewById(R.id.inputPassword);
        address = findViewById(R.id.inputAddress);
        phone = findViewById(R.id.inputPhone);
        avatar = findViewById(R.id.inputAvatar);
        gender = findViewById(R.id.inputGender);
        email = findViewById(R.id.inputEmail);
        birthday = findViewById(R.id.inputBirthday);
        register = findViewById(R.id.btnRegister);
    }

}