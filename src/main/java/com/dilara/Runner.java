package com.dilara;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner {
    public static void main(String[] args){
        DosyaOku dosyaOku = new DosyaOku();

        Personel personel = new Memur("Aydın","Surucul","05346728961",
                "Uskudar/Istanbul","aydinsurucul@gmail.com");
        //personel.maasHesapla();
        Personel personel2 = new Yonetici("Elif","Karamursel","05456533453",
                "Umraniye/Istanbul","karamursele@gmail.com");
        personel2.maasHesapla();
    }

}
