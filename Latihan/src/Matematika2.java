/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Matematika2 {
    int pertambahan(int a, int b){
        int hasil =  a + b;
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasil);
        return hasil;
    }
    
    int pengurangan(int a, int b){
        int hasil =  a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
        return hasil;
    }
    
    int perkalian(int a, int b){
        int hasil =  a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
        return hasil;
    }
    
    float pembagian(float a, float b){
        float hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " = " + hasil);
        return hasil;
    }
}

class MatematikaCanggih extends Matematika {
    double pertambahan(double a, double b){
        double hasil =  a + b ;
        System.out.println("Pertambahan: " + a + " + " + b + "= " + hasil);
        return hasil;
    }
    
    double pertambahan(double a, double b, double c ){
        double hasil =  a + b + c;
        System.out.println("Pertambahan: " + a + " + " + b + "+"+ c + "= " + hasil);
        return hasil;
    }
    
    
     double pengurangan(double a, double b){
        double hasil =  a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + hasil);
        return hasil;
    }
     double pengurangan(double a, double b, double c){
        double hasil =  a - b - c;
        System.out.println("Pengurangan: " + a + " - " + b + " - " + c +" = " + hasil);
        return hasil;
    }
     
    double perkalian(double a, double b){
        double hasil =  a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasil);
        return hasil;
    }
    
    double perkalian(double a, double b, double c){
        double hasil =  a * b * c;
        System.out.println("Pembagian: " + a + " * " + b + " * " + c +" = " + hasil);
        return hasil;
    }
    
    double pembagian(double a, double b){
        double hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " = " + hasil);
        return hasil;
    }
    
    double pembagian(double a, double b, double c){
        double hasil =  a / b;
        System.out.println("Pembagian: " + a + " : " + b + " : " + c + " = " + hasil);
        return hasil;
    }
}
