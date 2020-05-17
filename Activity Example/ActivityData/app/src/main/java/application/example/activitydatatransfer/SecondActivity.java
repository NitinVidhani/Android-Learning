package application.example.activitydatatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        String myValue = getIntent().getStringExtra("name");
        textView.setText(myValue);
    }

    public void takeMeBack(View view) {

        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
