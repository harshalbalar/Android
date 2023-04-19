package com.example.mediademo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlarmActivity extends AppCompatActivity {
    EditText txtTime;
    Button btnSetAlarm;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        txtTime = findViewById(R.id.txtTime);
        btnSetAlarm = findViewById(R.id.btnSetAlarm);


        btnSetAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(txtTime.getText().toString());

                Intent intent = new Intent(getApplicationContext(),MyBroadcastReceiver.class);

                PendingIntent pi = PendingIntent.getBroadcast(getApplicationContext(),0,
                        intent,0);

                AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);
                manager.set(AlarmManager.RTC_WAKEUP,
                        System.currentTimeMillis() + (i*1000),pi);

                Toast.makeText(getApplicationContext(), "Alarm set in " + i + " seconds", Toast.LENGTH_SHORT).show();
            }
        });


    }


}