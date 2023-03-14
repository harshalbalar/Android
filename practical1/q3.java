package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Bundle;

public class q3 extends AppCompatActivity {

    Button b1;
    EditText et;
    ToggleButton tb;
    Double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        et = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);
        tb = (ToggleButton) findViewById(R.id.toggleButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et.getText().toString().isEmpty()) {
                    Toast.makeText(q3.this, "Please enter the temperature", Toast.LENGTH_SHORT).show();
                } else if (tb.isChecked()) {
                    a = Double.parseDouble(String.valueOf(et.getText()));
                    Double b = a * 9 / 5 + 32;
                    String r = String.valueOf(b);
                    Toast.makeText(q3.this, r + "°F", Toast.LENGTH_SHORT).show();
                } else {
                    a = Double.parseDouble(String.valueOf(et.getText()));
                    Double b = a - 32;
                    Double c = b * 5 / 9;
                    String r = String.valueOf(c);
                    Toast.makeText(q3.this, r + "°C", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}