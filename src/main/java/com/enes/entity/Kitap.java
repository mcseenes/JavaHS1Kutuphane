package com.enes.entity;

import com.enes.repository.Durum;

import java.util.Random;

public abstract class Kitap extends Kutuphane {
    private long ISBN;
    private String baslik;
    private String yazar;
    private String yayin_yil;
    private String k_ad;
    private String k_tur;
    private Durum durum;

    public Kitap(String baslik, String yazar, String yayin_yil, String k_ad, String k_tur, Durum durum) {
        this.ISBN = new Random().nextLong(0,100);
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayin_yil = yayin_yil;
        this.k_ad = k_ad;
        this.k_tur = k_tur;
        this.durum = durum;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYayin_yil() {
        return yayin_yil;
    }

    public void setYayin_yil(String yayin_yil) {
        this.yayin_yil = yayin_yil;
    }

    public String getK_ad() {
        return k_ad;
    }

    public void setK_ad(String k_ad) {
        this.k_ad = k_ad;
    }

    public String getK_tur() {
        return k_tur;
    }

    public void setK_tur(String k_tur) {
        this.k_tur = k_tur;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kitap{");
        sb.append("ISBN=").append(ISBN);
        sb.append(", baslik='").append(baslik).append('\'');
        sb.append(", yazar='").append(yazar).append('\'');
        sb.append(", yayin_yil='").append(yayin_yil).append('\'');
        sb.append(", k_ad='").append(k_ad).append('\'');
        sb.append(", k_tur='").append(k_tur).append('\'');
        sb.append(", durum=").append(durum);
        sb.append('}');
        return sb.toString();
    }
}
