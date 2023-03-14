package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class q6 extends AppCompatActivity {

    private ListView lst;
    private String[] colorNames = {"Red", "Green", "Blue", "Yellow", "Orange", "Purple"};
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        lst = findViewById(R.id.lstcolors);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colorNames);
        lst.setAdapter(adapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedColor = colorNames[position];
                switch (selectedColor) {
                    case "Red":
                        view.getRootView().setBackgroundColor(Color.RED);
                        break;
                    case "Green":
                        view.getRootView().setBackgroundColor(Color.GREEN);
                        break;
                    case "Blue":
                        view.getRootView().setBackgroundColor(Color.BLUE);
                        break;
                    case "Yellow":
                        view.getRootView().setBackgroundColor(Color.YELLOW);
                        break;
                    case "Orange":
                        view.getRootView().setBackgroundColor(Color.parseColor("#FFA500"));
                        break;
                    case "Purple":
                        view.getRootView().setBackgroundColor(Color.parseColor("#800080"));
                        break;
                }
            }
        });

    }

}