package com.example.wissal1.rbmapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSignIn ;
    ProgressDialog mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignIn=(Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog=new ProgressDialog(MainActivity.this);
                mDialog.setMessage("Please waiting .....!");
                mDialog.show();
                //mDialog.dismiss();
                Toast.makeText(MainActivity.this, "Sign in successfully !", Toast.LENGTH_SHORT).show();
                Intent homeIntent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(homeIntent);


            }
        });
    }

}
