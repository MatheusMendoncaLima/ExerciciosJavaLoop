package numerosPares3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o numero inicial");
        int inicial = scanner.nextInt();
        System.out.println("insira o valor final");
        int final1 = scanner.nextInt();
        for (int i = inicial; i <= final1; i++) {
            if ((int)(i/2) == ((double) i)/2.0) {
                System.out.println(i);
            }
        }
    }
}
