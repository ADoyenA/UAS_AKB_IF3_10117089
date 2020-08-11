package com.example.tugas_uas_akb_if3_10117089;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tugas_uas_akb_if3_10117089.Database.DatabaseHelper;
import com.example.tugas_uas_akb_if3_10117089.Database.TourPlace;
import com.example.tugas_uas_akb_if3_10117089.View.ContactActivity;
import com.example.tugas_uas_akb_if3_10117089.View.ListTourPlaceActivity;
import com.example.tugas_uas_akb_if3_10117089.View.ProfileActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.IOException;

/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/
public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

  //  MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03AC0E")));

        DatabaseHelper dh = new DatabaseHelper(getBaseContext());
        Toast.makeText(getApplication(), dh.getDatabaseName() +" sudah ada", Toast.LENGTH_SHORT).show();

        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ListTourPlaceActivity()).commit();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        FragmentManager fragmentManager = getSupportFragmentManager();
        ListTourPlaceActivity fragmentListTour = new ListTourPlaceActivity();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragmentListTour).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.friend:
                            selectedFragment = new ListTourPlaceActivity();
                            break;
                        case R.id.contact:
                            selectedFragment = new ContactActivity();
                            break;
                        case R.id.profile:
                            selectedFragment = new ProfileActivity();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };

}
