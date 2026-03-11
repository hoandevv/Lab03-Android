package ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ListView;

import java.util.ArrayList;

import adapter.CustomAdapter;
import model.Item;

public class Bai1_Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<Item> list;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai1_activity);

        listView = findViewById(R.id.listView);

        list = new ArrayList<>();

        list.add(new Item("Apple", "Fruit", R.drawable.apple));
        list.add(new Item("Banana", "Yellow fruit", R.drawable.banana));
        list.add(new Item("Grapes", "Purple fruit", R.drawable.grapes));
        list.add(new Item("Orange", "Citrus fruit", R.drawable.orange));

        adapter = new CustomAdapter(this, list);

        listView.setAdapter(adapter);
    }
}