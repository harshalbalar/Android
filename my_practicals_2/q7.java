package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class q7 extends AppCompatActivity {
    String[] country= {"INDIA","RUSSIA","PAKISTAN","SOUTH KOREA", "CHINA","ITALY"};
    Spinner spincountry;
    TextView txtdes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);


        spincountry = findViewById(R.id.spincourse);
        txtdes = findViewById(R.id.txtdesh);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,country);

        spincountry.setAdapter(ad);

        spincountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                country[position].toString();
                txtdes.setText(country[position].toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}