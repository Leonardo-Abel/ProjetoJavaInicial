import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // int A = input.nextInt();
        // int B = input.nextInt();
        // int C = input.nextInt();
        int A, B, C;
        System.out.print("Digite o número: ");
        A = input.nextInt();
        System.out.print("Digite o número: ");
        B = input.nextInt();
        System.out.print("Digite o número: ");
        C = input.nextInt();

        if (A > B && B <= C) {
            System.out.println(":)");
        } else if (A < B && B >= C) {
            System.out.println(":(");
        } else if (A < B && B < C && (B - C) < (A - B)) {
            System.out.println(":(");
        } else if (A < B && B < C && (B - C) < (A - B)){
            System.out.println(":)");
        } else if (A > B && B > C && (B - C) < (A - B)) {
            System.out.println(":)");
        } else if (A > B && B > C && (B - C) <= (A - B)){
            System.out.println(":(");
        } else if (A == B) {
            if (B < C) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }
    }
}