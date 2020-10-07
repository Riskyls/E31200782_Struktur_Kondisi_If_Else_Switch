/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;


import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class NilaiHuruf {

public static void main(String[] args) {

    System.out.println("=== Penilaian Grade ===");

    String grade;
    int nilai;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Nilai : ");
    nilai = input.nextInt();

    if(nilai <= 100) {
        grade = "A";
}   else if(nilai <= 85) {
        grade = "B";
}   else if(nilai <= 75) {
        grade = "C";
}   else if(nilai <= 65) {
        grade = "D";
}   else if(nilai <= 55) {
        grade = "E";
}   else {
        grade = "Eror";
}
    System.out.println("Grade       : " + grade);
}
}
