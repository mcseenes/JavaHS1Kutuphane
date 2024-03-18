package com.enes.entity;
import com.enes.repository.IUye;
import com.enes.utility.Db_InMemory_Cache;
import java.util.List;
import java.util.Random;

public class Uye extends Kutuphane implements IUye {



    private long id;
    private String ad;
    private String soyad;

    public Uye(long id, String ad, String soyad) {
        this.id = new Random().nextInt(0,100);
        this.ad = ad;
        this.soyad = soyad;
    }

    public Uye(String ad, String soyad) {
        this.id=new Random().nextLong(0,100);
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Uye{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append('}');
        return sb.toString();
    }









}
