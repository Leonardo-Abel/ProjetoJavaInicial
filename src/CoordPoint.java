import java.util.Scanner;
import java.io.IOException;

public class CoordPoint {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Leitura das coordenadas do ponto
        // System.out.println("Digite as coordenadas do ponto (x e y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Verificação do quadrante
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        scanner.close();
    }   
}
