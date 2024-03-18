package com.dilara;

public class Yonetici extends Personel{
    private String mevki;
    private double bonusOdeme;

    public String getMevki() {
        return mevki;
    }

    public Yonetici(String ad, String soyad, String telefon, String adres, String email) {
        super(ad, soyad, telefon, adres, email);
        this.mevki = "^ Yonetici ^";
    }
    @Override
    public void maasHesapla(){
        System.out.println("Aylık çalışma saatini giriniz.");
        double aylikCalismaSaati = scanner.nextDouble();
        System.out.println("Yöneticinin saatlik ücretini giriniz.");
        double saatlikUcret = scanner.nextDouble();
        if (saatlikUcret<500)
            saatlikUcret = 500;
        System.out.println("Yöneticinin bonus ödeme miktarını giriniz.");
        double bonus = scanner.nextDouble();
        double maasHesabi = aylikCalismaSaati*saatlikUcret+bonus;
        System.out.println("Yöneticinin maaşı hesaplandı. Aylık maaş: "+maasHesabi);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Yonetici{");
        sb.append("mevki='").append(mevki).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
