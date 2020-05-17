package application.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollOurDice();
            }
        });
    }

    private void rollOurDice() {
        int randomNo = myRandomNumber.nextInt(6) + 1;

        switch(randomNo) {
            case 1 :
                img.setImageResource(R.drawable.dice1);
                break;
            case 2 :
                img.setImageResource(R.drawable.dice2);
                break;
            case 3 :
                img.setImageResource(R.drawable.dice3);
                break;
            case 4 :
                img.setImageResource(R.drawable.dice4);
                break;
            case 5 :
                img.setImageResource(R.drawable.dice5);
                break;
            case 6 :
                img.setImageResource(R.drawable.dice6);
                break;

//          TODO Switch Default case
        }
    }
}
