package com.example.lbd.recyclerview.models;

/**
 * Created by LBD on 14/11/2017.
 */

public class RiwayatSekolah {

    String NamaSekolah,TingkatSekolah,TahunSekolah;

    public RiwayatSekolah(String namaSekolah, String tingkatSekolah, String tahunSekolah) {
        NamaSekolah = namaSekolah;
        TingkatSekolah = tingkatSekolah;
        TahunSekolah = tahunSekolah;
    }

    public String getNamaSekolah() {
        return NamaSekolah;
    }

    public String getTingkatSekolah() {
        return TingkatSekolah;
    }

    public String getTahunSekolah() {
        return TahunSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        NamaSekolah = namaSekolah;
    }

    public void setTingkatSekolah(String tingkatSekolah) {
        TingkatSekolah = tingkatSekolah;
    }

    public void setTahunSekolah(String tahunSekolah) {
        TahunSekolah = tahunSekolah;
    }
}
