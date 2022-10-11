import java.util.Scanner;
public class CUADRADOVACIO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la base");
        int base= sc.nextInt();

        for (int i=0; i<base;i++){
            for (int j=0; j<base; j++){
                System.out.print("-");
            }
            System.out.println();
        }
        for(int i=0; i<base;i++) {
            for(int k=0; k<base-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(" *");
            }

            System.out.println("");
        }
        }

    }
