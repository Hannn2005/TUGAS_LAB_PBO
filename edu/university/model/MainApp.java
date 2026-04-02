package edu.university.model;

public class MainApp {
    public static void main(String[] args){
        Mahasiswa[] mahasiswa= new Mahasiswa[3];

        mahasiswa[0] = new Mahasiswa("241401060","Andi",4);
        mahasiswa[1] = new Mahasiswa("241401060","Budi",3.38);
        mahasiswa[2] = new Mahasiswa("241401060","Caca",2.2);

        for(Mahasiswa m : mahasiswa ){
            m.dataMahasiswa();
        }

    }
}
