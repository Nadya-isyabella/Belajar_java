package com.belajar;

import java.util.Scanner;

public class ProgramLogika {
    public static void main(String[] args) {
    
       Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        // Logika IF untuk menentukan jenis angka
        if (angka > 0) {
            System.out.println(angka + " adalah angka positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah angka negatif.");
        } else {
            System.out.println("Angka yang Anda masukkan adalah nol.");
        }

        scanner.close();
    }
}
