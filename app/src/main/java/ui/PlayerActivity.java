package ui;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import adapter.PlayerAdapter;
import model.Player;

public class PlayerActivity extends AppCompatActivity {

    ListView listPlayer;
    ArrayList<Player> list;
    PlayerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        listPlayer = findViewById(R.id.listPlayer);

        list = new ArrayList<>();

        list.add(new Player("Pele", "The King of Football", R.drawable.pele, R.drawable.brazil));
        list.add(new Player("Diego Maradona", "The Golden Boy", R.drawable.maradona, R.drawable.argentina));
        list.add(new Player("Johan Cruyff", "The Father of Total Football", R.drawable.cruyff, R.drawable.netherlands));
        list.add(new Player("Franz Beckenbauer", "Der Kaiser", R.drawable.beckenbauer, R.drawable.germany));
        list.add(new Player("Michel Platini", "Le Roi", R.drawable.platini, R.drawable.france));

        adapter = new PlayerAdapter(this, list);

        if (listPlayer != null) {
            listPlayer.setAdapter(adapter);
        }
    }
}