package edu.university.staff;


public class MainApp {
    public static void main(String[] args){
        Pegawai[] dataPegawai = new Pegawai[2];

        dataPegawai[0] = new Dosen("Andi",3500000,10);
        dataPegawai[1] = new Staf_Administrasi("Budi",1500000,10);

        for(Pegawai p : dataPegawai){
            p.infoPegawai();
        }
    }
}
