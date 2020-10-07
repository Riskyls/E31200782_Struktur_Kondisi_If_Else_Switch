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
public class Kelulusan_2 {

public static void main(String[] args) {

    System.out.println("==== Seleksi Tinggi Badan ====");

    Scanner scan = new Scanner(System.in);

    String nama, kelamin, hasil;
    int tinggi;

    System.out.print("Masukan Nama                          : ");
    nama = scan.nextLine();
    System.out.print("Jenis Kelamain(Laki-Laki/Perempuan)   : ");
    kelamin = scan.nextLine();
    System.out.print("Tinggi Badan                          : ");
    tinggi = scan.nextInt();

    if(kelamin.equalsIgnoreCase("Laki-Laki")) {
        if(tinggi >= 171) {
            hasil =("Selamat Anda Lulus");
        }else {
            hasil =("Anda Gagal");
        }

    }else {
        if(tinggi >= 161) {
            hasil =("Selamat Anda Lulus");
        }else {
            hasil =("Anda Gagal");
}
}
    System.out.println("-----------------------------------------------");
    System.out.println("Nama            : " + nama);
    System.out.println("Jenis Kelamain  : " + kelamin);
    System.out.println("Tinggi Badan    : " + tinggi);
    System.out.println("Hasil           : " + hasil);
}
}
