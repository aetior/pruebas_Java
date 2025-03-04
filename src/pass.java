import java.util.Random;
import java.util.Scanner;

public class pass {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var random = new Random();

        int num = random.nextInt(1,50);
        var salir = false;
        int intentos=0;



        while(!salir && intentos <5){

            System.out.println("Que numero crees que es?");
            int nUsuario = scanner.nextInt();
            if(nUsuario==num){
                System.out.println("CORRECTO! has hecho "+intentos+" intentos.");
                salir=true;
            }else if(nUsuario>num) {
                System.out.println("El numero que buscas es mas pequeño");
            } else{
                System.out.println("El numero que buscas es mas grande");
            }

           intentos ++;
        }
        if(intentos>5){
            System.out.println("Numero de intentos superados "+ intentos +"El numero era: " + num) ;
        }

    }
}
