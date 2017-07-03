package com.greatcairo.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ArrayList<Tourism> museum_list = new ArrayList<>();
        museum_list.add(new Tourism(getString(R.string.egyptian),getString(R.string.egyptian1), R.drawable.egyptian_museum));
        museum_list.add(new Tourism(getString(R.string.greeko),getString(R.string.greeko1), R.drawable.greeko_roman_museum));
        museum_list.add(new Tourism(getString(R.string.geological),getString(R.string.geological1), R.drawable.egyptian_geological_museum));
        museum_list.add(new Tourism(getString(R.string.islamic),getString(R.string.islamic1), R.drawable.islamic_art_museum));
        museum_list.add(new Tourism(getString(R.string.copte),getString(R.string.copte1), R.drawable.copte_museum));
        museum_list.add(new Tourism(getString(R.string.aquarium),getString(R.string.aquarium1), R.drawable.aquarium_museum));
        museum_list.add(new Tourism(getString(R.string.military),getString(R.string.military1), R.drawable.egyptian_military_museum));
        museum_list.add(new Tourism(getString(R.string.alamin),getString(R.string.alamin1), R.drawable.elalamein_military_museum));
        museum_list.add(new Tourism(getString(R.string.nasr),getString(R.string.nasr1), R.drawable.elnasr_museum_of_modern_art));
        museum_list.add(new Tourism(getString(R.string.child),getString(R.string.child1), R.drawable.child_museum));

        //Word Adapter here ------>
        TourismAdapter adapter = new TourismAdapter(this, museum_list);

        ListView listView = (ListView) findViewById(R.id.list_layout);
        listView.setAdapter(adapter);
    }
}
