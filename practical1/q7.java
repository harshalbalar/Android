package com.example.practical1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class q7 extends AppCompatActivity {
    private static final String TAG = "q7";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);
        Log.d("Activity_Lifecycle","onCreate invoked");
        Toast.makeText(q7.this,"Created",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_Lifecycle","onStart invoked");
        Toast.makeText(q7.this,"Start",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity_Lifecycle","onResume invoked");
        Toast.makeText(q7.this,"Resume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity_Lifecycle","onPause invoked");
        Toast.makeText(q7.this,"Pause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity_Lifecycle","onStop invoked");
        Toast.makeText(q7.this,"Stop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity_Lifecycle","onRestart invoked");
        Toast.makeText(q7.this,"Restart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity_Lifecycle","onDestroy invoked");
        Toast.makeText(q7.this,"Destroy",Toast.LENGTH_SHORT).show();
    }
}