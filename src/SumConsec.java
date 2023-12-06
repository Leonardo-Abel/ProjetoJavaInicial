import java.util.Scanner;
import java.io.IOException;

public class SumConsec {
    public static void main(String args[])throws IOException{
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Digite o primeiro número: ");
        int X = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int Y = input.nextInt();
        
        while(X < Y){
            X++;
            if(X % 2 != 0 && X < Y){
                sum += X;
            }
        }
        while(X > Y){
            X--;
            if(X % 2 != 0 && X > Y){
                sum += X;
            }
        }
        System.out.printf("%d", sum);
    }
}
