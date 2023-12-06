import java.util.Scanner;
import java.io.IOException;

public class BuildHouses {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int A, B, C;
        while (true) {
            A = input.nextInt();
            if (A == 0) break;
            B = input.nextInt();
            C = input.nextInt();

            int areaCasa = A * B;
            int areaMaximaPermitida = (100 * areaCasa) / C;

            int ladoTerreno = (int) Math.sqrt(areaMaximaPermitida);

            System.out.println(ladoTerreno);
        }

        input.close();
    }
}