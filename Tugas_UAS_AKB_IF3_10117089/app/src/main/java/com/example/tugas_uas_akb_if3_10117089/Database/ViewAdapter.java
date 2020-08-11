package com.example.tugas_uas_akb_if3_10117089.Database;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/** NIM : 10117089
 * Nama : Shendi Permana
 * Kelas : IF-3
 * Tanggal : 08-08-2020**/

public class ViewAdapter extends FragmentPagerAdapter {
    public final List<Fragment> mFragmentList = new ArrayList<>();

    public ViewAdapter(FragmentManager manager){
        super(manager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
