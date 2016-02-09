package com.example.appsd.materialspinner_android;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jaredrummler.materialspinner.MaterialSpinner;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);

        spinner.setItems("Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {

                Toast.makeText(MainActivity.this, "Click : "+position, Toast.LENGTH_SHORT).show();

            }
        });

    }

}