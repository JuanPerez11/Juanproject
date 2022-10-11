import javax.swing.*;
public class Notas {
    public static void main(String[] args) {
        String nota=JOptionPane.showInputDialog ("Escribe tu nota");
        double n= Double.parseDouble(nota);
        if (n <= 3) {
            System.out.println("Muy deficiente");
            JOptionPane.showMessageDialog(null, "Muy deficiente");
        } else if (n > 3 && n < 5) {
            System.out.println("Suspenso");
          JOptionPane.showMessageDialog (null,"Suspenso");
        } else if (n >= 5 && n < 7) {
            System.out.println("Bien");
            JOptionPane.showMessageDialog(null, "Bien");
        } else if (n >= 7 && n < 9){
            System.out.println("Notable");
            JOptionPane.showMessageDialog(null, "Notable");
        } else if (n >= 9 && n < 10) {
            System.out.println("Sobresaliente");
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        } else{
            System.out.println("Matrícula de honor");
        }


    }
}
