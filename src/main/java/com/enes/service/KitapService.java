package com.enes.service;
import com.enes.entity.Kitap;
import com.enes.repository.Durum;
import com.enes.repository.IUye;

import static com.enes.utility.Db_InMemory_Cache.*;


public class KitapService {
private final IUye iUye;

    public KitapService(IUye iUye) {

        this.iUye = iUye;
    }
    public boolean uyeEkle(String ad,String soyad)
    {
        uyeList.add(ad);
        return true;
    }
        public boolean oduncVer(String k_ad, String k_tur, String baslik, String yazar,
                                String yayin_yil, Durum durum)
        {

      kitapList.add(k_ad);
            return true;
        }
    public  void oduncAl(int kitap){
        kitapList.remove(kitap);

    }
    public void oduncVer(Kitap kitap) {
        kitapList.add(kitap.getK_ad());
    }
    public void guncelle(Durum durum) {
        switch (durum) {
            case Durum.OduncAlabilir -> System.out.println("Kitap, ödünç alınabilir.");
            case Durum.OduncVerildi -> System.out.println("Kitap, ödünçte gözükmektedir.");
            case Durum.MevcutDegil -> System.out.println("Kitap, kütüphane kayitlarımızda bulunmamaktadır.");
        }
    }
    public void findAll()

    {

         kitapList.forEach(System.out::println);
    }
}
