package com.greatcairo.tourguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ArrayList<Tourism> hotels_list = new ArrayList<>();
        hotels_list.add(new Tourism(getString(R.string.four_seasons), 227917000 , R.drawable.four_seasons));
        hotels_list.add(new Tourism(getString(R.string.sheraton), 233369800, R.drawable.sheraton_cairo_hotel));
        hotels_list.add(new Tourism(getString(R.string.nile_ritz), 225778899,R.drawable.nile_ritz_hotel));
        hotels_list.add(new Tourism(getString(R.string.grand_nile), 223651234, R.drawable.grand_nile));
        hotels_list.add(new Tourism(getString(R.string.kempiniski), 227980000 , R.drawable.kempinski));
        hotels_list.add(new Tourism(getString(R.string.sofitel),227373737 , R.drawable.sofitil));
        hotels_list.add(new Tourism(getString(R.string.ramses), 225777444 , R.drawable.ramsis));
        hotels_list.add(new Tourism(getString(R.string.steigen), 225750777 , R.drawable.steigen));

        //Word Adapter here ------>
        TourismAdapter adapter = new TourismAdapter(this, hotels_list);

        ListView listView = (ListView) findViewById(R.id.list_layout);
        listView.setAdapter(adapter);
    }

}
