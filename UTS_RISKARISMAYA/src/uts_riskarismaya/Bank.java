/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_riskarismaya;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Bank {
    int Saldo;
    Scanner masukan = new Scanner(System.in);

    public Bank(int saldo){
        this.Saldo = saldo;
    }
    
    void getSaldo(){
        System.out.println("Saldo Anda Saat ini : Rp. " + Saldo);
    }
    
    void simpanUang(int simpanUang){
       simpanUang = masukan.nextInt();
       Saldo = simpanUang + Saldo;
       System.out.println("Saldo Anda Saat ini : Rp. " + Saldo); 
    }
    
    void ambilUang(int ambilUang){
       ambilUang = masukan.nextInt();
        if(Saldo <= ambilUang){
            System.out.println("Maaf Saldo Anda Tidak Mencukupi !!!");
        } else Saldo = Saldo - ambilUang;
            System.out.println("Saldo Anda Saat ini adalah Rp: " + Saldo);
       
    }
}
