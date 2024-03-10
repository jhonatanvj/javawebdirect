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
    private int celular;
    private String pagomet;
    private int numero;
    private String producto;

    public Persona(String nombre, String correo, int celular, String pagomet, int numero, String producto) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.pagomet = pagomet;
        this.numero = numero;
        this.producto = producto;
    }
    
 

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getPagomet() {
        return pagomet;
    }

    public void setPagomet(String pagomet) {
        this.pagomet = pagomet;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}


