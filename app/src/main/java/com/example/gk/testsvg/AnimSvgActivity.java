package com.example.gk.testsvg;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AnimSvgActivity extends AppCompatActivity {
    ImageView img_ani;

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, AnimSvgActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_svg);
        img_ani = (ImageView) findViewById(R.id.img_ani);
    }

    public void onClick(View view) {
        ((AnimatedVectorDrawable) img_ani.getDrawable()).start();
    }
}
