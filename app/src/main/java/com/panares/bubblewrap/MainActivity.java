package com.panares.bubblewrap;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int touch1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton picture = (ImageButton) findViewById(R.id.bubbleH1);

        picture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture.setImageResource(R.drawable.popped1); /* Changes Color */
               /* sp.play(sound,1,1,0,0,1); */ /*Plays sound*/
                //Wait t amount of time here
                picture.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture.setImageResource(R.drawable.unpopped); /* Changes Color Again */
                    }
                },3*1000 /* This would be the milisecond you want to wait */);
            }
        });

        final ImageButton picture2 = (ImageButton) findViewById(R.id.bubbleH2);

        picture2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture2.setImageResource(R.drawable.popped2); /* Changes Color */
               /* sp.play(sound,1,1,0,0,1); */ /*Plays sound*/
                //Wait t amount of time here
                picture2.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture2.setImageResource(R.drawable.unpopped); /* Changes Color Again */
                    }
                },3*1000 /* This would be the milisecond you want to wait */);
            }
        });

        final ImageButton picture3 = (ImageButton) findViewById(R.id.bubbleH3);

        picture3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture3.setImageResource(R.drawable.popped3); /* Changes Color */
               /* sp.play(sound,1,1,0,0,1); */ /*Plays sound*/
                //Wait t amount of time here
                picture3.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture3.setImageResource(R.drawable.unpopped); /* Changes Color Again */
                    }
                },3*1000 /* This would be the milisecond you want to wait */);
            }
        });

        final ImageButton picture4 = (ImageButton) findViewById(R.id.bubbleH4);

        picture4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture4.setImageResource(R.drawable.popped1); /* Changes Color */
               /* sp.play(sound,1,1,0,0,1); */ /*Plays sound*/
                //Wait t amount of time here
                picture4.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture4.setImageResource(R.drawable.unpopped); /* Changes Color Again */
                    }
                },3*1000 /* This would be the milisecond you want to wait */);
            }
        });

        final ImageButton picture5 = (ImageButton) findViewById(R.id.bubbleH5);

        picture5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture5.setImageResource(R.drawable.popped2); /* Changes Color */
               /* sp.play(sound,1,1,0,0,1); */ /*Plays sound*/
                //Wait t amount of time here
                picture5.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture5.setImageResource(R.drawable.unpopped); /* Changes Color Again */
                    }
                },3*1000 /* This would be the milisecond you want to wait */);
            }
        });
    }
}
