package edu.transport;

public class MainApp {
    public static void main(String[] args){
        Mobil mobil = new Mobil("Fortuner",200);
        Motor motor = new Motor("Supra Geter",70);


        System.out.printf("Waktu Tempuh Mobil %s : %.2f Jam\n",mobil.getNama(),mobil.hitungWaktuTempuh(120));
        System.out.printf("Waktu Tempuh Motor %s : %.2f Jam\n",motor.getNama(),motor.hitungWaktuTempuh(120));
    }
}
