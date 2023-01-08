/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baskara;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Baskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        double x1, x2, delta;
        
        delta = (b * b) - 4 * a  *  c;
        if (delta <= 0 || a == 0) {
            System.out.println("Impossivel calcular");
        }else  {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.format("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }
    }
    
}
