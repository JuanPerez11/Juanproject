import java.util.Scanner;
public class romboasteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base");
        int alto = sc.nextInt();
        //Hacer bucle desde la base hacia arriba
        for (int i = 0; i < alto; i++) {
            for (int k = 0; k < alto*2; k++) {
                System.out.print(" ");
                //DESDE LA VARIABLE HACEMOS QUE CADA VEZ QUE PASE POR EL BUCLE PONGA UN ESPACIO AL PRINCIPIO
            }
            for (int j = 0; j < alto; j++) {
                System.out.print(" ");
                //HACEMOS QUE PONGA EL ESPACIO ASTERISCO LAS VECES QUE SE LE INDICA
            }
            System.out.println("");
            //CADA VEZ QUE HAGA ESTO SE BAJA UNA LÍNEA
        }
        int cuadrado = alto;

        for (int i = 0; i < cuadrado; i++) {
            for (int j = 0; j < cuadrado*3; j++) {
                System.out.print(" -");
            }
            System.out.println();
        }
            int bajo = alto;
            for (int i = 0; i < bajo; i++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < bajo - i; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }
    }
