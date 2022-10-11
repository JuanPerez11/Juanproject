import java.util.Scanner;
public class ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        for (int k = 0; k < altura; k++) {
            for (int i = 0; i < altura; i++) {
                System.out.print("*");

            }
            System.out.println();
            for (int j = 0; j < altura; j++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
