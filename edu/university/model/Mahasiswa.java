package edu.university.model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    Mahasiswa(){};

    Mahasiswa(String nim,String nama,double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getKategoriIPK(){
        String kategori;
        if(this.ipk >= 3.5){
            kategori = "Cumlaude";
            System.out.println("Cumlaude");
        } else if (this.ipk > 3.0 && this.ipk <3.49) {
            kategori = "Sangat Memuaskan";
        } else if (this.ipk > 2.5 && this.ipk <2.99) {
            kategori = "Memuaskan";
        }else{
            kategori = "Perlu Perbaikan";
        }
        return  kategori;
    }

    public void dataMahasiswa(){
        System.out.println("DATA MAHASISWA/I");
        System.out.println("================");
        System.out.println("NIM  : "+ this.nim);
        System.out.println("Nama : "+ this.nama);
        System.out.println("IPK  : "+ this.ipk);
        System.out.println("Kategori IPK : "+ getKategoriIPK());
        System.out.println(" ");
    }
}
