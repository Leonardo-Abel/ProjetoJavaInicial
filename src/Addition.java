import java.util.Scanner; // programa que utiliza a classe Scanner

public class Addition {
    public static void main(String args[]){
        //cria um objeto Scanner para ler o teclado
        Scanner input = new Scanner(System.in);

        int number1;            // primeiro numero a somar
        int number2;            // segundo numero a somar
        int sum;                // soma de number1 e number2

        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("A soma e %s\n", sum);
    }
}
