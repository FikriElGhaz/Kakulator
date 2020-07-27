package com.fikri.apple.footballapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCountry;
    ArrayList<CountryModel> countryModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCountry = findViewById(R.id.rvCountry);
        rvCountry.setHasFixedSize(true);

        countryModels.addAll(CountryData.getListData());
        
        setReyclerView();
    }

    private void setReyclerView() {
        rvCountry.setLayoutManager(new LinearLayoutManager(this));
        ItemCountryAdapter itemCountryAdapter = new ItemCountryAdapter(countryModels, this);
        rvCountry.setAdapter(itemCountryAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about){
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
}
