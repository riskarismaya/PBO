/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_riskarismaya;

/**
 *
 * @author LENOVO
 */
public class SayCongrats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] values = {80, 50, 50, 50, 80};
        SayCongrats("Eko", values);
        SayCongrats("Budi", 80, 90, 76, 80);
    }
    static void SayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;
        
        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
           System.out.println("Maaf " + name + ", Anda Tidak Lulus"); 
        }
    }
    
}
