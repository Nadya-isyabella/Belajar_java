package com.belajar;
//Latihan method non void
public class Mobilku {
    String warna1;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    //Method mengisi variabel instance
    void isi (String warna1, int tahun_produksi, int nomor_mesin, int nomor_rangka){
        this.warna1 = warna1;
        this.tahunProduksi = tahun_produksi;
        this.nomorMesin = nomor_mesin;
        this.nomorRangka = nomor_rangka;
    }
    //Method menampilkan isi variabel
    String ambil_warna(){
            return warna1;
    }
    int ambil_tahun_produksi(){
        return tahunProduksi;
    }
     int ambil_nomorMesin(){
        return nomorMesin;
     }
     int ambil_nomorRangka(){
        return nomorMesin;
     }
     public static void main(String[] args) {
        Mobilku mobilNiaga = new Mobilku();
        //Proses pemanggilan method void 
        mobilNiaga.isi("Putih", 2018, 23456, 89567);
        System.out.println("warna : " + mobilNiaga.ambil_warna());
        System.out.println("Tahun Produksi : "+ mobilNiaga.ambil_tahun_produksi());
        System.out.println("Nomor Mesin : " + mobilNiaga.ambil_nomorMesin());
        System.out.println("Nomor Rangka : " + mobilNiaga.ambil_nomorRangka());

     }
    }

