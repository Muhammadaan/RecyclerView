package com.example.lbd.recyclerview.adapter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.lbd.recyclerview.DetailActivity;
import com.example.lbd.recyclerview.R;
import com.example.lbd.recyclerview.models.RiwayatSekolah;

import java.util.List;

/**
 * Created by LBD on 14/11/2017.
 */

public class RiwayatSekolahAdapter extends RecyclerView.Adapter<RiwayatSekolahAdapter.MyviewHolder> {

//    langka1
    List<RiwayatSekolah> listRiwayatSekolah;

//    langka 2
    public RiwayatSekolahAdapter(List<RiwayatSekolah> listRiwayatSekolah)

    {
        this.listRiwayatSekolah = listRiwayatSekolah;
    }

//    Return emplate item yg mana  di pakai
//    langka 4 ,,buat vie holder
    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);


        return new MyviewHolder(itemView);
   }

//    mengisi data ke template
    @Override
    public void onBindViewHolder(final MyviewHolder holder, int position) {



        final RiwayatSekolah itemRiwayat = listRiwayatSekolah.get(position);
        holder.txtnamasekolah.setText(itemRiwayat.getNamaSekolah());
        holder.txtnamatahun.setText(itemRiwayat.getTahunSekolah());
        holder.txtnamatingkat.setText(itemRiwayat.getTingkatSekolah());


//        Gambar
        Drawable mdDrawable holder.itemView.getContext()
                .getResources()
                .getDrawable(itemRiwayat.getPhoto);
        holder.imgRiwayatSekolah.setImageDrawable(mdDrawable);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                mIntent.putExtra("nama_sekolah",itemRiwayat.getNamaSekolah());
                mIntent.putExtra("nama_tahun",itemRiwayat.getTahunSekolah());
                mIntent.putExtra("nama_tingkat",itemRiwayat.getTingkatSekolah());
                mIntent.putExtra("ini_image",R.drawable.images);
                holder.itemView.getContext().startActivity(mIntent);
            }
        });



    }
//langka 3
//    Return Jumlah Data
    @Override
    public int getItemCount() {
        return listRiwayatSekolah.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {

        TextView txtnamasekolah,txtnamatingkat,txtnamatahun;
        public MyviewHolder(View itemView) {
            super(itemView);

//            Langkah 5 . menghubunhgkan layou ke activitu
             txtnamasekolah = itemView.findViewById(R.id.txtnamasekolah);
             txtnamatingkat = itemView.findViewById(R.id.txtnamatingkat);
             txtnamatahun = itemView.findViewById(R.id.txtnamatahun);
        }
    }
}
