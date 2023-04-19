package com.example.mediademo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class FrameAnimation extends AppCompatActivity {
    ImageView imgAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        imgAnim = findViewById(R.id.imgAnim);
        imgAnim.setBackgroundResource(R.drawable.frame_anim_list);

        AnimationDrawable anim = (AnimationDrawable) imgAnim.getBackground();
        anim.start();
    }
}