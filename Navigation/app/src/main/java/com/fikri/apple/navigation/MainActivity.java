package com.fikri.apple.navigation;

import android.os.Bundle;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);

        switchToFragment(new HomeFragment());


    }

    private void switchToFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.containerOk, fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.navigation_home:
                switchToFragment(
                        new HomeFragment()
                );
                return  true;
            case R.id.navigation_dashboard:
                switchToFragment(
                        new DashboardFragment()
                );
                return true;
            case R.id.navigation_notifications:
                switchToFragment(
                        new NotificationFragment()
                );
                return true;
            case R.id.navigation_smile:
                switchToFragment(
                        new SmileFragment()
                );
                return  true;
        }
        return false;
    }
}
