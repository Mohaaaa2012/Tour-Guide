package com.greatcairo.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MosquesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ArrayList<Tourism> mosque_list = new ArrayList<>();
        mosque_list.add(new Tourism(getString(R.string.Amr_Ibn_Elass),getString(R.string.Amr_Ibn_Elass1), R.drawable.amr_ibn_alass));
        mosque_list.add(new Tourism(getString(R.string.Ahmed_Ibn_Touloun),getString(R.string.Ahmed_Ibn_Touloun1), R.drawable.ahmed_ibn_tulun));
        mosque_list.add(new Tourism(getString(R.string.Al_Azhar),getString(R.string.Al_Azhar), R.drawable.al_azhar));
        mosque_list.add(new Tourism(getString(R.string.Elhakim),getString(R.string.Elhakim1), R.drawable.al_hakim_beamr_allah));
        mosque_list.add(new Tourism(getString(R.string.Hussien),getString(R.string.Hussien1), R.drawable.al_hussein));
        mosque_list.add(new Tourism(getString(R.string.Bebars),getString(R.string.Bebars1), R.drawable.alzaher_baybars));
        mosque_list.add(new Tourism(getString(R.string.Qalawoun),getString(R.string.Qalawoun1), R.drawable.soltan_qalawoun));
        mosque_list.add(new Tourism(getString(R.string.Hassan),getString(R.string.Hassan1), R.drawable.soltan_hassan));
        mosque_list.add(new Tourism(getString(R.string.Qunsoa),getString(R.string.Qunsoa1), R.drawable.qunsoa_ghuri));
        mosque_list.add(new Tourism(getString(R.string.Mohamed_Ali),getString(R.string.Mohamed_Ali1), R.drawable.mohamed_ali));
        mosque_list.add(new Tourism(getString(R.string.Agha),getString(R.string.Agha1), R.drawable.soliman_agha_alselihdar));

        //Word Adapter here ------>
        TourismAdapter adapter = new TourismAdapter(this, mosque_list);

        ListView listView = (ListView) findViewById(R.id.list_layout);
        listView.setAdapter(adapter);


    }

}
