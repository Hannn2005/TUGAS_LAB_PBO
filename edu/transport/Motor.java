package edu.transport;

public class Motor extends Kendaraan{

    Motor(String nama, double kecepatanMaks){
        super(nama,kecepatanMaks);
    }

    @Override
    double hitungWaktuTempuh(double jarak) {
        double kecepatanEfektif = super.getKecepatanMaks() * (0.9);

        return jarak / kecepatanEfektif;
    }
}
