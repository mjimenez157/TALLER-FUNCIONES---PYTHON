import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void numAleatorio() {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int num = random.nextInt(100) + 1; // 1 a 100

        System.out.print("Adivine el número de 1 a 100: ");
        int intento = sc.nextInt();

        if (intento > num) {
            System.out.println("El número es menor");

        } else if (intento < num) {
            System.out.println("El número es mayor");

        } else {
            System.out.println("¡Felicitaciones, adivinaste el número!");
        }
    }

    public static void main(String[] args) {
        numAleatorio();
    }
}
