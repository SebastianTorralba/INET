/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.objetos;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Documento {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private ElectroDomestico electroDomestico;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ElectroDomestico getElectroDomestico() {
        return electroDomestico;
    }

    public void setElectroDomestico(ElectroDomestico electroDomestico) {
        this.electroDomestico = electroDomestico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Documento other = (Documento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
