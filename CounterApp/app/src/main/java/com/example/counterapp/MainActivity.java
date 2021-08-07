package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start , stop;
    TextView countertext;
    Handler customHandler = new Handler();
    int  i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start =(Button) findViewById(R.id.startbut);
        stop =(Button) findViewById(R.id.stopbut);

        countertext = (TextView) findViewById(R.id.counter);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customHandler.postDelayed(updateTimerThread,0);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customHandler.removeCallbacks(updateTimerThread);
            }
        });

    }


        private final Runnable updateTimerThread = new Runnable() {
            @Override
            public void run() {
                countertext.setText(""+i);
                customHandler.postDelayed(this,1000);
                i++;
            }
        };

}