package com.greatcairo.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ResturantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ArrayList<Tourism> mosque_list = new ArrayList<>();
        mosque_list.add(new Tourism(getString(R.string.nile), 225316388 , R.drawable.nile_peking_restaurant));
        mosque_list.add(new Tourism(getString(R.string.revolving), 223651234, R.drawable.revolving_restaurant));
        mosque_list.add(new Tourism(getString(R.string.bab), 224619494,R.drawable.bab_elnile));
        mosque_list.add(new Tourism(getString(R.string.nubian), 223651234, R.drawable.nubian_village));
        mosque_list.add(new Tourism(getString(R.string.sachi), 1280902028 , R.drawable.sachi_restaurant));
        mosque_list.add(new Tourism(getString(R.string.elbaghl), 227940000 , R.drawable.el_baghl_elkobra_restaurants));
        mosque_list.add(new Tourism(getString(R.string.antar), 01064046144 , R.drawable.antar_elkababgy));
        mosque_list.add(new Tourism(getString(R.string.tamari), 224619910 , R.drawable.tamarai));

        //Word Adapter here ------>
        TourismAdapter adapter = new TourismAdapter(this, mosque_list);

        ListView listView = (ListView) findViewById(R.id.list_layout);
        listView.setAdapter(adapter);
    }
}
