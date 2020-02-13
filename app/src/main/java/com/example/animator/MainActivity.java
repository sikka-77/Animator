package com.example.animator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimatedVectorDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mimageview =findViewById(R.id.img);
        mimageview.setBackgroundResource(R.drawable.animatorvectordrawable);
        animation = (AnimatedVectorDrawable) mimageview.getBackground();

        mimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.start();
            }
        });

    }
}
