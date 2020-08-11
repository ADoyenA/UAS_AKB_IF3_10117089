package com.example.tugas_uas_akb_if3_10117089.View;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.tugas_uas_akb_if3_10117089.MainActivity;
import com.example.tugas_uas_akb_if3_10117089.R;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;


/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/
public class OnBoardSliderActivity extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Daftar Data Wisata")
                .setContent("Tampil Daftar Data Wisata")
                .setBackgroundColor(Color.parseColor("#ac0303")) // int background color
                .setDrawable(R.drawable.vp1) // int top drawable
                .setSummary("Menampilkan Kumpulan Daftar Wisata")
                .build());
        addFragment(new Step.Builder().setTitle("Deskripsi Wisata")
                .setContent("Tampil Deskripsi Wisata")
                .setBackgroundColor(Color.parseColor("#ac0303")) // int background color
                .setDrawable(R.drawable.vp2) // int top drawable
                .setSummary("Menampilkan Deskripsi Wisata Secara Detail")
                .build());
        addFragment(new Step.Builder().setTitle("Lokasi Di Google Map")
                .setContent("Tampil Lokasi Di Google Map")
                .setBackgroundColor(Color.parseColor("#ac0303")) // int background color
                .setDrawable(R.drawable.vp3) // int top drawable
                .setSummary("Menampilkan Lokasi Wisata di Google Map")
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardSliderActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
