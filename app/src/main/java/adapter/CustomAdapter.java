package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import model.Item;
import ui.R;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Item> list;

    public CustomAdapter(Context context, List<Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.bai1_item, parent, false);

        ImageView img = view.findViewById(R.id.imgIcon);
        TextView name = view.findViewById(R.id.txtName);
        TextView desc = view.findViewById(R.id.txtDesc);

        Item item = list.get(i);

        name.setText(item.getName());
        desc.setText(item.getDesc());
        img.setImageResource(item.getImage());

        return view;
    }
}