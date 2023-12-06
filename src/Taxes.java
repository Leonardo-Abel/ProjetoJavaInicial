import java.util.Scanner;
import java.io.IOException;

public class Taxes {
    public static void main(String args[]) throws IOException{

        Scanner input = new Scanner(System.in);
        double s, t;

        System.out.print("Digite o seu salário: R$");
        s = input.nextDouble();

        if (s <= 2000){
            System.out.println("Isento");
        }
        else if (s <= 3000){
            t = ((s - 2000)*0.08);
            System.out.printf("R$ %.2f\n", t);
        }
        else if (s <= 4500){
            t = ((s - 3000)*0.18) + (1000*0.08);
            System.out.printf("R$ %.2f\n", t);
        }
        else {
            t = ((s - 4500)*0.28) + (1500*0.18) + (1000*0.08);
            System.out.printf("R$ %.2f\n", t);
        }
    }
}
