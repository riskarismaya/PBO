/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;

public class segitiga {
    String alas, tinggi;
    
    public void input(){
         JOptionPane.showInputDialog("Masukan Alas : ");
         JOptionPane.showInputDialog("Masukan Tinggi : ");
    }
    
    public double hitung(){
     long a = Long.parseLong(alas);
     long t = Long.parseLong(tinggi);
     double luas = 0.5 * a * t;
     return luas;
    }
    
    public void hasil(){
        JOptionPane.showMessageDialog(null,"0.5 * " + alas + " * " + tinggi + " = " + luas);
    }
}
