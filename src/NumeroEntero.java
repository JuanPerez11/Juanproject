import javax.swing.*;

public class NumeroEntero {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Escriba un número entero");
        int n=Integer.parseInt(texto);
        System.out.println(n);
    }
}
