package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {

    EditText   name , email , password;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);



        email = (EditText) findViewById(R.id.email);
        password  = (EditText) findViewById(R.id.pwd);
        name = (EditText) findViewById(R.id.name);

        signup = (Button) findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();

                if (email1.matches("")){
                    Toast.makeText(SignupActivity.this," Email can not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }

               /* if (password1.matches("")){
                    Toast.makeText(SignupActivity.this," Password can not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }*/


                if(!isValidPassword(password1)){
                    Toast.makeText(SignupActivity.this,"Invalid Passsword",Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                intent.putExtra("name",name1);
                intent.putExtra("email",email1);
                intent.putExtra("password",password1);

                startActivity(intent);
            }
        });
    }

    Pattern lowerCase = Pattern.compile("^.*[a-z].*$");
    Pattern upperCase = Pattern.compile("^.*[A-Z].*$");
    Pattern number = Pattern.compile("^.*[0-9].*$");
    Pattern special = Pattern.compile("^." +
            "*[@#$%^&*(){}<:;/].*$");


    private boolean isValidPassword(String password1) {
        if(password1.length() < 8){
            return false;
        }
        if(!lowerCase.matcher(password1).matches()){
            return false;
        }
        if(!upperCase.matcher(password1).matches()){
            return false;
        }
        if(!number.matcher(password1).matches()){
            return false;
        }
        if(!special.matcher(password1).matches()){
            return false;
        }
        return true;
    }
}