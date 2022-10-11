import java.util.Scanner;
public class ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int a = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            //Intercambio un número por otro
            int c = a;
            a = b;
            b = c;
        }
            //Calculo la diferencia de B-A
            int diferencia = b - a;
            int incremento=0;
            if (diferencia%2==0){
                incremento=-2;
                //Si la diferencia es PAR bucle hacia abajo de 2 en 2
            } else {
                incremento=-1;
                //Si la diferencia es IMPAR bucle hacia abajo de 1 en 1
            }
                for (int i= b; i>=a; i+=incremento){
                    System.out.println(i +", ");
            }
        }
    }