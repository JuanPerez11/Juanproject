import java.util.Scanner;
public class ejercicio39cambiado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}
