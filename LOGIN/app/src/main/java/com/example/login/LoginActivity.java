package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText  lemail , lpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lemail = (EditText) findViewById(R.id.email);
        lpassword = (EditText) findViewById(R.id.pwd);
        login = (Button) findViewById(R.id.login);

        String regemail= getIntent().getStringExtra("email");

        String regpassword = getIntent().getStringExtra("password");


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newemail = lemail.getText().toString();
                String newpassword = lpassword.getText().toString();


                if(regemail.equals(newemail)&&regpassword.equals(newpassword)){
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,WelcomeActivity.class);
                    startActivity(intent);
                    lemail.setText("");
                    lpassword.setText("");
                }
                else{
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}