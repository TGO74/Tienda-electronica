import java.util.Scanner;

public class Leer {
    private static Scanner scanner = new Scanner(System.in);

    public static String dato() {
        return scanner.nextLine();
    }

    public static int entero() {
        return scanner.nextInt();
    }

    public static double datoDouble() {
        return scanner.nextDouble();
    }
}

