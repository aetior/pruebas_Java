package prueba;

import aricmetica.Aricmetica;

public class Preba {
    public static void main(String[] args) {
        System.out.println("*** Ejempolo Ericmetica***");

        var aricmetica= new Aricmetica(2,3);
        System.out.println(aricmetica.getOperando1());
        aricmetica.setOperando1(45);
        aricmetica.setOperando2(65);
        aricmetica.restar();

    }
}
