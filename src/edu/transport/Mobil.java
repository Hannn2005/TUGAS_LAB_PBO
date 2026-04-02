package edu.transport;

public class Mobil extends Kendaraan{

    Mobil(String nama, double kecepatanMaks){
        super(nama,kecepatanMaks);
    }


    @Override
    public double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif = super.getKecepatanMaks() * (0.8);

        return jarak / kecepatanEfektif;
    }

}
