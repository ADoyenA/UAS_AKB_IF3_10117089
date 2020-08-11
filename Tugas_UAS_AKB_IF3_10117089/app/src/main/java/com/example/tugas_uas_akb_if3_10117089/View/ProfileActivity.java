package com.example.tugas_uas_akb_if3_10117089.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_akb_if3_10117089.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/
public class ProfileActivity extends Fragment {
    public ProfileActivity () {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        // Inflate the layout for this fragment
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        return inflater.inflate(R.layout.activity_profile, container, false);
    }
}
