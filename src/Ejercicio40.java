import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la base de la pirámide: ");
        int num= sc.nextInt();
        for (int a=0;a<num;a++){
            for (int b=0; b<num-1-a;b++) {
                System.out.print(" ");
            }
            for (int b=0;b<=a;b++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
