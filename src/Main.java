/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi tampilan dari penarikan uang tabungan, dengan pendekatan objek 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tabungan tabungan = new Tabungan(0);
        System.out.println("====Program Penarikan Uang====");
        // memaukkan saldo 
        System.out.print("Masukkan Saldo Awal : ");
        tabungan.setSaldo(sc.nextInt());
        // memasukkan jumlah saldo yang diambil
        System.out.print("Jumlah Uang Yang Diambil : ");
        int jumlah = sc.nextInt();
        System.out.println("Saldo Anda Sekarang\t     : " + tabungan.ambilUang(jumlah));
    }
    
}
