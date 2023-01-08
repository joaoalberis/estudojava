/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package janelasfeitas;

import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class Janelasfeitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int media, quantidade = 0, par = 0, impar = 0, cemmais = 0, mediasoma =  0;
        do {            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n(Valor 0 Interrompe)"));
            quantidade += 1;
            cemmais = (n > 100)?cemmais + 1:cemmais;
            if (n % 2 == 0){
                par  += 1;
            }else{
                impar +=1;
            }
            media = n;
            mediasoma = mediasoma + n;
        }while (n != 0);
        media = mediasoma / quantidade;
        JOptionPane.showMessageDialog(null, String.format("Total Valores: %d\nTotal de Pares: %d\nTotal de Impares: %d\nAcima de 100: %d\nMédia dos Valores: %d", quantidade,par, impar, cemmais, media));
    }
    
}
