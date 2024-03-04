/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soallatihanpert4;

/**
 *
 * @author sahru
 */
import java.util.Scanner;

public class nomor2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai batas awal dan batas akhir dari inputan pengguna
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        // Menghitung jumlah deret bilangan genap
        int jumlahDeret = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlahDeret++;
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah deret bilangan genap: " + jumlahDeret);
    }
}