package com.foodorder.foodorderapp;

import android.app.ProgressDialog;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.foodorder.foodorderapp.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Signup extends AppCompatActivity {
    Typeface typeface, typeface2;
    TextView appTitle, sloganText;

    EditText edtPhone, edtName, edtPassword, edtEmail;
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        typeface = Typeface.createFromAsset(getAssets(), "xenosphere.ttf");
        appTitle = (TextView) findViewById(R.id.txtcompanyname);
        appTitle.setTypeface(typeface);

        edtPhone = (EditText) findViewById(R.id.edtPhone);
        edtName = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnSignup = (Button) findViewById(R.id.btnSignUp);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("user");


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog loadDialog = new ProgressDialog(Signup.this);
                loadDialog.setMessage("Please wait...");
                loadDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.child(edtPhone.getText().toString()).exists()) {
                            loadDialog.dismiss();
                            Toast.makeText(Signup.this, "User already exist !", Toast.LENGTH_SHORT).show();
                        } else {
                            loadDialog.dismiss();
                            User user = new User();
                            user.setAccountType("Admin");
                            user.setEmail(edtEmail.getText().toString());
                            user.setName(edtName.getText().toString());
                            user.setPassword(edtPassword.getText().toString());
                            table_user.child(edtPhone.getText().toString()).setValue(user);
                            Toast.makeText(Signup.this, "Sign up successfully !", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
