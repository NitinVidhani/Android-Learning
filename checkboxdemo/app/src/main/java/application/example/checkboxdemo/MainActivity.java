package application.example.checkboxdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox cat, dog, rat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View v) {
        cat = findViewById(R.id.cat);
        dog = findViewById(R.id.dog);
        rat = findViewById(R.id.rat);
        StringBuffer res = new StringBuffer();
        res.append("Cat: ").append(cat.isChecked());
        res.append("Dog: ").append(dog.isChecked());
        res.append("Rat: ").append(rat.isChecked());
        Toast.makeText(MainActivity.this,res,Toast.LENGTH_SHORT).show();
    }
}
