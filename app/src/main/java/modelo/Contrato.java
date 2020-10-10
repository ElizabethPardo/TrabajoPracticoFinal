package modelo;

import java.io.Serializable;
import java.util.Date;

public class Contrato implements Serializable {
    private int idContrato;
    private String fechaIngreso;
    private String fechaSalida;
    private double importe;
    private int idInmueble;
    private int idInquilino;

    public Contrato(String fechaIngreso, String fechaSalida,double importe, int idInmueble, int idInquilino) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.importe=importe;
        this.idInmueble = idInmueble;
        this.idInquilino = idInquilino;
    }

    public Contrato() {
    }

    public Contrato(String fechaIngreso, String fechaSalida, double importe) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String  fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
