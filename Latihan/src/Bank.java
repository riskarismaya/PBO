/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Bank {
    int Saldo;
    int total;
    Bank (int saldo){
        Saldo = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo Anda Saat ini : Rp. " + Saldo);
    }
    
    void simpanUang(int simpanUang){
       total = simpanUang + Saldo;
       System.out.println("Simpan Uang : Rp " + simpanUang);
       System.out.println("Saldo Anda Saat ini : Rp. " + total); 
    }
    
    void ambilUang(int ambilUang){
       int jumlah = total - ambilUang;
       System.out.println("Ambil Uang : Rp " + ambilUang);
       System.out.println("Saldo Anda Saat ini : Rp. " + jumlah);
    }
}
