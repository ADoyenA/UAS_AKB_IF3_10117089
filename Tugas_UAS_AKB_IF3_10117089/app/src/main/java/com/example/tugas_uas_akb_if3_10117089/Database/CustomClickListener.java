package com.example.tugas_uas_akb_if3_10117089.Database;

import android.view.View;

/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/

public class CustomClickListener  implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;
    public CustomClickListener(int position, CustomClickListener.OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }

    public interface  OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
