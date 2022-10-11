import java.util.Scanner;
public class ejercicio41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base=sc.nextInt();

        for (int a=0;a<=base; a++) {

            System.out.print("*");
            System.out.println();
            for (int b=0; b<=base;b--){
            }
            for (int b=0;b<=base-1;b++){
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
