package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class q4 extends AppCompatActivity {
    RadioButton c1 ,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        c1 = findViewById(R.id.rdbc1);
        c2 = findViewById(R.id.rdbc2);
        c3 = findViewById(R.id.rdbc3);
        c4 = findViewById(R.id.rdbc4);


    }
}