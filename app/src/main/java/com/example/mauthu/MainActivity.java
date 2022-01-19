package com.example.mauthu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.mauthu.fragment.Fragment1;
import com.example.mauthu.fragment.Fragment2;
import com.example.mauthu.fragment.Fragment3;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    public static final int FRAGMENT_1 = 0;
    public static final int FRAGMENT_2 = 1;
    public static final int FRAGMENT_3 = 2;
    public int currentFragment = FRAGMENT_1;
    NavigationView navigationView;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Singleton.getInstance().addData();
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        replaceFragment(new Fragment1());
        navigationView.getMenu().findItem(R.id.nav_1).setChecked(true);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_1:
                if (currentFragment != FRAGMENT_1) {
                    replaceFragment(new Fragment1());
                    currentFragment = FRAGMENT_1;
                }
                break;
            case R.id.nav_2:
                if (currentFragment != FRAGMENT_2) {
                    replaceFragment(new Fragment2());
                    currentFragment = FRAGMENT_2;
                }
                break;
            case R.id.nav_3:
                if (currentFragment != FRAGMENT_3) {
                    replaceFragment(new Fragment3());
                    currentFragment = FRAGMENT_3;
                }
                break;
            default :
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) drawerLayout.closeDrawer(GravityCompat.START);
        else super.onBackPressed();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.commit();
    }

}