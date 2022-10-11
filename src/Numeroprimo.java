import java.util.Scanner;
public class Numeroprimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador, I, n;
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        contador = 0;
        for (I = 1; I <= n; I++) {
            if ((n % I) == 0) {
                contador++;
            }
        } if (contador <=2) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");

            }

        }
    }
