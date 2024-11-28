import java.util.Scanner;

public class PromedioDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        int[] numeros = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();


        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }


        double promedio = (double) suma / numeros.length;


        System.out.println("El promedio de los números es: " + promedio);
    }
}

