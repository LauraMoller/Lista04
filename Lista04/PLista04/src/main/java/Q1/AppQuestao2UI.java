/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import javax.swing.JOptionPane;

/**
 *
 * @author molle
 */
public class AppQuestao2UI {

    public AppQuestao2UI() {
        Retangulo r = new Retangulo();
        boolean correto = false;
        do {
            try {
                r.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null, "Altura do retângulo: ")));
                correto = true;                
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (!correto);
        do {
            correto = false;
            try {
                r.setComprimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Comprimento do retângulo: ")));
                correto = true;            
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (!correto);
        JOptionPane.showMessageDialog(null, "Área = " + r.calcularArea() + "\nPerímetro = " + r.calcularPerimetro());
    }

    public static void main(String[] args) {
        new AppQuestao2UI();
    }
}
