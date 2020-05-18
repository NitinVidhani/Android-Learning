package application.example.musicplaylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class PlayMusic extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    AudioManager audioManager;
    ImageButton play;
    int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        Intent intent = getIntent();
        int id = intent.getIntExtra("id",0);
        String name = intent.getStringExtra("name");

        TextView songName = findViewById(R.id.songName);
        songName.setText(name);

        mediaPlayer = MediaPlayer.create(this, id);
        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        play = findViewById(R.id.play);

        final SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(mediaPlayer.getDuration());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mediaPlayer.seekTo(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        final SeekBar volumeRocker = findViewById(R.id.volumeRocker);
        volumeRocker.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        volumeRocker.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

        volumeRocker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
                }
            },0,1000);

        playMe(null);

    }

    public void playMe(View v) {
        if(flag == 0) {
            mediaPlayer.start();
            flag = 1;
            play.setImageResource(R.drawable.pause);
        } else {
            mediaPlayer.pause();
            flag = 0;
            play.setImageResource(R.drawable.play);
        }
    }

    @Override
    protected void onStop() {

        mediaPlayer.stop();
        super.onStop();
    }
}

