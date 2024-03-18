package com.enes.repository;

import com.enes.entity.Kitap;

import java.util.List;

public interface IUye {
    void oduncAl(Kitap kitap);
    void oduncVer(Kitap kitap);
    void guncelle(Durum durum);
   void findAll();





}
