package com.dilara;

import java.util.Scanner;
import java.util.UUID;

public abstract class Personel {
    private String id;
    private String ad;
    private String soyad;
    private String telefon;
    private String adres;
    private String email;
    Scanner scanner = new Scanner(System.in);

    public void maasHesapla(){
    }

    public Personel(String ad, String soyad, String telefon, String adres, String email) {
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.adres = adres;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personel{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
