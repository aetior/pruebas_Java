import java.util.Scanner;

public class funcionPar {
    static boolean esPar(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("dime tu nuemero para saber si es par: ");
        int numero = scanner.nextInt();
        System.out.println(esPar(numero));
    }
}
