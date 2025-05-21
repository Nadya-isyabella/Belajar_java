package com.belajar;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TagihanPDAM {    public static void main(String[] args) {
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

        // Input pembayaran
        System.out.print("\nMasukkan jumlah pembayaran: Rp ");
        double pembayaran = scanner.nextDouble();

        // Hitung kembalian
        if (pembayaran >= totalTagihan) {
            double kembalian = pembayaran - totalTagihan;
            System.out.println("Kembalian       : Rp " + formatRupiah.format(kembalian));
        } else {
            System.out.println("Pembayaran kurang! Anda masih memiliki kekurangan Rp " +
                               formatRupiah.format(totalTagihan - pembayaran));

        
       
        }

        scanner.close();
    }

    public static double hitungTagihan(int pemakaian) {
        return pemakaian * 6000; // Harga Rp 6.000 per m³
    }
}


