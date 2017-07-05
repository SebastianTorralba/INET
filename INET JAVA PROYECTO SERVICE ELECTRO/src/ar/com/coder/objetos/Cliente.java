/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.objetos;

/**
 *
 * @author Sebastian
 */
public class Cliente {

    private int id;

    private String apellidoNombre;

    private String documento;

    private String telefono;

    private String domicilio;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Get the value of documento
     *
     * @return the value of documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Set the value of documento
     *
     * @param documento new value of documento
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Get the value of apellidoNombre
     *
     * @return the value of apellidoNombre
     */
    public String getApellidoNombre() {
        return apellidoNombre;
    }

    /**
     * Set the value of apellidoNombre
     *
     * @param apellidoNombre new value of apellidoNombre
     */
    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

}
