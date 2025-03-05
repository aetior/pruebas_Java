package persona;

public class PruebaPersona {

    public static void main(String[] args) {
        var personaPaco = new Persona("Paco","tilla");

        System.out.println(personaPaco.getApellido());
        System.out.println(personaPaco.getNombre());
        personaPaco.setApellido("Cortés");
        personaPaco.setNombre("Aitor");
        System.out.println(personaPaco.getNombre()+" "+personaPaco.getApellido());

    }
}
