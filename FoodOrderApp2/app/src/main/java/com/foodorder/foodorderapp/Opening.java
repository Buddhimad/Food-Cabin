package com.foodorder.foodorderapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Opening extends AppCompatActivity {
    Typeface typeface,typeface2;
    TextView appTitle,sloganText;
    Button btnSignIn,btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        btnSignIn= (Button) findViewById(R.id.btnSignin);
        btnSignup= (Button) findViewById(R.id.btnSignup);
        typeface=Typeface.createFromAsset(getAssets(),"xenosphere.ttf");
        typeface2=Typeface.createFromAsset(getAssets(),"Nabila.ttf");
        appTitle= (TextView) findViewById(R.id.txtcompanyname);
        sloganText= (TextView) findViewById(R.id.txtSlogan);
        appTitle.setTypeface(typeface);
        sloganText.setTypeface(typeface2);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Opening.this, Signin.class);
                startActivity(myIntent);
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Opening.this, Signup.class);
                startActivity(myIntent);
            }
        });
    }


}
