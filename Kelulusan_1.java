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
public class Kelulusan_1 {

public static void main(String[] args) {

    //Buat Scanner
    Scanner inp = new Scanner(System.in);

    //Ambil Nama
    System.out.print("Masukan Nama Anda : ");
    String nama = inp.nextLine();

    //Ambil NIM
    System.out.print("Masukan NIM       : ");
    int nim = inp.nextInt();

    //Ambil Nilai
    System.out.print("Masukan Nilai     : ");
    int nilai = inp.nextInt();
    System.out.println("-------------------------------------");
    //Print
    if(nilai >= 78) {
        System.out.println("Masukan Nama Anda   : " + nama);
        System.out.println("Masukan NIM         : " + nim);
        System.out.println("Masukan Nilai       : " + nilai);
        System.out.println("Selamat Anda Lulus");
}   else {
        System.out.println("Masukan Nama Anda   : " + nama);
        System.out.println("Masukan NIM         : " + nim);
        System.out.println("Masukan Nilai       : " + nilai);
        System.out.println("Anda Tidak Lulus");
}
}
}
