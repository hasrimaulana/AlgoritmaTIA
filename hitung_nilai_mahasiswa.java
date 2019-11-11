package com.fikom.algoritma_dan_struktur_data;

import java.util.Scanner;

public class hitung_nilai_mahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        char grade = 0 ;
        final double n_tugas, n_mid, n_apsen, n_final, n_akhir;
        System.out.println("=====Nilai Mahasiswa====");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Nim  : ");
        nim = input.nextLine();
        System.out.print("Nilai Tugas = ");
        n_tugas = input.nextInt();
        System.out.print("Nilai Mid   = ");
        n_mid = input.nextInt();
        System.out.print("Nilai Apsen = ");
        n_apsen = input.nextInt();
        System.out.print("Nilai Final = ");
        n_final = input.nextInt();
        n_akhir = (0.15 * n_tugas + 0.25 * n_mid + 0.30 * n_apsen + 0.30 * n_final);
        if (n_akhir >= 80 && n_akhir <= 100) {
            grade = 'A';
        } else if (n_akhir >= 60 && n_akhir < 80) {
            grade = 'B';
        } else if (n_akhir >= 40 && n_akhir < 60) {
            grade = 'C';
        } else if (n_akhir >= 20 && n_akhir < 40) {
            grade = 'D';
        } else if (n_akhir >= 1 && n_akhir < 20) {
            grade = 'E';
        }
        System.out.println(nama + ", Nim " + nim + ", Dengan nilai akhir " + n_akhir + ", Dengan Nilai Huruf " + grade + "" + "");
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("===== Dinyatakan Lulus =====");
        } else {
            System.out.println("===== Dinyatakan Tidak Lulus =====");
        }
    }
}
