package com.example.mediademo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.UUID;

public class AudioRecorderActivity extends AppCompatActivity {
    Button btnStartRecord, btnStopRecord, btnPlay, btnStop;
    MediaRecorder recorder;
    MediaPlayer player;
    String StorePath = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_recorder);

        ControlInitialization();
        ButtonClicks();

        if(ContextCompat.checkSelfPermission(this,
                Manifest.permission.RECORD_AUDIO) +
        ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) !=
                PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.RECORD_AUDIO,
            Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
        }
    }
    private void SetupMediaRecorder()
    {
        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        recorder.setOutputFile(StorePath);

    }
    private void ButtonClicks() {
        btnStartRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StorePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" +
                        UUID.randomUUID().toString() + "/" + "_audio_record.3gp";
                Toast.makeText(getApplicationContext(), StorePath, Toast.LENGTH_SHORT).show();
                SetupMediaRecorder();
                try {
                    recorder.prepare();
                    recorder.start();
                    Toast.makeText(getApplicationContext(), "Recording Started", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        btnStopRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recorder.stop();
                Toast.makeText(getApplicationContext(), "Recording Stopped", Toast.LENGTH_SHORT).show();
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = new MediaPlayer();
                try {
                    player.setDataSource(StorePath);
                    player.prepare();
                    player.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.stop();
                player.release();
                SetupMediaRecorder();
            }
        });
    }

    private void ControlInitialization()
    {
        btnStartRecord = findViewById(R.id.btnStartRecord);
        btnStopRecord = findViewById(R.id.btnStopRecord);
        btnPlay = findViewById(R.id.btnPlayaudio);
        btnStop = findViewById(R.id.btnStopaudio);
    }
}