package ui;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import adapter.ProductAdapter;
import model.Product;

public class Bai2_Activity extends AppCompatActivity {

        GridView gridView;
        ArrayList<Product> list;
        ProductAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.bai2_activity);

            gridView = findViewById(R.id.gridView);

            list = new ArrayList<>();

            list.add(new Product("Vagabond", "$120", R.drawable.p1));
            list.add(new Product("Stella", "$58", R.drawable.p2));
            list.add(new Product("Whitney", "$35", R.drawable.p3));
            list.add(new Product("Garden", "$98", R.drawable.p4));
            list.add(new Product("Strut", "$75", R.drawable.p5));
            list.add(new Product("Nest", "$75", R.drawable.p6));
            list.add(new Product("Wash", "$75", R.drawable.p7));
            list.add(new Product("Clean", "$75", R.drawable.p8));

            adapter = new ProductAdapter(this, list);
            gridView.setAdapter(adapter);
        }
    }