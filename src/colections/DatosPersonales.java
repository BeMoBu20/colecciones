package colections;

public class DatosPersonales {
    private String nombre;
    private String apellido;
    private int edad;

    public DatosPersonales(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public DatosPersonales(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setEdad(){
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int edad(){
        return this.edad;
    }
}
