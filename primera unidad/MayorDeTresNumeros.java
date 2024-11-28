import java.util.Scanner;

public class MayorDeTresNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();

        int mayor;


        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }


        System.out.println("El mayor de los tres números es: " + mayor);

        scanner.close();
    }
}
