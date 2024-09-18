package numerosPares;

public class Main {
        public static void main(String[] args) {
            for (int i = 6+ 1; i < 600; i++) {
                if ((int)(i/2) == ((double) i)/2.0) {
                    System.out.println(i);
                }
            }
        }

}
