import java.util.Scanner;

public class cicloFor {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
        var salir = false;
        while(!salir){
        System.out.println("""
               Que quieres hacer?
               
               1. Sumar
               2. Restar
               3. Multiplicar
               4. Dividir
               
               5. Salir
         
               """);
        System.out.print("Cual es tu opcion: ");
        int opcion = scanner.nextInt();
                    System.out.print("Escribe el primer numero: ");
                    int numero1 = scanner.nextInt();
                    System.out.print("Escribe el segundo numero: ");
                    int numero2 = scanner.nextInt();
            switch (opcion){
                case 1-> System.out.println("El resultado de la suma es: "+ (numero1 + numero2));
                case 2-> System.out.println("El resultado de la suma es: "+ (numero1 - numero2));
                case 3-> System.out.println("El resultado de la suma es: "+ (numero1 * numero2));
                case 4-> System.out.println("El resultado de la suma es: " + (numero1 / numero2));
                case 5-> salir=true ;
                default -> System.out.println("Opcion no disponible");


            }
        }


    }
}
