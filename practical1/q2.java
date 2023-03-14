package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class q2 extends AppCompatActivity {

    EditText yearEditText;
    EditText numDaysEditText;
    TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        yearEditText = findViewById(R.id.year_edit_text);
        numDaysEditText = findViewById(R.id.num_days_edit_text);
        dateTextView = findViewById(R.id.date_text_view);
    }

    public void calculateDate(View view) {
        int year = Integer.parseInt(yearEditText.getText().toString());
        int numDays = Integer.parseInt(numDaysEditText.getText().toString());

        try {
            String date = getDateOfYear(year, numDays);
            dateTextView.setText(date);
        } catch (IllegalArgumentException e) {
            dateTextView.setText(e.getMessage());
        }
    }

    private String getDateOfYear(int year, int numDays) {
        if (numDays >= 365) {
            throw new IllegalArgumentException("Number of days must be less than 365");
        }

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            monthDays[1] = 29; // leap year
        }

        int month = 0;
        int day = 0;
        for (int i = 0; i < monthDays.length; i++) {
            int daysInMonth = monthDays[i];
            if (numDays < daysInMonth) {
                month = i + 1;
                day = numDays + 1;
                break;
            }
            numDays -= daysInMonth;
        }

        return String.format("%d-%02d-%02d", year, month, day);
    }
}
