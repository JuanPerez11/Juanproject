import java.util.Scanner;
public class piramidepidiendobase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int altura = sc.nextInt();
        for(int i=0; i<altura;i++) {
            for(int k=altura; k<altura*2;k++){
                System.out.print(" ");
            }
            for(int j=altura;j<altura*2;j++){
                System.out.print(" *");
            }

            System.out.println("");
        }
    }
}
