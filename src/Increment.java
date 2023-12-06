public class Increment {
    public static void main(String args[]){
        int c;

        c = 5; // atribui 5 a variavel c
        System.out.println(c);      // improme 5
        System.out.println(c++);    // imprime 5 então pos-incremente
        System.out.println(c);      // imprime 6

        System.out.println();   // pula uma linha

        c = 5; // atribui 5 a variavel c
        c = 5; // atribui 5 a variavel c
        System.out.println(c);      // improme 5
        System.out.println(++c);    // pre-incrementa e então imprime 6
        System.out.println(c);      // imprime 6
    }
}
