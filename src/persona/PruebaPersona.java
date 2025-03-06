package persona;

public class PruebaPersona {

    public static void main(String[] args) {
        var personaPaco = new Persona("Paco","tilla");
        var personaPaco2 = new Persona("Paco","tilla");
        System.out.println(personaPaco);
        System.out.println("**variable estatica: ** Numero personas: "+ personaPaco.getIdPersona());
        System.out.println("**variable estatica: ** Numero personas: "+ personaPaco2);
        System.out.println("El id es: "+Persona.getContadorPersonas());
    }
}
