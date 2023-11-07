package org.example;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    public static void main(String[] args){
        Otel otel = new Otel();
        Customer customer = new Customer();
        Rezervation rezervation = customer.yeniRezervasyon(RezervasyonType.ONLINE_YAPILAN,otel);
        RezervationChange degisiklik = new RezervationChange();
        degisiklik.rezervasyonIptal(rezervation,otel);
        List<Rezervation> bulunanRezervasyonlar = otel.rezervasyonlariBul("Müşteri Adı");
        for (Rezervation bulunanRezervation: bulunanRezervasyonlar) {
            System.out.println("Bulunan Rezervasyon:" +bulunanRezervation.getMusteriAdi());
        }
    }

    public static class Otel {
        private List<Rezervation> rezervasyonlar = new ArrayList<>();
        public void yeniRezervasyonlar(Rezervation rezervation) {
            rezervasyonlar.add(rezervation);
        }
        public void rezervasyonIptal(Rezervation rezervation){
            rezervasyonlar.remove(rezervation);
        }
        public List<Rezervation> rezervasyonlariBul(String isim){
            List<Rezervation> bulunanRezervasyonlar = new ArrayList<>();
            for (Rezervation rezervation: rezervasyonlar){
                if(rezervation.getMusteriAdi().equals(isim)){
                    bulunanRezervasyonlar.add(rezervation);
                }
            }
            return bulunanRezervasyonlar;
        }

        public void yeniRezervasyon() {
        }
    }

    public static class Customer {
        public Rezervation yeniRezervasyon(RezervasyonType tip, Otel otel) {
            Rezervation rezervation = new Rezervation(this,tip);
            otel.yeniRezervasyon()(rezervation);
            return rezervation;
        }
    }

    public enum RezervasyonType {
        TELEFONLA_YAPILAN,
        ONLINE_YAPILAN
    }

    public static class Rezervation {
        private Customer customer;
        private RezervasyonType tip;
        public Rezervation(Customer customer,RezervasyonType tip){
            this.customer = customer;
            this.tip = tip;
        }
        public RezervasyonType getTip(){
            return tip;
        }
        public Customer getMusteri(){
            return customer;
        }
        public String getMusteriAdi(){
            return customer.toString();
        }


    }

    public static class RezervationChange {
        public void rezervasyonIptal(Rezervation rezervation, Otel otel){
            otel.rezervasyonIptal(rezervation);
        }
    }
}
