package application.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] names;
    int[] flags;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] names, int[] images) {
        this.context = context;
        this.names = names;
        this.flags = images;
        inflater = LayoutInflater.from(context);
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
        convertView = inflater.inflate(R.layout.custom_list_items, null);
        TextView textView = convertView.findViewById(R.id.name);
        ImageView imageView = convertView.findViewById(R.id.flag);

        textView.setText(names[position]);
        imageView.setImageResource(flags[position]);

        return convertView;
    }
}
