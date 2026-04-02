package edu.university.staff;

public class Staf_Administrasi extends Pegawai{
    int jamLembur;

    Staf_Administrasi(String nama, double gajiPokok, int jamLembur){
        super(nama,gajiPokok);
        this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + (this.jamLembur * 50000);
    }

    @Override
    public void infoPegawai(){
        System.out.println("==============");
        System.out.println(" DATA PEGAWAI");
        System.out.println("==============");
        System.out.println("Nama : " + super.getNama());
        System.out.println("Gaji Pokok : " + super.getGajiPokok());
        System.out.println("Jumlah SKS : " + this.jamLembur);
        System.out.println("Total Gaji : "+hitungGaji());
        System.out.println("Tipe Pegawai : Staff Administrasi");
        System.out.println(" ");
    }
}
