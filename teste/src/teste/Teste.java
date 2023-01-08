/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int tempo = teclado.nextInt();
        int hora = 0;
        int minuto = 0;
        int segundo = 0;
        int segundos;
        segundo = tempo % 60;
        if (tempo > 60){
            minuto = tempo / 60;           
            if (minuto > 60) {
                segundos = tempo / 60;
                hora = tempo / 3600;
                minuto = segundos % 60;              
                System.out.println(hora + ":" + minuto + ":" + segundo);
            }else {
                System.out.println(hora + ":" + minuto + ":" + segundo);
            }
            
        }else {
            System.out.println(hora + ":" + minuto + ":" + segundo);
        }
        
        
        
        
         
    }
    
}
