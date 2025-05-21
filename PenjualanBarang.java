package com.belajar;

import java.util.Scanner;

public class PenjualanBarang { 

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu awal
        System.out.println("===== Program Penjualan Barang =====");
        System.out.print("Masukkan jumlah barang yang ingin dijual: ");
        int jumlahBarang = scanner.nextInt();

        String[] namaBarang = new String[jumlahBarang];
        double[] hargaBarang = new double[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];

        // Input data barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print("\nMasukkan nama barang ke-" + (i + 1) + ": ");
            namaBarang[i] = scanner.next();
            System.out.print("Masukkan harga barang ke-" + (i + 2) + ": ");
            hargaBarang[i] = scanner.nextDouble();
            System.out.print("Masukkan jumlah beli barang ke-" + (i + 1) + ": ");
            jumlahBeli[i] = scanner.nextInt();
        }

        @SuppressWarnings("unused")
        double totalharga = 0;
        
        // Menampilkan hasil perhitungan harga
        System.out.println("\n===== Detail Penjualan =====");
        for (int i = 0; i < jumlahBarang; i++) {
            double totalItem = hargaBarang[i] * jumlahBeli[i];
            System.out.println(namaBarang[i] + " | Harga: " + hargaBarang[i] + " | Jumlah: " + jumlahBeli[i] + " | Total: " + totalItem);
        }
    }
}
