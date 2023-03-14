package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class q5 extends AppCompatActivity {

    EditText editText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        editText = findViewById(R.id.editText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void convertToPounds(View view) {
        String inputString = editText.getText().toString();

        if (inputString.equals("")) {
            resultTextView.setText("Please enter a value");
            return;
        }

        double kilograms = Double.parseDouble(inputString);
        double pounds = kilograms * 2.20462;

        String resultString = String.format("%.2f kilograms = %.2f pounds", kilograms, pounds);
        resultTextView.setText(resultString);
    }
}