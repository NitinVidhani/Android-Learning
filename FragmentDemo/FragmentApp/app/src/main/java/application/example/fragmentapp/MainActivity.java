package application.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleFragment exampleFragment = new ExampleFragment();



    }

    public void showFragemnt(View view) {
        ExampleFragment fragment = new ExampleFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();


    }

    public void removeFragment(View view) {

        ExampleFragment fragment = (ExampleFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if(fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }
    }
}
