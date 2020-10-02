package modelo;

public class Propietario {

    private int dni;
    private String apellido;
    private  String nombre;
    private String telefono;
    private String email;
    private String pass;

    public Propietario() {
    }

    public Propietario(int dni, String apellido, String nombre, String telefono, String email, String pass) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.pass = pass;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public int getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
