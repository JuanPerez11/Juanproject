import java.util.Scanner;
public class divisiblesentre3y2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = 1;
        int a = 0;
        int b = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Multiple de 2: " + i);
                a = a + 1;
            } else if (i % 3 == 0) {
                System.out.println("Multiple de 3: " + i);
                b = b + 1;
            }
        }
        System.out.println("Numeros multiplos de 2: " + a);
        System.out.println("Numeros multiplos de 3: " + b);
    }
}
