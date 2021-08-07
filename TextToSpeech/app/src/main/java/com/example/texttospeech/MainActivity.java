package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    EditText typetext;
    Button convertor;

    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typetext = (EditText)findViewById(R.id.mytext);
        convertor = (Button)findViewById(R.id.convert);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR){
                    t1.setLanguage(Locale.UK);
                }
            }
        });
        convertor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               String tospeak =  typetext.getText().toString();
                Toast.makeText(MainActivity.this,tospeak,Toast.LENGTH_SHORT).show();
                t1.speak(tospeak,TextToSpeech.QUEUE_FLUSH,null);
            }
        });


    }
}