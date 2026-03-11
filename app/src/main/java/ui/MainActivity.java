package ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBai1 = findViewById(R.id.btnBai1);
        Button btnBai1_1 = findViewById(R.id.btnBai1_1);
        Button btnBai2 = findViewById(R.id.btnBai2);

        if (btnBai1 != null) {
            btnBai1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Bai1_Activity.class);
                    startActivity(intent);
                }
            });
        }

        if (btnBai1_1 != null) {
            btnBai1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                    startActivity(intent);
                }
            });
        }

        if (btnBai2 != null) {
            btnBai2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Bai2_Activity.class);
                    startActivity(intent);
                }
            });
        }
    }
}