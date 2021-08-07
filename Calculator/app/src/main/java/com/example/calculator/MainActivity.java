
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button jone , jtwo , jthree , jfour ,  jadd , jsub , jmul , jdiv ,  jequal , jfive , jsix  ,jseven , jeight , jnine, jzero , jclear, jdot;
    EditText jinput;
    boolean guruAdd , guruSub , gurumul , gurudiv;
    float mValueone , mValuetwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jone = (Button) findViewById(R.id.one);
        jtwo = (Button) findViewById(R.id.two);
        jthree = (Button) findViewById(R.id.three);
        jfour = (Button) findViewById(R.id.four);

        jfive = (Button) findViewById(R.id.five);
        jsix = (Button) findViewById(R.id.six);
        jseven = (Button) findViewById(R.id.seven);
        jeight = (Button) findViewById(R.id.eight);
        jnine = (Button) findViewById(R.id.nine);
        jzero = (Button) findViewById(R.id.zero);
        jclear = (Button) findViewById(R.id.clear);
        jequal = (Button) findViewById(R.id.equal);
        jinput = (EditText) findViewById(R.id.input);
        jdot = (Button) findViewById(R.id.dot);
        jadd = (Button) findViewById(R.id.add);
        jsub = (Button) findViewById(R.id.sub);
        jmul = (Button) findViewById(R.id.mul);
        jdiv = (Button) findViewById(R.id.div);

        jone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"1");
            }
        });

        jtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"2");
            }
        });

        jthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"3");
            }
        });

        jfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"4");
            }
        });

        jfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"5");
            }
        });
        jsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"6");
            }
        });


        jseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"7");
            }
        });

        jeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"8");
            }
        });


        jnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"9");
            }
        });

        jzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+"0");
            }
        });

        jdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText(jinput.getText()+".");
            }
        });

        jclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jinput.setText("");
            }
        });





        jadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jinput == null){
                    jinput.setText("");
                }
                else{
                    mValueone = Float.parseFloat(jinput.getText()+"");
                    guruAdd = true;
                    jinput.setText(null);


                }

            }
        });

        jsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jinput == null){
                    jinput.setText("");
                }
                else{
                    mValueone = Float.parseFloat(jinput.getText()+"");
                    guruSub = true;
                    jinput.setText(null);


                }

            }
        });

        jmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jinput == null){
                    jinput.setText("");
                }
                else{
                    mValueone = Float.parseFloat(jinput.getText()+"");
                    gurumul = true;
                    jinput.setText(null);


                }

            }
        });

        jdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jinput == null){
                    jinput.setText("");
                }
                else{
                    mValueone = Float.parseFloat(jinput.getText()+"");
                    gurudiv = true;
                    jinput.setText(null);


                }

            }
        });




        jequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValuetwo = Float.parseFloat(jinput.getText()+"");
                if(guruAdd == true){

                    jinput.setText(mValueone + mValuetwo+"");
                    guruAdd = false;

                }
                if(guruSub == true){
                    jinput.setText(mValueone - mValuetwo+"");
                    guruSub = false;
                }
                if(gurumul == true){
                    jinput.setText(mValueone * mValuetwo+"");
                    gurumul = false;
                }
                if(gurudiv == true){
                    jinput.setText(mValueone / mValuetwo+"");
                    gurudiv = false;
                }
            }
        });
    }
}