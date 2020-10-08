package modelo;

import java.util.Date;

public class Pago {
    private int idPago;
    private int nroPago;
    private Date fechaPago;
    private Double importe;
    private int idContrato;

    public Pago(int idPago, int nroPago, Date fechaPago, Double importe, int idContrato) {
        this.idPago = idPago;
        this.nroPago = nroPago;
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.idContrato = idContrato;
    }

    public Pago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getNroPago() {
        return nroPago;
    }

    public void setNroPago(int nroPago) {
        this.nroPago = nroPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }
}
