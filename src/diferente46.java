import java.util.Scanner;

public class diferente46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int a = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Dime el tercer número: ");
        int c = sc.nextInt();

        if (a>b){
            int aux = a; a=b; b= aux;
        }
        if (b>c){
            int aux =b; b=c; c=aux;
        }
        if (a>b){
            int aux = a; a=b; b= aux;
        }
        for (int i=b; i<=c; i= i+a){
            System.out.println(i+",");
        }
    }
}

