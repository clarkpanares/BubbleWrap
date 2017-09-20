package com.panares.bubblewrap;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = new MediaPlayer();
        final ImageButton picture2 = (ImageButton) findViewById(R.id.bubble2);
        final ImageButton picture3 = (ImageButton) findViewById(R.id.bubble3);
        final ImageButton picture4 = (ImageButton) findViewById(R.id.bubble4);
        final ImageButton picture6 = (ImageButton) findViewById(R.id.bubble6);
        final ImageButton picture7 = (ImageButton) findViewById(R.id.bubble7);
        final ImageButton picture8 = (ImageButton) findViewById(R.id.bubble8);
        final ImageButton picture9 = (ImageButton) findViewById(R.id.bubble9);
        final ImageButton picture10 = (ImageButton) findViewById(R.id.bubble10);
        final ImageButton picture11 = (ImageButton) findViewById(R.id.bubble11);
        final ImageButton picture12 = (ImageButton) findViewById(R.id.bubble12);
        final ImageButton picture13 = (ImageButton) findViewById(R.id.bubble13);
        final ImageButton picture14 = (ImageButton) findViewById(R.id.bubble14);

        picture2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture2.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture2.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture2.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture3.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture3.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture3.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture3.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture3.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture3.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture4.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture4.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture4.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture6.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture6.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture6.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture7.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture7.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture7.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture8.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture8.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture8.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture9.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture9.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture9.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture10.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture10.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture10.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture11.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture11.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture11.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture12.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture12.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture12.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture13.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture13.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture13.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

        picture14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                picture14.setImageResource(R.drawable.popped1); /* Changes picture */
                if(mp.isPlaying()) { //plays sound effect
                    mp.stop();
                }
                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("bwsound.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //Wait t amount of time here
                picture14.postDelayed(new Runnable() {
                    public void run() {
                        //Do what you want
                        picture14.setImageResource(R.drawable.unpopped); //Changes Color Again
                    }
                },3*1000 /* This would be the milisecond you want to wait*/ );
            }
        });

    }
}
