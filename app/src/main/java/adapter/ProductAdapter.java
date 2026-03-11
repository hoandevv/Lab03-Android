package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import model.Product;
import ui.R;

public class ProductAdapter extends BaseAdapter {

    Context context;
    ArrayList<Product> list;

    public ProductAdapter(Context context, ArrayList<Product> list) {
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

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.bai2_item,parent,false);
        }

        ImageView img = view.findViewById(R.id.imgProduct);
        TextView name = view.findViewById(R.id.txtName);
        TextView price = view.findViewById(R.id.txtPrice);

        Product p = list.get(i);

        img.setImageResource(p.image);
        name.setText(p.name);
        price.setText(p.price);

        return view;
    }
}