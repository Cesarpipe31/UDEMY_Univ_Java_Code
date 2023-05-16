package model;

public class Persona {

    private String nombre;
    private int edad;
    private int idPersona;
    private static int contadorPersona;

    private Persona() {
        this.idPersona = ++Persona.contadorPersona;
    }

    public Persona(String nombre, int edad) {
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }


    public static int getContadorPersona() {
        return contadorPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }   

}
