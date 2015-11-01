package net.armadeal.thuglife;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView thugLife = (TextView) findViewById(R.id.thug_life_textview);
        Typeface font = Typeface.createFromAsset(getAssets(), "iglesia.ttf");
        thugLife.setTypeface(font);

    }

    int sequence = 1;
    MediaPlayer mp;

    public void thugPlay(View view) {
        // Plays according to sequence's value

        if (sequence == 1) {
            if (mp != null && mp.isPlaying()){
                mp.stop();
            }
            mp = MediaPlayer.create(MainActivity.this, R.raw.g_thang);
            mp.start();
            sequence++;
        } else if (sequence == 2) {
            mp.stop();
            mp = MediaPlayer.create(MainActivity.this, R.raw.still);
            mp.start();
            sequence++;
        } else if (sequence == 3) {
            mp.stop();
            mp = MediaPlayer.create(MainActivity.this, R.raw.ridin);
            mp.start();
            sequence++;
        } else if (sequence == 4) {
            mp.stop();
            mp = MediaPlayer.create(MainActivity.this, R.raw.move_bitch);
            mp.start();
            sequence++;
        } else if (sequence == 5) {
            mp.stop();
            mp = MediaPlayer.create(MainActivity.this, R.raw.ftp);
            mp.start();
            sequence++;
        } else if (sequence == 6) {
            mp.stop();
            mp = MediaPlayer.create(MainActivity.this, R.raw.hipnotize);
            mp.start();
            sequence++;
        } else {
            mp.stop();
            mp = MediaPlayer.create(MainActivity.this, R.raw.next_episode);
            mp.start();
            sequence = 1;
        }
    }

}
