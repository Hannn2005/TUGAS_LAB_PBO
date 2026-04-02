package edu.transport;

abstract class Kendaraan {
    private String nama;
    private double kecepatanMaks;

    Kendaraan(String nama, double kecepatanMaks){
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }


    abstract double hitungWaktuTempuh(double jarak);


    public double getKecepatanMaks() {
        return this.kecepatanMaks;
    }

    public String getNama(){
        return this.nama;
    }



}
