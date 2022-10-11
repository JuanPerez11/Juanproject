import java.util.Scanner;
public class piramideinvertida {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número: ");

        int altura= sc.nextInt();
        for(int i=0; i<altura;i++) {

            for(int k=0; k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<altura-i;j++){
                System.out.print(" *");
            }

            System.out.println("");
        }

    }
}
