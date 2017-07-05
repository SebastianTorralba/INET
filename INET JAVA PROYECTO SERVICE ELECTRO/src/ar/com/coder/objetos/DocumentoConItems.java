/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.objetos;

import java.util.ArrayList;
import java.util.Iterator;

public class DocumentoConItems extends Documento {

    private ArrayList<TareaAsignada> tareasAsignadas;

    private ArrayList<RepuestoAsignado> repuestosAsignados;

    public DocumentoConItems() {
        tareasAsignadas = new ArrayList<>();
        repuestosAsignados = new ArrayList<>();

    }

    public int sizeRepuesto() {
        return repuestosAsignados.size();
    }

    public boolean containsRepuesto(Object o) {
        return repuestosAsignados.contains(o);
    }

    public boolean addRepuesto(RepuestoAsignado e) {
        return repuestosAsignados.add(e);
    }

    public boolean removeRepuesto(Object o) {
        return repuestosAsignados.remove(o);
    }

    public void clearRepuesto() {
        repuestosAsignados.clear();
    }

    public Iterator<RepuestoAsignado> iteratorRepuesto() {
        return repuestosAsignados.iterator();
    }

    public int sizeTarea() {
        return tareasAsignadas.size();
    }

    public boolean containsTarea(Object o) {
        return tareasAsignadas.contains(o);
    }

    public boolean addTarea(TareaAsignada e) {
        return tareasAsignadas.add(e);
    }

    public boolean removeTarea(Object o) {
        return tareasAsignadas.remove(o);
    }

    public void clearTarea() {
        tareasAsignadas.clear();
    }

    public Iterator<TareaAsignada> iteratorTarea() {
        return tareasAsignadas.iterator();
    }

}
