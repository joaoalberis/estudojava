/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertetemperatura;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class ConverteTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double kelvin, re, ra, fah;
        System.out.print("Digite o valor da temperatura em C°: ");
        double celsius = teclado.nextDouble();
        fah = celsius  * 1.8 + 32;
        kelvin = celsius +  273.15;
        re = celsius * 0.8;
        ra = celsius * 1.8 + 32 + 459.67;
        System.out.println("Valor em Fahrenheit: " + fah);
        System.out.println("Valor em kelvin: " + kelvin);
        System.out.println("Valor em Réaumur: " + re);
        System.out.println("Valor em Rankine: " + ra);
    }
    
}
