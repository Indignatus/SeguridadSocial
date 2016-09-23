/**
 * Created by dam on 21/9/16.
 */
public class Persona {

    private String dni;
    private int seguridadSocial;
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;


    public Persona(String dni, int seguridadSocial,String nombre,String apellido, int edad ,double salario) {
        this.dni = dni;
        this.seguridadSocial = seguridadSocial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;




    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", seguridadSocial=" + seguridadSocial +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(int seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
