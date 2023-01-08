/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner te = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            n = te.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = te.next();
        }while(resp.equals("S") || resp.equals("s"));
        System.out.println("A soma de todos os valores é: " + s);
    }
    
}
