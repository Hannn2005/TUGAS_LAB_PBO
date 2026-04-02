package edu.university.staff;

public class Dosen extends Pegawai{
    int jumlahSKS;

    Dosen(String nama , double gajiPokok , int jumlahSKS){
        super(nama,gajiPokok);
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + (this.jumlahSKS * 150000);
    }

    @Override
    public void infoPegawai(){
        System.out.println("==============");
        System.out.println(" DATA PEGAWAI");
        System.out.println("==============");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Gaji Pokok : " + super.getGajiPokok());
        System.out.println("Jumlah SKS : " + this.jumlahSKS);
        System.out.println("Total Gaji : "+hitungGaji());
        System.out.println("Tipe Pegawai : Dosen");
        System.out.println(" ");
    }

}
