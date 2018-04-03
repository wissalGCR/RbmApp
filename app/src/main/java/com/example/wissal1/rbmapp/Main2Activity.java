package com.example.wissal1.rbmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    CardView mycard ;
    CardView mycardHumidite ;
    Intent i,i2 ;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mycard = (CardView) findViewById(R.id.bankcardId);
        mycardHumidite=(CardView) findViewById(R.id.HumiditecardId);


        i = new Intent(this,Main3Activity.class);
        mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
        /*i2= new Intent(this,Main4Activity.class);
        mycardHumidite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i2);
            }
        });*/
    }
}
