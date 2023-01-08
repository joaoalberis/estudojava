/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Escreva Sua nota: ");
        double nota = teclado.nextDouble();
        System.out.printf("A nota de %s é: %.2f\n", nome, nota);
        System.out.println("");
    }
    
}
