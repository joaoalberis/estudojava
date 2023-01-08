/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomesobrenome;

import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class Nomesobrenome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Teste";
        do {
            name = JOptionPane.showInputDialog(null, "<html> Infome seu nome por parte: <br><em>(Exemplo: Nykoo)</br></em> </html>");
        }while (name.equals("finalizar"));
        JOptionPane.showMessageDialog(null, "Seu nome é " + name);  
    }
}
    
