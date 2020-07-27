package com.fikri.apple.latihannavdrawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.versionedparcelable.NonParcelField;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.dl);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        NavigationView navigationView = findViewById(R.id.nv);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(navigationView);
        switchFragment(new HomeFragment());
        navigationView.getMenu().getItem(0).setChecked(true);

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectedItem(menuItem);
                return true;
            }
        });
    }

    private void selectedItem(MenuItem menuItem) {
        Fragment myFragment = null;
        Class fragmentClass = null;

        switch (menuItem.getItemId()){
            case  R.id.menuHome:
                fragmentClass = HomeFragment.class;
                break;
            case  R.id.menuDashboard:
                fragmentClass = DashboardFragment.class;
                break;
            case  R.id.menuProfil:
                fragmentClass = ProfilFragment.class;
                break;
        }

        try {
            myFragment = (Fragment) fragmentClass.newInstance();

        }catch (Exception e){
            e.printStackTrace();

        }

        switchFragment(myFragment);

        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        mDrawerLayout.closeDrawers();
    }

    private void switchFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flcontent, fragment).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

