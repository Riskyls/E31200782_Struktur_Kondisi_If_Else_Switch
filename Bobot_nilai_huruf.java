/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bobot_nilai_huruf {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("==== Hitung Nilai ====");
    
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    System.out.println("D");
    System.out.println("E");
   

    System.out.print("Silakan Masukan Grade Nilai   : ");

    int hasil;
    String pilih;

    pilih = scan.nextLine();
    switch(pilih) {
        case "A":
            hasil = 4;
            System.out.println("Hasil               : " + hasil);
        break;
        case "B":
            hasil = 3;
            System.out.println("Hasil               : " + hasil);
        break;
        case "C":
            hasil = 2;
            System.out.println("Hasil               : " + hasil);
        break;
        case "D":
            hasil = 1;
            System.out.println("Hasil               : " + hasil);
        break;
        case "E":
            hasil = 0;
            System.out.println("Hasil               : " + hasil);
        break;

        default:
            System.out.println("Pilihan Anda Tidak Tersedia");
            System.out.println("Terima Kasih");
}
}
}