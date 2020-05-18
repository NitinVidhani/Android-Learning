package application.example.musicplaylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String[] names;
    Context context;
    int[] songs;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] names, int[] songs) {

        this.names = names;
        this.context = context;
        this.songs = songs;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = layoutInflater.inflate(R.layout.custom_list_view, null);

        TextView textView = v.findViewById(R.id.textView);

        textView.setText(names[position]);

        return v;
    }
}
