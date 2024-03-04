/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihanpert4;

/**
 *
 * @author sahru
 */
import java.util.Scanner;
public class nomor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai N dari inputan pengguna
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        // Perulangan for untuk mengulang teks sebanyak N kali
        for (int i = 0; i < n; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}