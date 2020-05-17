package application.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer media;
    private MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        media = MediaPlayer.create(this, R.raw.song);

        mediaController = new MediaController(this);
        mediaController.setAnchorView(findViewById(R.id.layout));
        mediaController.show();

        media.start();

    }
}
