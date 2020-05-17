package application.example.activitydatatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

    }

    public void screenOne(View view) {
        String value = editText.getText().toString();
        if(value.isEmpty()) {
            editText.setError("No Value");
        }
        else {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", value);

            startActivity(intent);
        }
    }
}
