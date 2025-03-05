package animales;

public class Animal {

    // Cambiado a public para acceso desde cualquier parte
    public void comer(){
        System.out.println("Como");
    }

    public void dormir(){
        System.out.println("Duermo");
    }

    protected void hacerSonido(){
        System.out.println("Hace un sonido");
    }

}

class Perro extends Animal {
    protected void hacerSonido() {
        System.out.println("Guauu");
    }
}

class Gato extends Animal{
    protected void hacerSonido(){
        System.out.println("Miauu");
    }
}

class PruebaAnimal {  // Se corrigió el nombre de la clase
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {
        //var animal = new Animal();
        var animal = new Perro();
        imprimirSonido(animal);

    }
}
