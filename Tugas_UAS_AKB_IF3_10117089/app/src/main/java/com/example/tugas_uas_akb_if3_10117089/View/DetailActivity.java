package com.example.tugas_uas_akb_if3_10117089.View;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tugas_uas_akb_if3_10117089.Database.CustomClickListener;
import com.example.tugas_uas_akb_if3_10117089.Database.TourPlace;
import com.example.tugas_uas_akb_if3_10117089.Database.TourPlaceHelper;
import com.example.tugas_uas_akb_if3_10117089.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama, tvAlamat, tvWaktuBuka, tvDeskripsi;
    private ImageView tvFoto;
    private TourPlace tp;
    private TourPlaceHelper tpHelper;
    private ImageButton btnSubmit;
    private int position;


    public static final String EXTRA_NOTE = "extra_note";
    public static final String EXTRA_POSITION = "extra_position";
    public static final int REQUEST_UPDATE = 200;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();

        tvNama = findViewById(R.id.nama_wisata);
        tvAlamat = findViewById(R.id.alamat);
        tvWaktuBuka = findViewById(R.id.waktuBuka);
        tvDeskripsi = findViewById(R.id.deskripsi);
        tvFoto = findViewById(R.id.gambar_wisata);
        btnSubmit = findViewById(R.id.btn_submit);

        tpHelper = TourPlaceHelper.getInstance(getApplicationContext());

        tp = getIntent().getParcelableExtra(EXTRA_NOTE);

        tvNama.setText(tp.getNama());
        tvAlamat.setText(tp.getAlamat());
        tvWaktuBuka.setText(tp.getWaktuBuka());
        tvDeskripsi.setText(tp.getDeskripsi());
        Glide.with(this)
                .asBitmap()
                .load(tp.getFoto())
                .into(tvFoto);

        btnSubmit.setOnClickListener(new CustomClickListener(position, new CustomClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(DetailActivity.this, MapActivity.class);
                intent.putExtra(DetailActivity.EXTRA_POSITION, position);
                intent.putExtra(DetailActivity.EXTRA_NOTE, tp);
                startActivity(intent);
            }
        }));
        }

}
