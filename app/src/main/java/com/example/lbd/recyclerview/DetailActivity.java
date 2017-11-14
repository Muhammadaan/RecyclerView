package com.example.lbd.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    TextView tvNamaSekolah,tvNamaTingkat,tvNamatahun;
    Image tvImage;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNamaSekolah = (TextView) findViewById(R.id.txtNamaSekolahDetail) ;

        tvNamatahun = (TextView) findViewById(R.id.txtNamaTahunDetail);





        Intent intent = getIntent();

        String namaSekolah = intent.getStringExtra("nama_sekolah");

        String namaTahun = intent.getStringExtra("nama_tahun");




        tvNamatahun.setText(namaTahun);
        tvNamaSekolah.setText(namaSekolah);

    }
}
