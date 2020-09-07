package com.abhivineet.animation;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView bart;
    ImageView homer;

    public void fade(ImageView v1, ImageView v2){

        v1.animate().alpha(0f).setDuration(2000);
        v2.animate().alpha(1f).setDuration(2000);
        v2.bringToFront();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bart = (ImageView)findViewById(R.id.bart);
        homer = (ImageView)findViewById(R.id.homer);

        bart.setOnClickListener(this);
        homer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bart:
                fade(bart, homer);
                break;
            case R.id.homer:
                fade(homer,bart);
                break;
        }
    }
}
