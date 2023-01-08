/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificadoridade;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class VerificadorIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        if (idade >= 18) {
            System.out.println("MAIOR");
        }else{
            System.out.println("MENOR");
        }
    }
    
}
