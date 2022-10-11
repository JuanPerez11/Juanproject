import java.util.Scanner;
public class Meses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se crea un objeto Scanner
        Integer m; // Variable numérica
        Integer y;
        System.out.println("Introduzca el mes (1-12)");
        m = sc.nextInt(); //Asigna a la variable m el número entero introducido por consola
        System.out.println("Introduzca el año");
        y = sc.nextInt(); //Asigna a la variable y el número entero introducido por consola
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 días");
                break;
            case 2:
                //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre
                if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 ==0)) {
                    System.out.println("Tiene 29 días y es bisiesto");
                } else {
                    System.out.println("Tiene 28 días y no es bisiesto");
                }  break;
        }


    }
}