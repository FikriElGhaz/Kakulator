package com.fikri.apple.mazhabfiqih;

import android.os.Bundle;
import android.view.MenuItem;

import com.fikri.apple.mazhabfiqih.ui.dashboard.DashboardFragment;
import com.fikri.apple.mazhabfiqih.ui.home.HomeFragment;
import com.fikri.apple.mazhabfiqih.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener{

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
        manager.beginTransaction().replace(R.id.containerMazhab, fragment).commit();
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
                        new NotificationsFragment()
                );

                return  true;
        }
        return false;
    }
}
