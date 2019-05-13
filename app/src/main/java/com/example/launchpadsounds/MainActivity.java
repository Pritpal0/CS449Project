package com.example.launchpadsounds;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int totalbuttoncounter = 0;
    TextView BtCount;
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12, sound13, sound14, sound15, sound16, sound17, sound18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtCount = (TextView) findViewById(R.id.buttonclickcounter);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundPool.load(this, R.raw.audiotrack1, 1);
        sound2 = soundPool.load(this, R.raw.audiotrack2, 1);
        sound3 = soundPool.load(this, R.raw.audiotrack3, 1);
        sound4 = soundPool.load(this, R.raw.audiotrack4, 1);
        sound5 = soundPool.load(this, R.raw.audiotrack5, 1);
        sound6 = soundPool.load(this, R.raw.audiotrack6, 1);
        sound7 = soundPool.load(this, R.raw.audiotrack7, 1);
        sound8 = soundPool.load(this, R.raw.audiotrack8, 1);
        sound9 = soundPool.load(this, R.raw.audiotrack9, 1);
        sound10 = soundPool.load(this, R.raw.audiotrack10, 1);
        sound11 = soundPool.load(this, R.raw.audiotrack11, 1);
        sound12 = soundPool.load(this, R.raw.audiotrack12, 1);
        sound13 = soundPool.load(this, R.raw.audiotrack13, 1);
        sound14 = soundPool.load(this, R.raw.audiotrack14, 1);
        sound15 = soundPool.load(this, R.raw.audiotrack15, 1);
        sound16 = soundPool.load(this, R.raw.audiotrack16, 1);
        sound17 = soundPool.load(this, R.raw.audiotrack17, 1);
        sound18 = soundPool.load(this, R.raw.audiotrack18, 1);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_option_reset:
                setContentView(R.layout.activity_main);

                totalbuttoncounter = 0;
                BtCount.setText("" + totalbuttoncounter);
                return true;

            case R.id.menu_option_about:
                setContentView(R.layout.aboutpage);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button3:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button10:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button11:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button12:
                soundPool.play(sound12, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button13:
                soundPool.play(sound13, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button14:
                soundPool.play(sound14, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button15:
                soundPool.play(sound15, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button16:
                soundPool.play(sound16, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button17:
                soundPool.play(sound17, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
            case R.id.button18:
                soundPool.play(sound18, 1, 1, 0, 0, 1);
                totalbuttoncounter++;
                BtCount.setText(""+totalbuttoncounter);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}
