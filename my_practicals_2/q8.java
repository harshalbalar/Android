package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class q8 extends AppCompatActivity {

    private myCustomelist[] mobileModels = {
            new myCustomelist("Mobile 1", R.drawable.img),
            new myCustomelist("Mobile 2", R.drawable.img_1),
            new myCustomelist("Mobile 3", R.drawable.img_2),
            new myCustomelist("Mobile 4", R.drawable.img_3),
            new myCustomelist("Mobile 5", R.drawable.img),
            new myCustomelist("Mobile 6", R.drawable.img_1),
            new myCustomelist("Mobile 7", R.drawable.img_2),
            new myCustomelist("Mobile 8", R.drawable.img_3),

    };

    private GridView gridView;
    private MobileModelAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q8);

        gridView = findViewById(R.id.gridView);
        adapter = new MobileModelAdapter(this, R.layout.grid_item, mobileModels);
        gridView.setAdapter(adapter);
    }
}