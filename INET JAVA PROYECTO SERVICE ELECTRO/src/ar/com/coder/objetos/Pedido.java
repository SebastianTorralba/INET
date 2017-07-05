/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Pedido extends Documento {

    private Date fechaRetiro;
    private ArrayList<Diagnostico> diagnosticos;
    private ArrayList<Presupuesto> presupuestos;
    private ArrayList<OrdenDeServicio> ordenesDeServicio;

    public Pedido() {
        diagnosticos=new ArrayList<>();
        presupuestos=new ArrayList<>();
        ordenesDeServicio=new ArrayList<>();
        
    }
   
     
    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public int sizeDiagnostico() {
        return diagnosticos.size();
    }

    public boolean containsDiagnostico(Object o) {
        return diagnosticos.contains(o);
    }

    public boolean addDiagnostico(Diagnostico e) {
        return diagnosticos.add(e);
    }

    public boolean removeDiagnostico(Object o) {
        return diagnosticos.remove(o);
    }

    public void clearDiagnostico() {
        diagnosticos.clear();
    }

    public Iterator<Diagnostico> iteratorDiagnostico() {
        return diagnosticos.iterator();
    }

    public int sizePresupuesto() {
        return presupuestos.size();
    }

    public boolean containsPresupuesto(Object o) {
        return presupuestos.contains(o);
    }

    public boolean addPresupuesto(Presupuesto e) {
        return presupuestos.add(e);
    }

    public int sizeOrdenDeServicio() {
        return ordenesDeServicio.size();
    }

    public boolean containsOrdenDeServicio(Object o) {
        return ordenesDeServicio.contains(o);
    }

    public boolean addOrdenDeServicio(OrdenDeServicio e) {
        return ordenesDeServicio.add(e);
    }

    public boolean removeOrdenDeServicio(Object o) {
        return ordenesDeServicio.remove(o);
    }

    public void clearOrdenDeServicio() {
        ordenesDeServicio.clear();
    }

    public Iterator<OrdenDeServicio> iteratorOrdenDeServicio() {
        return ordenesDeServicio.iterator();
    }

    public boolean removePresupuesto(Object o) {
        return presupuestos.remove(o);
    }

    public void clearPresupuesto() {
        presupuestos.clear();
    }

    public Iterator<Presupuesto> iteratorPresupuesto() {
        return presupuestos.iterator();
    }
    
    
    
}
