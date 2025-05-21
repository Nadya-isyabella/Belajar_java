package com.belajar;

public class Anggota extends Manusia{
    float gaji = 4000f;
    String nama = "nadya";
    int umur = 16;

    public void cetakdataanggota(){
        System.out.println("Nama: " + super.nama);
        System.out.println("Umur: " + super.umur);
        System.out.println("Gaji: $" + gaji);
    }

   
} 
