package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class q6 extends AppCompatActivity {

    EditText firstNumberEditText;
    EditText secondNumberEditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    public void performOperation(View view) {
        String firstNumberString = firstNumberEditText.getText().toString();
        String secondNumberString = secondNumberEditText.getText().toString();

        if (firstNumberString.equals("") || secondNumberString.equals("")) {
            Toast.makeText(this, "Please enter two values", Toast.LENGTH_SHORT).show();
            return;
        }

        double firstNumber = Double.parseDouble(firstNumberString);
        double secondNumber = Double.parseDouble(secondNumberString);

        switch (view.getId()) {
            case R.id.plusButton:
                double sum = firstNumber + secondNumber;
                resultTextView.setText(String.format("%.2f + %.2f = %.2f", firstNumber, secondNumber, sum));
                break;

            case R.id.minusButton:
                double difference = firstNumber - secondNumber;
                resultTextView.setText(String.format("%.2f - %.2f = %.2f", firstNumber, secondNumber, difference));
                break;

            case R.id.multiplyButton:
                double product = firstNumber * secondNumber;
                resultTextView.setText(String.format("%.2f x %.2f = %.2f", firstNumber, secondNumber, product));
                break;

            case R.id.divideButton:
                if (secondNumber == 0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                double quotient = firstNumber / secondNumber;
                resultTextView.setText(String.format("%.2f / %.2f = %.2f", firstNumber, secondNumber, quotient));
                break;
        }
    }
}