import java.util.Scanner;
import java.io.IOException;

public class Distance {
    public static void main(String args[]) throws IOException{

        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, distance;

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        distance = Math.pow((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1), 0.5);

        System.out.printf("%.4f\n", distance);
    }
}
