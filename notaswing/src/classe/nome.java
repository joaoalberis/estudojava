/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class nome {
    private String name = "";
    public void setNome(){
        name = JOptionPane.showInputDialog("Digite seu Nome: ");
    }
    
    public String getNome(){
        return name;
    }
    
}
