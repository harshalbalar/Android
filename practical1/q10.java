package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class q10 extends AppCompatActivity {
    EditText user , pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);

        user = findViewById(R.id.txtusername);
        pass = findViewById(R.id.txtpassword);

        login = findViewById(R.id.btnlogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entredusername = user.getText().toString();
                String entredpassword = pass.getText().toString();


                if(entredusername.equals("admin") && entredpassword.equals("123")){
                    Toast.makeText(getApplicationContext(), "login successfully :)", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), user_welcome.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}