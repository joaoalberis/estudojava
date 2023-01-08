/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeexercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class TesteExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner te = new Scanner(System.in);
         int a = te.nextInt(), b = te.nextInt();
         if (b%a == 0 || a%b == 0){
             System.out.println("Sao Multiplos");
         }else{
             System.out.println("Nao sao Multiplos");
         }
    }
    
}
