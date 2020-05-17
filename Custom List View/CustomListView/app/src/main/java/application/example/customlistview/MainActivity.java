package application.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countryNames = {"India", "Iran", "Israel", "Japan", "Kuwait", "Nepal", "New Zealand", "Pakistan", "Sri Lanka", "Switzerland"};
    int[] countryFlags = {R.drawable.india, R.drawable.iran,R.drawable.israel, R.drawable.japan, R.drawable.kuwait, R.drawable.nepal,
                            R.drawable.new_zealand, R.drawable.pakistan, R.drawable.sri_lanka,R.drawable.switzerland};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, countryNames, countryFlags);
        listView.setAdapter(adapter);

    }


}
