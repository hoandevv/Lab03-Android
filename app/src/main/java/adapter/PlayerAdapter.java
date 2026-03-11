package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import model.Player;
import ui.R;

public class PlayerAdapter extends BaseAdapter {

    Context context;
    ArrayList<Player> list;

    public PlayerAdapter(Context context, ArrayList<Player> list) {
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
            view = LayoutInflater.from(context)
                    .inflate(R.layout.item_player,parent,false);
        }

        ImageView imgPlayer = view.findViewById(R.id.imgPlayer);
        ImageView imgFlag = view.findViewById(R.id.imgFlag);
        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtDescription = view.findViewById(R.id.txtDescription);

        Player p = list.get(i);

        if (p != null) {
            imgPlayer.setImageResource(p.image);
            imgFlag.setImageResource(p.flag);
            txtName.setText(p.name);
            txtDescription.setText(p.description);
        }

        return view;
    }
}