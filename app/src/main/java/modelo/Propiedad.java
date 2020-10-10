package modelo;

import java.io.Serializable;

public class Propiedad  implements Serializable {
    private  int idPropiedad;
    private String direccion;
    private int ambientes;
    private  String tipo;
    private String uso;
    private double precio;
    private int idPropietario;
    private int imagen;

    public Propiedad() {
    }

    public Propiedad(String direccion, int ambientes, String tipo, String uso, double precio,int imagen) {
        this.direccion = direccion;
        this.ambientes = ambientes;
        this.tipo = tipo;
        this.uso = uso;
        this.precio = precio;
        this.imagen=imagen;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
