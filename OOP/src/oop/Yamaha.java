/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author LENOVO
 */
public class Yamaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("Yamaha");
        System.out.println("Merk motor ini adalah " + motor.tampilMerk());
    }
    
}
