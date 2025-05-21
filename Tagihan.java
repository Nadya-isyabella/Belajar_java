package com.belajar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tagihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatRupiah = new DecimalFormat("#,###.00");

        // Input data pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jumlah pemakaian air (m³): ");
        int pemakaian = scanner.nextInt();

        // Hitung total tagihan
        double totalTagihan = hitungTagihan(pemakaian);
        double hargaPerMeter = 6000; // Harga tetap Rp 6.000 per m³

        // Menampilkan rincian tagihan
        System.out.println("\n===== Tagihan PDAM =====");
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Pemakaian       : " + pemakaian + " m³");
        System.out.println("Harga per m³    : Rp " + formatRupiah.format(hargaPerMeter));
        System.out.println("Total Tagihan   : Rp " + formatRupiah.format(totalTagihan));

        // Memastikan pembayaran cukup
        double pembayaran = 0;
        while (pembayaran < totalTagihan) {
            System.out.print("\nMasukkan jumlah pembayaran: Rp ");
            pembayaran = scanner.nextDouble(); // Input ulang setiap kali

            if (pembayaran < totalTagihan) {
                System.out.println("Uang kurang! Silakan bayar lagi.");
            }
        }

        // Hitung kembalian jika ada
        double kembalian = pembayaran - totalTagihan;
        System.out.println("\n===== Pembayaran Selesai =====");
        System.out.println("Total Dibayar   : Rp " + formatRupiah.format(pembayaran));
        System.out.println("Kembalian       : Rp " + formatRupiah.format(kembalian));
        System.out.println("Terima kasih telah membayar tagihan PDAM!");

        scanner.close();
    }

    public static double hitungTagihan(int pemakaian) {
        return pemakaian * 6000; // Harga Rp 6.000 per m³
    }
}

