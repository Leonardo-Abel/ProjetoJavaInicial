import java.util.Scanner;
import java.io.IOException;

public class BetweenFive {
    public static void main(String args[])throws IOException{

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = input.nextInt();
        System.out.print("Digite o quarto número: ");
        int n4 = input.nextInt();
        System.out.print("Digite o quinto número: ");
        int n5 = input.nextInt();
        int contador = 0;
        
        if (n1 % 2 == 0){
            contador++;
        }
        if (n2 % 2 == 0){
            contador++;
        }
        if (n3 % 2 == 0){
            contador++;
        }
        if (n4 % 2 == 0){
            contador++;
        }
        if (n5 % 2 == 0){
            contador++;
        }
        System.out.printf("%d valores pares", contador);
    }
}
