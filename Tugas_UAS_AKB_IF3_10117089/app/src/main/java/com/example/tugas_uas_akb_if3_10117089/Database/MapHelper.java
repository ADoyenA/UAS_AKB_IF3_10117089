package com.example.tugas_uas_akb_if3_10117089.Database;

import android.database.Cursor;

import java.util.ArrayList;

/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/

public class MapHelper {
    public static ArrayList<TourPlace> mapCursorToArrayList(Cursor TourPlaceCursor) {
        ArrayList<TourPlace> TourPlaceList = new ArrayList<>();

        while (TourPlaceCursor.moveToNext()) {
           int id = TourPlaceCursor.getInt(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.id));
           String nama = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.nama));
           String alamat = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.alamat));
            String waktuBuka = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.waktubuka));
            String deskripsi = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.deskripsi));
            String foto = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.foto));
            String lang = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.lang));
            String leng = TourPlaceCursor.getString(TourPlaceCursor.getColumnIndexOrThrow(DatabaseHelper.MyColumns.leng));
            TourPlaceList.add(new TourPlace(id, nama, alamat, waktuBuka, deskripsi, foto, lang, leng));

        }
        return TourPlaceList;
    }

}
