package quantidadeNumeros;

public class Main {
    public static void main(String[] args) {
        int inicial = 6000;
        int final1 = 12000;
        for (int i = inicial+1; i < final1 ; i++) {
            System.out.println(i);
        }

        System.out.println("Entre " + inicial + " e " + final1 + " existem " + (final1-inicial) + " numeros");
    }
}
