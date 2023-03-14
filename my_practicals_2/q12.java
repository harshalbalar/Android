package com.example.my_practicals_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class q12 extends AppCompatActivity {

    TextView txtvalue;
    Button btndate,btntime,btncustome;

    int mYear, mMonth, mDate, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q12);

        btndate = findViewById(R.id.btndate);
        btntime = findViewById(R.id.btntime);
        btncustome = findViewById(R.id.btncustome);
        txtvalue = findViewById(R.id.txtvalue);
        ButtonClicks();
    }

    private void ButtonClicks() {
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // lblDate.setText("Changed date is: " + getCurrentDate());
                Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDate = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(q12.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                        txtvalue.setText("Selected Date is : " + date + "/" + (month + 1) +
                                "/" + year);
                    }
                }, mYear, mMonth, mDate);

                dialog.show();

            }
        });
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  lblTime.setText("Changed time is :" + GetCurrentTime());
                Calendar c = Calendar.getInstance();
                mHour = c.get(Calendar.HOUR);
                mMinute = c.get(Calendar.MINUTE);
                TimePickerDialog dialog = new TimePickerDialog(q12.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                                String am_pm = (hour < 12) ? "AM" : "PM";
                                txtvalue.setText("Changed Time is :" + hour + ":" + minute + " " + am_pm);
                            }
                        }, mHour, mMinute, false);

                dialog.show();
            }
        });

        btncustome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AlertDialog.Builder builder = new AlertDialog.Builder(
                        q12.this);

                View customview = getLayoutInflater().inflate(R.layout.customeview, null);
                builder.setView(customview);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText txtname = customview.findViewById(R.id.txtname);
                        txtvalue.setText(txtname.getText().toString());
                        //sendDate(txtname.getText().toString());
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


    }
    private void sendDate(String data)
    {
        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
    }
}