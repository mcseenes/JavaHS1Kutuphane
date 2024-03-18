package com.enes;

import com.enes.controller.KitapController;
import com.enes.utility.DB_Type;

import java.util.Scanner;

public class Menu {
    public void uyeEkle(){
        int secim;
        System.out.println("""
                ***********************************
                ***********KULLANICI ISLEMLERI*****
                1.Kullanici ekleme
                2.Kullanici listeleme
                3.Kullaniciyi Sil
                0.CIKIS    
                """);
        do {
            System.out.println("SECINIZ:");
            secim = new Scanner(System.in).nextInt();
            switch (secim) {
                case 1:
                    new KitapController(DB_Type.IN_MEMORY).oduncVer();
                    break;
                case 2:
                    new KitapController(DB_Type.IN_MEMORY).findAll();
                    break;
                case 3:
                    new KitapController(DB_Type.IN_MEMORY).oduncAl();
                    break;
            }
        } while (secim != 0);
    }
    public void secim() {
        int secim;
        System.out.println("""
                ***********************************
                ***********KULLANICI ISLEMLERI*****
                1.Kullanici ekleme
                2.Kullanici listeleme
                3.Kullaniciyi Sil
                0.CIKIS    
                """);
        do {
            System.out.println("SECINIZ:");
            secim = new Scanner(System.in).nextInt();
            switch (secim) {
                case 1:
                    new KitapController(DB_Type.IN_MEMORY).oduncVer();
                    break;
                case 2:
                    new KitapController(DB_Type.IN_MEMORY).findAll();
                    break;
                case 3:
                    new KitapController(DB_Type.IN_MEMORY).oduncAl();
                    break;
            }
        } while (secim != 0);
    }
}
