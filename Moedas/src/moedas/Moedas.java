/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moedas;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Moedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double valor = teclado.nextDouble();
        double quantidade;
        if (valor > 0 && valor < 1000000.00){
            quantidade = valor / 100;
            valor = valor % 100;
            System.out.println("NOTAS:");
            System.out.format("%.0f nota(s) de R$ 100.00\n", Math.floor(quantidade));
            quantidade = valor / 50;
            valor = valor % 50;
            System.out.format("%.0f nota(s) de R$ 50.00\n", Math.floor(quantidade));
            quantidade = valor / 20;
            valor = valor % 20;
            System.out.format("%.0f nota(s) de R$ 20.00\n", Math.floor(quantidade));
            quantidade = valor / 10;
            valor = valor % 10;
            System.out.format("%.0f nota(s) de R$ 10.00\n", Math.floor(quantidade));
            quantidade = valor / 5;
            valor = valor % 5;
            System.out.format("%.0f nota(s) de R$ 5.00\n", Math.floor(quantidade));
            quantidade = valor / 2;
            valor = valor % 2;
            System.out.format("%.0f nota(s) de R$ 2.00\n", Math.floor(quantidade));
            System.out.println("MOEDAS:");
            quantidade = valor / 1;
            valor = valor % 1;
            System.out.format("%.0f moeda(s) de R$ 1.00\n", Math.floor(quantidade));
            quantidade = valor / 0.5;
            valor = valor % 0.5;
            System.out.format("%.0f moeda(s) de R$ 0.50\n", Math.floor(quantidade));
            quantidade = valor / 0.25;
            valor = valor % 0.25;
            System.out.format("%.0f moeda(s) de R$ 0.25\n", Math.floor(quantidade));
            quantidade = valor / 0.10;
            valor = valor % 0.10;
            System.out.format("%.0f moeda(s) de R$ 0.10\n", Math.floor(quantidade));
            quantidade = valor / 0.05;
            valor = valor % 0.05;
            System.out.format("%.0f moeda(s) de R$ 0.05\n", Math.floor(quantidade));
            quantidade = valor / 0.01;
            valor = valor % 0.01;
            System.out.format("%.0f moeda(s) de R$ 0.01\n", Math.floor(quantidade));
        }else {
            System.out.println("Valor invalido");
        }
    }
    
}
