package tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero:");
        double num = scanner.nextDouble();
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(num+" X " + i + " = " + (i*num));
        }
    }
}
