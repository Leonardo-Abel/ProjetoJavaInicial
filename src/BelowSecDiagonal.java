import java.util.Scanner;
import java.io.IOException;

public class BelowSecDiagonal {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        char o = input.nextLine().charAt(0);
        double[][] M = new double[12][12];
        double soma = 0;
        int quant = 0;

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                M[x][y] = input.nextDouble();
            }
        }

        for (int x = 0; x < 12; x++) {
            for (int y = 0; y < 12; y++) {
                if (y > 11 - x) {
                    soma += M[x][y];
                    quant++;
                }
            }
        }

        if (o == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (o == 'M') {
            double media = soma / quant;
            System.out.printf("%.1f\n", media);
        }

        input.close();
    }
}