package com.fikri.apple.listpahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<HeroModel> heroModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.rvHero);
        rvHeroes.setHasFixedSize(true);
        getSupportActionBar().setTitle("Recyler View Heroes");

        heroModels.addAll(HeroData.getListData());
        setRecyclerView();
    }

    private void setRecyclerView() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(heroModels,this);
        rvHeroes.setAdapter(listHeroAdapter);
    }

    private void setGridRecylerView(){

        rvHeroes.setLayoutManager(new GridLayoutManager(this,2));
        GridHeroAdapter gridHeroAdapter = new GridHeroAdapter(heroModels,this);
        rvHeroes.setAdapter(gridHeroAdapter);

    }

    private void setCardViewRecylerView() {

        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(heroModels, this);
        rvHeroes.setAdapter(cardViewHeroAdapter);
    }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case  R.id.action_list:
                setRecyclerView();
                getSupportActionBar().setTitle("Recyler View Heroes");
                break;
            case  R.id.action_grid:
                setGridRecylerView();
                getSupportActionBar().setTitle("Grid Heroes");
                break;
            case  R.id.action_cardview:
                setCardViewRecylerView();
                getSupportActionBar().setTitle("Card View Heroes");
                break;
        }
    }
}
