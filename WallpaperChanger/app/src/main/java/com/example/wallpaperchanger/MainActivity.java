package com.example.wallpaperchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button change;
    Timer mytimer;

    int prev = 1;
    Drawable drawable;

    WallpaperManager wpm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wpm =WallpaperManager.getInstance(this);
        mytimer = new Timer();


        change = (Button)findViewById(R.id.change);


        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setwallpaper();



            }
        });
    }
    private void setwallpaper(){
        int interval = 10000;
        mytimer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(prev == 1){
                    drawable = getResources().getDrawable(R.drawable.a);
                    prev = 2;
                }
                else if(prev == 2){
                    drawable = getResources().getDrawable(R.drawable.b);
                    prev = 3;
                }
                else if(prev == 3){
                    drawable = getResources().getDrawable(R.drawable.c);
                    prev = 4;
                }
                else if(prev == 4){
                    drawable = getResources().getDrawable(R.drawable.d);
                    prev = 5;
                }
                else if(prev == 5){
                    drawable = getResources().getDrawable(R.drawable.image1);
                    prev = 1;
                }
                Bitmap wallpaper = ((BitmapDrawable)drawable).getBitmap();
                try {
                    wpm.setBitmap(wallpaper);
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        },interval);
    }
}