package com.greatcairo.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mosqueButton = (Button) findViewById(R.id.mosque);
        mosqueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1 = new Intent(MainActivity.this, MosquesActivity.class);
                startActivity(int1);
            }
        });

        Button churcheButton = (Button) findViewById(R.id.hotels);
        churcheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1 = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(int1);
            }
        });


        Button museumButton = (Button) findViewById(R.id.museum);
        museumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1 = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(int1);
            }
        });

        Button resturantButton = (Button) findViewById(R.id.restaurant);
        resturantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1 = new Intent(MainActivity.this, ResturantsActivity.class);
                startActivity(int1);
            }
        });
    }
}

