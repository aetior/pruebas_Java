import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {

        var scanner =  new Scanner(System.in);
        int i=0;

        System.out.println("cuantas calificaciones quieres agregar?");
        int nCalificaciones  =Integer.parseInt(scanner.nextLine());
        int[]calificaciones= new int[nCalificaciones];
        int total = 0 ;

        for(int calificacion : calificaciones){
            System.out.print("Calificacion["+i+"] = ");
            int valor = scanner.nextInt();
            calificaciones[i]=valor;
            total += valor;
            i++;
        }
            System.out.println("la media es: "+ total/calificaciones.length);
    }
}
