package com.example.mediademo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    Button btnPlay, btnPause, btnStop;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ControlInitialization();
        ButtonClicks();

    //    player = MediaPlayer.create(this,R.raw.a);
       // player = MediaPlayer.create(this, Uri.parse("https://samplelib.com/lib/preview/mp3/sample-15s.mp3"));
    //    player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
       //player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        String VideoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        videoView.setVideoURI(Uri.parse(VideoPath));
      /*  videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                player.setLooping(true);
            }
        });*/
    }

    private void ControlInitialization()
    {
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        btnStop = findViewById(R.id.btnStop);
        videoView = findViewById(R.id.videoView);
    }

    private void ButtonClicks()
    {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // player.start();
                videoView.start();
            }
        });

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // player.pause();
                videoView.pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  player.stop();
                videoView.stopPlayback();
             /*   try {
                    player.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        });
    }
}