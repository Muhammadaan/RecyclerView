package com.example.lbd.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lbd.recyclerview.adapter.RiwayatSekolahAdapter;
import com.example.lbd.recyclerview.models.RiwayatSekolah;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvlistriwayatsekolah;
    RiwayatSekolahAdapter mAdapter;
    List<RiwayatSekolah> listriwayatsekolah = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Buat inisiasi komponen

        rcvlistriwayatsekolah = (RecyclerView) findViewById(R.id.listriwayatsekolah);

        mAdapter = new RiwayatSekolahAdapter(listriwayatsekolah);
        RecyclerView.LayoutManager  mLayoutmanager = new LinearLayoutManager(getApplicationContext());

        rcvlistriwayatsekolah.setLayoutManager(mLayoutmanager);

        rcvlistriwayatsekolah.setAdapter(mAdapter);
        loadData();
    }

    private void loadData() {
        RiwayatSekolah mData = new RiwayatSekolah("SMP 1 PAKIS","Sekolah Dasar","2016");
        listriwayatsekolah.add(mData);

        mData = new RiwayatSekolah("SMA 10 Malang","Sekolah Dasar","1995");
        listriwayatsekolah.add(mData);












    }
}
