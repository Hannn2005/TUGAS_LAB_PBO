package edu.university.staff;

public class Pegawai {
    private String nama;
    private double gajiPokok;

    Pegawai(String nama , double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji(){
        return this.gajiPokok;
    }

    public String getNama(){
        return this.nama;
    }

    public Double getGajiPokok(){
        return this.gajiPokok;
    }

    public void infoPegawai(){}
}
