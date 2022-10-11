import java.util.Scanner;
public class ejercicio46modificado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int a = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Dime el tercer número: ");
        int c = sc.nextInt();

        while (a<b && a<c) {
            if (b<c) {
                for (int i = b; i > c; i = i + a) {
                    System.out.println(i);
                }
            } else {
                for (int i = c; i > b; i = i + a) {
                    System.out.println(i);
                }
            }
            while (b<a && b<c) {
                if (a < c) {
                    for (int i = a; i > c; i = i + b) {
                        System.out.println(i);
                    }
                } else {
                    for (int i = c; i > a; i = i + b) {
                        System.out.println(i);
                    }
                }
                while (c<a && c<b) {
                    if (a < b) {
                        for (int i = a; i > b; i = i + c) {
                            System.out.println(i);
                        }
                    } else {
                        for (int i = b; i > a; i = i + c) {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}
