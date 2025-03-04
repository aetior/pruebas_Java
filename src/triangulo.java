import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        System.out.println("**Triangulo**");
        var consola = new Scanner(System.in);
        System.out.println("Numero de filas?");
        var numeroFilas = consola.nextInt();

        for(var fila = 1; fila<=numeroFilas; fila ++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteristico = "*".repeat(2*fila-1);
            System.out.println(espaciosBlanco + asteristico);
        }
    }
}
