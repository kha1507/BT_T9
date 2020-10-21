package com.example.android_t9;

import android.content.Context;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Context context;
    ArrayList<CountriesModel> countriesData;
    CustomAdapter customAdapter;
    CountriesModel countriesModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        countriesData = new ArrayList<>();

        //add Countries Data
        populateCountriesData();

        customAdapter = new CustomAdapter(context,countriesData);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,countriesData.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void populateCountriesData() {
        //country 1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Việt Nam");
        countriesModel.setImage(R.drawable.vn);
        countriesModel.setArea("796,095 km2");
        countriesModel.setPopulation("203,382,058");
        countriesData.add(countriesModel);

        //country 2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("Nguyen Le Thi Tieu Kha");
        countriesModel.setImage(R.drawable.lao);
        countriesModel.setArea("652,090 km2");
        countriesModel.setPopulation("25,500,100");
        countriesData.add(countriesModel);

        //country 3
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Myama");
        countriesModel.setImage(R.drawable.myama);
        countriesModel.setArea("3,287,260 km2");
        countriesModel.setPopulation("1,241,610,000");
        countriesData.add(countriesModel);

        //country 4
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("UC");
        countriesModel.setImage(R.drawable.uc);
        countriesModel.setArea("1,648,200 km2");
        countriesModel.setPopulation("77,288,000");
        countriesData.add(countriesModel);

        //country 5
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Anh");
        countriesModel.setImage(R.drawable.anh);
        countriesModel.setArea("9,640,820 km2");
        countriesModel.setPopulation("1,363,350,000");
        countriesData.add(countriesModel);

        //country 6
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("United States");
        countriesModel.setImage(R.drawable.my);
        countriesModel.setArea("9,629,090 km2");
        countriesModel.setPopulation("317,706,000");
        countriesData.add(countriesModel);

        //country 7
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Canada");
        countriesModel.setImage(R.drawable.canada);
        countriesModel.setArea("9,970,610 km2");
        countriesModel.setPopulation("35,295,770");
        countriesData.add(countriesModel);

        //country 8
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Morocco");
        countriesModel.setImage(R.drawable.vn);
        countriesModel.setArea("446,550 km2");
        countriesModel.setPopulation("33,202,300");
        countriesData.add(countriesModel);

        //country 9
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("South Africa");
        countriesModel.setImage(R.drawable.vn);
        countriesModel.setArea("1,221,040 km2");
        countriesModel.setPopulation("52,981,991");
        countriesData.add(countriesModel);

        //country 10
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Zimbabwe");
        countriesModel.setImage(R.drawable.vn);
        countriesModel.setArea("390,757 km2");
        countriesModel.setPopulation("12,973,808");
        countriesData.add(countriesModel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.add:

            case R.id.exit:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contexts_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.edit:

                break;
            case R.id.delete:

                break;
        }
        return super.onContextItemSelected(item);
    }
}
