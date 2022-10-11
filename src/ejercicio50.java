import java.util.Scanner;
public class ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < altura; j++) {
                System.out.print("*");
                System.out.println("");
            }
            for (int s= 0; i < altura - 1; i++) {
                for (int j = 0; j < altura - i - 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < altura; j++) {
                    System.out.print("*");
                }

                System.out.println("");
            }

        }
    }
}

