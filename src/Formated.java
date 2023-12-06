public class Formated {
    public static void main (String args[]) {
        /*int dec = 100;
        int oct = 0100;
        int hex = 0x100;

        System.out.printf("Em decimal:      %4o %4o %4o\n", dec, oct, hex);
        System.out.printf("Em octal:        %4d %4d %4d\n", dec, oct, hex);
        System.out.printf("Em hexadecimal:  %4x %4x %4x\n", dec, oct, hex);*/

        double preco = 525.75f;
        double imposto = 0.06f;

        System.out.printf("O custo do item e %.2f\n", preco);
        System.out.printf("E uma linguagem de engenharia e %e\n", preco);
        System.out.printf("O imposto sobre a venda e %f\n", preco * imposto);
    }
}
