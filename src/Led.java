import java.util.Scanner;
import java.math.BigInteger;

public class Led {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de casos de teste (N1)
        int N1;
        do {
            System.out.println("Digite o número de casos de teste (N1):");
            N1 = scanner.nextInt();
        } while (N1 < 1 || N1 > 2000);

        for (int i = 0; i < N1; i++) {
            // Leitura do valor desejado por John (como String para suportar grandes números)
            String valorString;
            do {
                System.out.println("Digite o valor desejado por John (como String):");
                valorString = scanner.next();
            } while (!ehNumeroValido(valorString));

            // Calcular a quantidade de LEDs necessários
            int quantidadeLEDs = contarLEDs(valorString);

            // Imprimir o resultado
            System.out.println(quantidadeLEDs + " leds");
        }

        scanner.close();
    }

    // Método para verificar se a string representa um número válido (maior ou igual a 1 e menor ou igual a 10^100)
    private static boolean ehNumeroValido(String numero) {
        try {
            BigInteger valor = new BigInteger(numero);
            return valor.compareTo(BigInteger.ONE) >= 0 && valor.compareTo(new BigInteger("10^100")) <= 0;
        } catch (NumberFormatException | ArithmeticException ex) {
            return false;
        }
    }

    // Método para contar a quantidade de LEDs necessários para um determinado valor
    private static int contarLEDs(String numero) {
        // Configuração dos LEDs para cada dígito
        int[] configuracaoLEDs = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        // Contar a quantidade total de LEDs
        int totalLEDs = 0;
        for (int i = 0; i < numero.length(); i++) {
            int digito = Character.getNumericValue(numero.charAt(i));
            totalLEDs += configuracaoLEDs[digito];
        }

        return totalLEDs;
    }
}
