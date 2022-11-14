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

public class Inputmerk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        input = JOptionPane.showInputDialog("Masukkan Harga : ");
        long harga = Integer.valueOf(input).intValue();
        JOptionPane.showMessageDialog(null,harga);
    }
    
}
