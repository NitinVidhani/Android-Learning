package application.example.datafragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstName, lastName, contactNo;
    private Button btnShow, btnRemove;
    private String fName, lName, cNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        contactNo = findViewById(R.id.contactNo);

        btnShow = findViewById(R.id.btnShow);
        btnRemove = findViewById(R.id.btnRemove);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fName = firstName.getText().toString();
                lName = lastName.getText().toString();
                cNumber = contactNo.getText().toString();
                showMe(fName,lName,cNumber);
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeMe();
            }
        });

    }

    private void showMe(String firstName, String lastName, String contactNo) {

        DataFragment dataFragment = (DataFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainer);

        if (dataFragment != null) {
            DataFragment fragment = DataFragment.newInstance(new Person(firstName, lastName, contactNo));
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer,fragment)
                    .commit();
        }
        else {

            DataFragment fragment = DataFragment.newInstance(new Person(firstName, lastName, contactNo));
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
    private void removeMe() {

        DataFragment dataFragment = (DataFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainer);

        if (dataFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(dataFragment)
                    .commit();
        }
    }

}
