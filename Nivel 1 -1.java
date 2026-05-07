import java.util.Scanner;

public class Main {

    public static void edad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        String edadUsuario = scanner.nextLine();

        System.out.println("Su edad es: " + edadUsuario + " años");
    }

    public static void main(String[] args) {
        edad();
    }
}
