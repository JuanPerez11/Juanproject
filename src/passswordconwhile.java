import javax.swing.*;
public class passswordconwhile {
    public static void main(String[] args) {
        String u = "JPP";
        String p = "DAW";
        String usuario = JOptionPane.showInputDialog("Introduce el usuario");
        String password = JOptionPane.showInputDialog("Introduce la contraseña");
        int intentos = 0;
        int maximo = 2;
        if (u.equals (usuario)) {
            if (p.equals(password)) {
                JOptionPane.showMessageDialog(null, "Usuario correcto");
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                for (intentos =0; intentos<2; intentos ++){
                    JOptionPane.showMessageDialog(null,"No tienes más opciones");
                }
            }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario es incorrecto");
                for (intentos=0; intentos<2; intentos ++){
                    JOptionPane.showMessageDialog(null,"No tienes más opciones");
                }

            }
        }
    }