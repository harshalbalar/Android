package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class q4 extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        editText = findViewById(R.id.editText);
    }

    public void checkPalindrome(View view) {
        String inputString = editText.getText().toString();

        if (isPalindrome(inputString)) {
            Toast.makeText(this, inputString + " is a palindrome", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, inputString + " is not a palindrome", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isPalindrome(String inputString) {
        int length = inputString.length();
        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}