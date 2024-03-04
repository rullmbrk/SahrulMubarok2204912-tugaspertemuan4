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

public class nomor3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai a dan b dari inputan pengguna
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        // Menghitung 
        int pbt = 0;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        pbt = a;

        // Menampilkan hasil
        System.out.println("Pembagi Bersama Terbesar adalah: " + pbt);
    }
}
