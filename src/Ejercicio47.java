import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n= sc.nextInt();
        int conta= 0;
        while (n>0) {
            n= n/10;
            conta++;
        }
        System.out.println("El número tiene " +conta+" cifras");
        }
    }

