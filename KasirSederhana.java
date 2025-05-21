package com.belajar;


import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBelanja = 0;
        int jumlahItem = 4; // Jumlah item yang sudah ditentukan

        // Menyimpan nama dan harga item
        String[] namaItem = {"Pena", "Buku", "Penggaris", "Penghapus"};
        double[] hargaItem = {5000, 5000, 4000, 6000};
        int[] jumlahBarang = new int[jumlahItem]; // Array untuk jumlah barang

        // Input jumlah barang untuk setiap item
        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Masukkan jumlah " + namaItem[i] + " yang dibeli: ");
            jumlahBarang[i] = scanner.nextInt();
        }

        // Menambahkan harga setiap item ke total belanja
        for (int i = 0; i < jumlahItem; i++) {
            totalBelanja += hargaItem[i] * jumlahBarang[i]; // Mengalikan harga dengan jumlah barang
        }

        // Input uang yang dibayar oleh pelanggan
        System.out.print("Masukkan jumlah uang yang dibayar: ");
        double uangDibayar = scanner.nextDouble();

        // Menghitung kembalian
        double kembalian = uangDibayar - totalBelanja;

        // Menampilkan struk belanja
        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("No  | Nama Item       | Jumlah | Harga Satuan | Harga Total");
        System.out.println("---------------------------------------------------------------");

        // Menampilkan rincian item yang dibeli
        for (int i = 0; i < jumlahItem; i++) {
            double hargaTotal = hargaItem[i] * jumlahBarang[i]; // Menghitung harga total per item
            System.out.printf("%-4d| %-16s| %-7d| Rp %-11.2f| Rp %-10.2f\n", i + 1, namaItem[i], jumlahBarang[i], hargaItem[i], hargaTotal);
        }

        // Menampilkan total belanja
        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total Belanja      : Rp %-7.2f\n", totalBelanja);

        // Menampilkan uang yang dibayar dan kembalian
        System.out.printf("Jumlah Uang Dibayar : Rp %-7.2f\n", uangDibayar);

        // Menampilkan apakah uang kurang atau lebih
        if (kembalian < 0) {
            double kekurangan = Math.abs(kembalian); // Uang yang kurang
            System.out.printf("Uang Kurang        : Rp %-7.2f\n", kekurangan);
        } else if (kembalian > 0) {
            System.out.printf("Kembalian          : Rp %-7.2f\n", kembalian);
        } else {
            System.out.println("Pembayaran tepat, tidak ada kembalian.");
        }

        System.out.println("===== TERIMA KASIH =====");

        scanner.close();
    }
}





