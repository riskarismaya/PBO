/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_riskarismaya;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int ambil = 0, simpan = 0, get = 0;
      Scanner pilih = new Scanner(System.in);
      Bank bk = new Bank(100000);
      
      System.out.println("Selamat Datang di Bank ABC");
      for(int i = 1; i >= 1 ; i++){
          System.out.println("Menu Bank");
          System.out.println("1. Cek Saldo " + "2. Simpan Uang " + " 3. Ambil Uang");
          System.out.println("Pilih Menu Bank : ");
          int menu = pilih.nextInt();
            if(menu == 1){
                bk.getSaldo();
            } else if (menu == 2){
                System.out.println("Masukan Uang disimpan Rp. ");
                bk.simpanUang(simpan);
            } else if (menu == 3){
                System.out.println("Masukan Uang diambil Rp. ");
                bk.ambilUang(ambil);
            } else if (menu > 3){
                System.out.println("Menu Tidak Ada ");
                System.out.println("Ulangi Pilih Menu Bank : ");
            } else break;
      }
    }    
}
