/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author jhona
 */
public class Persona {
    private String nombre;
    private String correo;
    private String celular;
    private String pagomet;
    private String numero;
    private String producto;

    public Persona(String nombre, String correo, String celular, String pagomet, String numero, String producto) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.pagomet = pagomet;
        this.numero = numero;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPagomet() {
        return pagomet;
    }

    public void setPagomet(String pagomet) {
        this.pagomet = pagomet;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

   
    
    
    
}


