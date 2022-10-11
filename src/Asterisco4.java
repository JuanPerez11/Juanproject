import javax.swing.*;
public class Asterisco4 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Introduce las filas: ");
        int f = Integer.parseInt(text); //Declara la variable fila
        String texto = JOptionPane.showInputDialog("Introduce las columnas: ");
        int c = Integer.parseInt(texto); //Declara la variable columna
        for (int cont = 1; cont <= f; cont++) {
            System.out.println();
        for (int conta=1; conta<=c; conta++) {
                System.out.print("*");
            }
        }
    }
}
