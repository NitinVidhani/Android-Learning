package application.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgDice1, imgDice2;
    private Random random = new Random();
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollTheDices();
            }
        });
    }

    private void rollTheDices() {
        imgDice1 = findViewById(R.id.imgDice1);
        imgDice2 = findViewById(R.id.imgDice2);

        int randNo1 = random.nextInt(6)+1;

        switch(randNo1) {
            case 1 :
                imgDice1.setImageResource(R.drawable.dice1);
                break;

            case 2 :
                imgDice1.setImageResource(R.drawable.dice2);
                break;

            case 3 :
                imgDice1.setImageResource(R.drawable.dice3);
                break;

            case 4 :
                imgDice1.setImageResource(R.drawable.dice4);
                break;

            case 5 :
                imgDice1.setImageResource(R.drawable.dice5);
                break;

            case 6 :
                imgDice1.setImageResource(R.drawable.dice6);
                break;

//          TODO Switch default case
        }

        int randNo2 = random.nextInt(6)+1;

        switch(randNo2) {
            case 1 :
                imgDice2.setImageResource(R.drawable.dice1);
                break;

            case 2 :
                imgDice2.setImageResource(R.drawable.dice2);
                break;

            case 3 :
                imgDice2.setImageResource(R.drawable.dice3);
                break;

            case 4 :
                imgDice2.setImageResource(R.drawable.dice4);
                break;

            case 5 :
                imgDice2.setImageResource(R.drawable.dice5);
                break;

            case 6 :
                imgDice2.setImageResource(R.drawable.dice6);
                break;

//          TODO Switch default case
        }
    }
}
