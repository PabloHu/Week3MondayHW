package com.example.admin.week3mondayhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ZooActivity extends AppCompatActivity {
    ListView lvCustomVH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo);

        lvCustomVH = (ListView) findViewById(R.id.lvCustomVH);

        List<Animal> animalListCustom = new ArrayList<>();
        animalListCustom.add(new Animal ("Lion","Feline", 10, 220,R.drawable.lion));
        animalListCustom.add(new Animal ("Tiger","Feline", 15, 240,R.drawable.tiger));
        animalListCustom.add(new Animal ("Hawk","Bird", 12, 110,R.drawable.hawk));
        animalListCustom.add(new Animal ("Condor","Bird", 20, 190,R.drawable.condor));
        animalListCustom.add(new Animal ("Gold Fish","Fish", 3, 2,R.drawable.goldfish));
        animalListCustom.add(new Animal ("Clown Fish","Fish", 5, 1,R.drawable.clownfish));


        CustomVHListAdapter customVHListAdapter = new CustomVHListAdapter(
                this, R.layout.custom_listview_item,animalListCustom);
        lvCustomVH.setAdapter(customVHListAdapter);
    }
}
