package application.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] country = new String[] {"India", "Italy", "China", "America", "Australia", "England", "Russia", "Nepal", "Bangladesh", "Pakistan", "Nigeria", "France", "Spain", "Argentina","Bhutan"};
    AutoCompleteTextView acTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acTextView = findViewById(R.id.acText);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, country);
        acTextView.setAdapter(adapter);

    }
}
