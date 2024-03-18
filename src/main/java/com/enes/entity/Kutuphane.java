package com.enes.entity;

import com.enes.repository.Durum;
import com.enes.repository.IUye;

import java.util.List;
import java.util.Random;

import static com.enes.utility.Db_InMemory_Cache.kitapList;

public class Kutuphane implements IUye{


    @Override
    public void oduncAl(Kitap kitap) {

        kitapList.remove(kitap);
    }

    @Override
    public void oduncVer(Kitap kitap) {
        kitapList.add(kitap.getK_ad());
    }

    @Override
    public void guncelle(Durum durum) {
        switch (durum) {
            case Durum.OduncAlabilir -> System.out.println("Kitap, ödünç alınabilir.");
            case Durum.OduncVerildi -> System.out.println("Kitap, ödünçte gözükmektedir.");
            case Durum.MevcutDegil -> System.out.println("Kitap, kütüphane kayitlarımızda bulunmamaktadır.");
        }
    }

    @Override
    public void findAll() {

    }



}
