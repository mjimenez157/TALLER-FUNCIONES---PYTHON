import java.util.Scanner;

public class Main {

    public static void suma() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        int num2 = sc.nextInt();

        int resultadoSuma = num1 + num2;

        System.out.println("La suma es: " + resultadoSuma);
    }

    public static void main(String[] args) {
        suma();
    }
}
