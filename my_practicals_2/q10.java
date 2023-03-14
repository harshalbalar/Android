package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class q10 extends AppCompatActivity {
    String[] mycourses = {"Integrated M.Sc (IT)",
                            "B.Sc (IT)",
                            "BCA",
                            "MCA",
                            "B.Tech (IT)"};
    //EditText course;
    AutoCompleteTextView actcourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);

        //course = findViewById(R.id.txtcourse);
        actcourse = findViewById(R.id.actcourse);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mycourses);


        actcourse.setThreshold(1);
        actcourse.setAdapter(adapter);

    }
}