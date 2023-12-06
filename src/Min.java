import java.util.Scanner;

public class Min{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (A > B && (B <= C || B == C)) {
            System.out.println(":)");
        }
        else if (A < B && (B >= C || B == C)) {
            System.out.println(":(");
        }
        else if (A < B && (B < C || B ==C )) {
            if (A < B && B < C && (B - A) > (C - B)) {
            System.out.println(":(");
            }
            else{ 
                if(A < B && B < C && (B - A) <= (C - B)){
                    System.out.println(":)");
                }
            }
        } 
        else if (A > B && B > C) {
            if ((B - C) >= (A - B)){
                System.out.println(":(");
            }
            else{
                if((B - C) < (A - B)){
                    System.out.println(":)");
                }
            }
        }

        else if (A == B) {
            if (B < C) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }
    }
}