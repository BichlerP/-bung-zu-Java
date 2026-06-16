import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Erste Zahl eingeben:");
        int a = scanner.nextInt();
        
        System.out.println("Zweite Zahl eingeben:");
        int b = scanner.nextInt();
        
        int summe = a + b;
        System.out.println("Ergebnis: " + summe);
        
        scanner.close();
    }
}
