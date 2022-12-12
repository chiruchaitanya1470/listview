package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //list view
        ListView list= (ListView) findViewById(R.id.listview);
        //DATA SOURCE
        ArrayList<listView> diseases=new ArrayList<listView>();
        diseases.add(new listView("skin allergy","MBBS.FRCS"));
        diseases.add(new listView("throte","had goon info throte"));
        diseases.add(new listView("skin allergy","MBBS.FRCS"));
        diseases.add(new listView("throte","had goon info throte"));
        diseases.add(new listView("skin allergy","MBBS.FRCS"));
        diseases.add(new listView("throte","had goon info throte"));
        diseases.add(new listView("skin allergy","MBBS.FRCS"));
        diseases.add(new listView("throte","had goon info throte"));
        diseases.add(new listView("skin allergy","MBBS.FRCS"));
        diseases.add(new listView("throte","had goon info throte"));
        //ADAPTER
        customAdapter adapter = new customAdapter(diseases,getApplicationContext());
        list.setAdapter(adapter);
    }
}