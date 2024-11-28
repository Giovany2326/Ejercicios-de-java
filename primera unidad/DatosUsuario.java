import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();


        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Por favor, ingresa tu altura en metros (ejemplo: 1.75 o 1,75): ");
        String alturaTexto = scanner.next();
        double altura = Double.parseDouble(alturaTexto.replace(",", "."));

        System.out.println("\nHola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años y mides " + altura + " metros.");


        scanner.close();
    }
}
