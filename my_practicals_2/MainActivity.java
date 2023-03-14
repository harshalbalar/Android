package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controlInit();


        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 1 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q1.class);
                startActivity(i);
            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 2 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q2.class);
                startActivity(i);
            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 3 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q3.class);
                startActivity(i);
            }
        });

        q4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 4 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q4.class);
                startActivity(i);
            }
        });

        q5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 5 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q5.class);
                startActivity(i);
            }
        });

        q6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 6 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q6.class);
                startActivity(i);
            }
        });

        q7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 7 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q7.class);
                startActivity(i);
            }
        });

        q8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 8 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q8.class);
                startActivity(i);
            }
        });

        q9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 9 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q9.class);
                startActivity(i);
            }
        });

        q10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 10 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q10.class);
                startActivity(i);
            }
        });

        q11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 11 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q11.class);
                startActivity(i);
            }
        });

        q12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 12 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q12.class);
                startActivity(i);
            }
        });

        q13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Question 13 will be display..", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), q13.class);
                startActivity(i);
            }
        });
    }
    public void controlInit() {
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);
        q6 = findViewById(R.id.q6);
        q7 = findViewById(R.id.q7);
        q8 = findViewById(R.id.q8);
        q9 = findViewById(R.id.q9);
        q10 = findViewById(R.id.q10);
        q11 = findViewById(R.id.q11);
        q12 = findViewById(R.id.q12);
        q13 = findViewById(R.id.q13);
    }
}