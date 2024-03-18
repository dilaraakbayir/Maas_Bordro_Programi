package com.dilara;

public class Memur extends Personel{
    private String mevki;

    public void setMevki(String mevki) {
        this.mevki = mevki;
    }

    public String getMevki() {
        return mevki;
    }

    public Memur(String ad, String soyad, String telefon, String adres, String email) {
        super(ad, soyad, telefon, adres, email);
        this.mevki = "^ Memur ^";
    }
    @Override
    public void maasHesapla(){
        System.out.println("Aylık çalışma saatini giriniz.");
        double aylikCalismaSaati = scanner.nextDouble();
        System.out.println("Memurun saatlik ücretini giriniz.");
        double saatlikUcret = scanner.nextDouble();
        if (saatlikUcret==0){
            saatlikUcret = 500;
        }
        double ekMesai= aylikCalismaSaati-180;
        double mesaiUcreti = 0;
        if (aylikCalismaSaati>180){
            mesaiUcreti = ekMesai*1.5*saatlikUcret;
        }
        double maasHesabi = (aylikCalismaSaati*saatlikUcret)+mesaiUcreti;
        System.out.println("Memur maaşı hesaplandı. Aylık maaş: "+maasHesabi);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Memur{");
        sb.append("mevki='").append(mevki).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
