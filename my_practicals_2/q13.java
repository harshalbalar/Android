package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class q13 extends AppCompatActivity {

    private EditText editTextNo1, editTextNo2;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q13);


        editTextNo1 = findViewById(R.id.editTextNo1);
        editTextNo2 = findViewById(R.id.editTextNo2);
        textViewResult = findViewById(R.id.textViewResult);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.addition:
                performCalculation('+');
                return true;
            case R.id.subtraction:
                performCalculation('-');
                return true;
            case R.id.multiplication:
                performCalculation('*');
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void performCalculation(char operator) {
        int no1 = Integer.parseInt(editTextNo1.getText().toString());
        int no2 = Integer.parseInt(editTextNo2.getText().toString());
        int result = 0;

        switch (operator) {
            case '+':
                result = no1 + no2;
                break;
            case '-':
                result = no1 - no2;
                break;
            case '*':
                result = no1 * no2;
                break;
        }

        textViewResult.setText(String.valueOf(result));
        textViewResult.setVisibility(View.VISIBLE);
    }
}