import javax.swing.*;
public class password {
    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog(null, "Introudce el usuario");
        String text = JOptionPane.showInputDialog(null, "Introduce la contraseña");
        String password = "DAW2022";
        if (password != text) {
            JOptionPane.showMessageDialog(null, " Contraseña fallida.");
            for (int conta = 1; conta <= 2; conta++) {
            JOptionPane.showInputDialog(null,"Introduce de nuevo la contraseña");
            }

        }
    }
}


