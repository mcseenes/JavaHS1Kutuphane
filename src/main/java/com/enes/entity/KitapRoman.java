package com.enes.entity;

import com.enes.repository.Durum;

public class KitapRoman extends Kitap {
    public KitapRoman(String baslik, String yazar, String yayin_yil, String k_ad, String k_tur, Durum durum) {
        super(baslik, yazar, yayin_yil, k_ad, k_tur, durum);
    }
}
