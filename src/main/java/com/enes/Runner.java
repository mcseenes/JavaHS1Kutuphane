package com.enes;

import com.enes.controller.KitapController;
import com.enes.entity.KitapBilim;
import com.enes.repository.Durum;
import com.enes.utility.DB_Type;

public class Runner {
    public static void main(String[] args) {
        try {
            Menu menu=new Menu();
            menu.secim();

        }catch (Exception exception){
            System.out.println("DOGRU DEGER GIRINIZ"+exception);
        }

    }
}
