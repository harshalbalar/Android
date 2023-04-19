package com.example.mediademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class TweenAnimation extends AppCompatActivity {
    ImageView imgCartoon;
    Button btnZoom, btnRotate, btnFade, btnMove, btnSlide, btnBlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

       ControlInitialization();
       ButtonClicks();


    }

    private void ControlInitialization()
    {
        imgCartoon = findViewById(R.id.imgCartoon);
        btnZoom = findViewById(R.id.btnZoom);
        btnRotate = findViewById(R.id.btnRotate);
        btnFade = findViewById(R.id.btnFade);
        btnMove = findViewById(R.id.btnMove);
        btnSlide = findViewById(R.id.btnSlide);
        btnBlink = findViewById(R.id.btnBlink);
    }
    private void Animation(int AnimResource)
    {
        Animation objAnimation = AnimationUtils.loadAnimation(this,AnimResource);
        imgCartoon.startAnimation(objAnimation);
    }
    private void ButtonClicks()
    {
        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Animation(R.anim.zoom);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Animation(R.anim.rotate);
            }
        });

        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Animation(R.anim.fade);
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation(R.anim.move);
            }
        });

        btnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation(R.anim.slide);
            }
        });

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation(R.anim.blink);
            }
        });
    }
}