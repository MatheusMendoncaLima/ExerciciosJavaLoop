package numerosPares2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o numero inicial");
        int inicial = scanner.nextInt();
        System.out.println("insira o valor final");
        int final1 = scanner.nextInt();
        int total = 0;
        int soma = 0;
        for (int i = inicial+1; i < final1; i++) {
            if ((int)(i/2) == ((double) i)/2.0) {
                System.out.println(i);
                total+=1;
                soma+=i;
            }
        }
        System.out.println("Entre os numeros " + inicial + " e "+final1+" existem " + total +" numeros pares. A soma entre eles é de "+soma);
    }
}
