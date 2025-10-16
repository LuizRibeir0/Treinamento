//RESOLVIDO
package iniciante;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1, N2, PROD;

        N1 = scanner.nextInt();
        N2 = scanner.nextInt();

        PROD = N1 * N2;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
