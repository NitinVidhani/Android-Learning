package application.example.datafragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {

    public DataFragment() {
        // Required empty public constructor
    }

    public static DataFragment newInstance(Person person) {

        Bundle args = new Bundle();

        args.putString("First Name", person.getFirstname());
        args.putString("Last Name", person.getLastName());
        args.putString("Contact No", person.getContactNo());

        DataFragment fragment = new DataFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data, container, false);

        TextView txtFirstName = view.findViewById(R.id.txtFirstName);
        TextView txtLastName = view.findViewById(R.id.txtLastName);
        TextView txtContactNo = view.findViewById(R.id.txtContactNo);

        Bundle bundle = getArguments();
        if (bundle != null) {
            txtFirstName.setText(bundle.getString("First Name"));
            txtLastName.setText(bundle.getString("Last Name"));
            txtContactNo.setText(bundle.getString("Contact No."));
        }

        return view;
    }
}
