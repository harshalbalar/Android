package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class q1 extends AppCompatActivity {
    EditText editTextName;
    Button btnClickHere;
    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        editTextName=(EditText) findViewById(R.id.editTextName);
        btnClickHere=(Button) findViewById(R.id.btnClickHere);
        textName=(TextView) findViewById(R.id.textName);
        btnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editTextName.getText().toString();
                textName.setText("Hi " + name);
            }
        });
    }
}