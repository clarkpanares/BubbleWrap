package com.panares.bubblewrap;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;

/**
 * Created by Clark.Panares on 10/02/2017.
 */

public class ImageAdapter2 extends BaseAdapter {
    private Context mContext;

    public ImageAdapter2(Context c) {
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
        final MediaPlayer mp = MediaPlayer.create(mContext, R.raw.bwsound);


        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageButton = new ImageButton(mContext);
            imageButton.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageButton.setScaleType(ImageButton.ScaleType.CENTER_CROP);
            imageButton.setPadding(8, 8, 8, 8);
        } else {
            imageButton = (ImageButton) convertView;
        }
        imageButton.setBackgroundDrawable(null);
        imageButton.setImageResource(R.drawable.unpopped);
        imageButton.setOnTouchListener(new View.OnTouchListener() {
            final ImageButton image = imageButton;
            Vibrator vi = (Vibrator) mContext.getSystemService(Context.VIBRATOR_SERVICE);
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(imageButton.isPressed() == false) {
                    image.setImageResource(R.drawable.popped1); /* Changes picture */
                    vi.vibrate(70);
                    mp.start();
                    image.setClickable(false);
                    image.setEnabled(false);
                }
                //Wait t amount of time here
                image.postDelayed(new Runnable() {
                    public void run() {
                        image.setImageResource(R.drawable.unpopped); //Changes picture again
                        image.setClickable(true);
                        image.setEnabled(true);
                    }
                }, 3 * 1000 /* This would be the milisecond you want to wait*/);
                return true;
            }
        });
        return imageButton;
    }

}