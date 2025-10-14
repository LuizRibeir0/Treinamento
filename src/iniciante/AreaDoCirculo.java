// RESOLVIDO

package iniciante;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double N = 3.14159;
        double area;
        double raio;

        raio = scanner.nextDouble();

        area = N * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        scanner.close();
    }
}
