package com.example.fatima.hospital;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {

                case R.id.navigation_drugs:
                    selectedFragment = Drugs.newInstance();
                    break;

                case R.id.navigation_illness:
                    selectedFragment = Illnesses.newInstance();
                    break;
                case R.id.navigation_rig:
                    selectedFragment = Rigs.newInstance();
                    break;

                case R.id.navigation_paraclinic:
                    selectedFragment= Paraclinic.newInstance();
                    break;
                case R.id.navigation_info:
                    selectedFragment = AboutUs.newInstance();
                    break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, Drugs.newInstance());
        transaction.commit();


    }
}
