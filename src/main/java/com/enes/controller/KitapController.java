package com.enes.controller;
import com.enes.repository.Durum;
import com.enes.repository.LibraryRepositoryFileImpl;
import com.enes.repository.LibraryRepositoryMemoryImpl;
import com.enes.repository.LibraryRepositoryPostgreSQLImpl;
import com.enes.service.KitapService;
import com.enes.utility.DB_Type;
import static com.enes.utility.Db_InMemory_Cache.*;
import java.util.Scanner;
import static com.enes.utility.Db_InMemory_Cache.kitapList;
public class KitapController {
    private final KitapService kitapService;
    public KitapController(DB_Type type) {
        switch (type) {
            case FILE -> this.kitapService = new KitapService(new LibraryRepositoryFileImpl());
            case IN_MEMORY -> this.kitapService = new KitapService(new LibraryRepositoryMemoryImpl());
            case POSTGRESQL -> this.kitapService = new KitapService(new LibraryRepositoryPostgreSQLImpl());
            default -> this.kitapService = new KitapService(new LibraryRepositoryMemoryImpl());
        }
    }

    public boolean uyeEkle()
    {
     String ad = new Scanner(System.in).nextLine();
     System.out.println("Adinizi  giriniz:");
     String soyad = new Scanner(System.in).nextLine();
     System.out.println("Soyadinizi giriniz:");
     boolean isSave=kitapService.uyeEkle(ad,soyad);
     System.out.println("KAYIT YAPILDI");
     return true;
     }

        public void oduncVer () {
            String k_ad = new Scanner(System.in).nextLine();
            System.out.println("Kitap Turu  giriniz:");
            String k_tur = new Scanner(System.in).nextLine();
            System.out.println("Baslik giriniz:");
            String baslik = new Scanner(System.in).nextLine();
            System.out.println("Yazar  giriniz:");
            String yazar = new Scanner(System.in).nextLine();
            System.out.println("Yayin yili  giriniz:");
            String yayin_yil = new Scanner(System.in).nextLine();
            System.out.println("Kitabin durumunu  giriniz:");
            Durum durum = Durum.valueOf(new Scanner(System.in).nextLine());
            boolean isSave = kitapService.oduncVer(k_ad, k_tur,baslik,yazar,yayin_yil,durum);
            if (isSave)
                System.out.println("KAYIT YAPILDI");
            else
                System.out.println("KAYIT YAPILAMADI");
        }
    public void oduncAl ()
    {
        System.out.println("ODUNC ALMAK ISTEDIGINIZ INDEX I GIRINIZ:");
        int index=new Scanner(System.in).nextInt();
        kitapService.oduncAl(index);
    }
    public void findAll(){

        kitapService.findAll();
    }


}




