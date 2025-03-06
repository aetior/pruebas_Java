package persona;

public class Persona extends Object{
    private String nombre;
    private String apellido;
    private static int contadorPersonas =0;
    private int idPersona;
    public Persona(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido = apellido;

        this.idPersona = ++Persona.contadorPersonas;
    }
    public static  int getContadorPersonas(){
         return  Persona.contadorPersonas;
    }
    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }

    @Override
    public String toString(){
        return "Nombre: " +this.nombre+ ", Apellido: "+ this.apellido + " el ID: "+ this.idPersona +" "+super.toString();
    }

}

