package com.example.trabajopracticofinal.modelo;

import java.io.Serializable;

public class Contrato implements Serializable {
    private int idContrato;
    private String fechaIngreso;
    private String fechaSalida;
    private double importe;
    private Propiedad inmueble;
    private Inquilino inquilino;

    public Contrato(String fechaIngreso, String fechaSalida,double importe, Propiedad innmueble, Inquilino inquilino) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.importe=importe;
        this.inmueble = innmueble;
        this.inquilino = inquilino;
    }

    public Contrato() {
    }

    public Contrato(String fechaIngreso, String fechaSalida, double importe, Inquilino inquilino) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.importe = importe;
        this.inquilino=inquilino;
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

    public Propiedad getIdInmueble() {
        return inmueble;
    }

    public void setIdInmueble(Propiedad idInmueble) {
        this.inmueble = idInmueble;
    }

    public Inquilino getIdInquilino() {
        return inquilino;
    }

    public void setIdInquilino(Inquilino idInquilino) {
        this.inquilino = idInquilino;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
