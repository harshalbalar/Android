package com.example.mediademo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoRecord extends AppCompatActivity {
    Button btnRecordVideo, btnRecordAudio;
    VideoView video_view;
    String videoURiString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_record);

        btnRecordVideo = findViewById(R.id.btnRecordVide);
        video_view = findViewById(R.id.video_view);
        btnRecordAudio = findViewById(R.id.btnRecordAudio);
        btnRecordVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                i.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,1);
                startActivityForResult(i,1);
            }
        });

        btnRecordAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
                startActivityForResult(i,2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK)
        {
            if(requestCode == 1)
            {
                Uri videoUri = data.getData();
              //  videoURiString = videoUri.toString();
                video_view.setVideoURI(videoUri);
                video_view.start();
            }else if(requestCode == 2)
            {
                Uri audioUri = data.getData();

                MediaPlayer player = MediaPlayer.create(getApplicationContext(),
                        audioUri);
                player.start();
            }
        }
    }
}