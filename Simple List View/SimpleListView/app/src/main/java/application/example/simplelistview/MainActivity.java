package application.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        final String[] data = new String[] {"Germany", "India", "America", "China", "Chile", "Nepal", "Bhutan", "Pakistan", "Afghanistan", "Australia", "Sri Lanka", "New Zealand", "India", "Austria", "Argentina","Japan", "Korea", "Kenya", "Iran", "Kuwait", "Qatatr"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item,data);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Position: " + position + "\nActual Data: " + data[position] , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
