import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {

//        var matrix = new int[2][3];
//        matrix[0][0]= 100;
//        matrix[0][1]= 200;
//        matrix[0][2]= 300;
//        matrix[1][0]= 400;
//        matrix[1][1]= 500;
//        matrix[1][2]= 600;
//
//        for(var fila=0;fila<2;fila++){
//            for(var columnas=0;columnas<3;columnas++){
//                System.out.println("fila: "+fila+" columna: "+columnas+"= "+matrix[fila][columnas]);
//            }
//        }
//
//        var matrizz = new int[][]{
//                {100},{200},{300},
//                {400},{500},{500}
//        };
        var scanner = new Scanner(System.in);
        System.out.println("Proporciona las filas: ");
        int filas= scanner.nextInt();
        System.out.println("Proporciona las columnas: ");
        int columnas = scanner.nextInt();
        var matriz = new int[filas][columnas];
        int suma=0;
//BUCLE PARA GUARDAD
        for (int fila = 0 ; fila<filas;fila++ ){
            for (int columna = 0; columna < columnas; columna++){
                System.out.println("Introduce el numero de la: "+ fila + " y de la comuna: "+columna);
                int numero = scanner.nextInt();
                matriz[fila][columna]= numero;
                if(fila==columna){
                 suma +=  matriz[fila][columna];
                }
            }
        }
//BUCLE PARA MOSTAR
        for( int i=0; i<filas;i++){
            for (int x= 0; x<columnas;x++){
                System.out.println("matriz["+i+"]["+x+"] = "+matriz[i][x]);
            }
        }
                System.out.println("el resultado de la diagonal es: "+suma);
    }
}
