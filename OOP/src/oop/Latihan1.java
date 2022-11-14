/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input1;
        String input2;
        
        int nilai1;
        int nilai2;
        
        int tambah;
        
        input1 = JOptionPane.showInputDialog("Masukan Angka Pertama : ");
        input2 = JOptionPane.showInputDialog("Masukan Angka Kedua : ");
        
        nilai1 = Integer.parseInt(input1);
        nilai2 = Integer.parseInt(input2);
        
        tambah = nilai1 + nilai2;
        
        JOptionPane.showMessageDialog(null, + nilai1 + " + " + nilai2 + " = " + tambah);
    }
    
}
