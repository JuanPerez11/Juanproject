import java.util.Scanner;
public class Asteriscopirámide {
    public static void main(String[] args) {
        for (int f=1; f<=1; f++) {
            System.out.print("  *"); //Punta de la prámide
        }
        System.out.println(); //Salto de línea
        System.out.print(" "); //Espacio para que comience la segunda fila de la pirámide
        for (int f=1; f<=3; f++) { //Número de asteriscos de la segunda fila
            System.out.print("*");
        }
        System.out.println(); //Salto de línea
        for (int f=1; f<=5; f++) { //Número de asteriscos de la tercera fila
            System.out.print("*");
        }
    }


}
