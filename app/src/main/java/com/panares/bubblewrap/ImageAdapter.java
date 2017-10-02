package com.panares.bubblewrap;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;


import java.io.IOException;

/**
 * Created by Clark.Panares on 10/02/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return 117;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageButton for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
       final ImageButton imageButton;
        final MediaPlayer mp = new MediaPlayer();
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageButton = new ImageButton(mContext);
            imageButton.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageButton.setScaleType(ImageButton.ScaleType.CENTER_CROP);
            imageButton.setPadding(8, 8, 8, 8);
        } else {
            imageButton = (ImageButton) convertView;
        }
        imageButton.setImageResource(R.drawable.unpopped);
        imageButton.setBackgroundDrawable(null);

            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageButton.setImageResource(R.drawable.popped1); /* Changes picture */
                    if (mp.isPlaying()) { //plays sound effect
                        mp.stop();
                    }
                    try {
                        mp.reset();
                        AssetFileDescriptor afd;
                        afd = mContext.getAssets().openFd("bwsound.mp3");
                        mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                        mp.prepare();
                        mp.start();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //Wait t amount of time here
                    imageButton.postDelayed(new Runnable() {
                        public void run() {
                           imageButton.setImageResource(R.drawable.unpopped); //Changes Color Again
                            mp.pause();
                        }
                    }, 3 * 1000 /* This would be the milisecond you want to wait*/);
                }


            });
        return imageButton;
    }

}