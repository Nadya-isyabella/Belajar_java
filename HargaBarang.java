package com.belajar;


    import java.util.Scanner;

public class HargaBarang {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar barang dan harga
        String[] barang = {"Laptop", "Smartphone", "Headphone"};
        double[] harga = {10000000, 5000000, 1000000};

        // Menampilkan daftar barang dan harga
        System.out.println("Daftar Barang:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println((i+1) + ". " + barang[i] + " - Rp " + harga[i]);
        }

        // Meminta pengguna memilih barang
        System.out.print("Pilih barang (1-3): ");
        int pilihan = scanner.nextInt();

        // Memastikan input valid
        if (pilihan < 1 || pilihan > barang.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        // Meminta jumlah barang yang akan dibeli
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        // Menghitung total harga
        double total = harga[pilihan - 1] * jumlah;

        // Menampilkan total harga
        System.out.println("\nAnda membeli " + jumlah + " " + barang[pilihan - 1] + "(s) dengan total Rp " + total);
        
        // Menutup scanner
        scanner.close();
    }
}


