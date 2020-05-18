package application.example.musicplaylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    CustomAdapter customAdapter;
    ListView listView;
    String[] names = {"hamari adhuri kahani", "kal ho na ho", "Mar Jayen", "Sanam Re", "Sanu Ek Pal Chain", "Sweety Tera Drama"};
    int[] songs = {R.raw.hamari_adhuri_kahani, R.raw.kal_ho_na_ho, R.raw.mar_jayen, R.raw.sanam_re, R.raw.sanu_ek_pal_chain, R.raw.sweety_tera_drama};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        customAdapter = new CustomAdapter(this, names, songs);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, PlayMusic.class);
                intent.putExtra("id",songs[position]);
                intent.putExtra("name", names[position]);
                startActivity(intent);
            }
        });

    }

}
