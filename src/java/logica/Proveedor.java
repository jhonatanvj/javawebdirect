/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author jhona
 */
public class Proveedor extends Persona{
    
    private String nombreProveedor;
    private String direccion;

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   public Proveedor(String nombre, String correo, int celular, String pagomet, int numero, String producto, String pnombreProveedor, String pdireccion) {
    super(nombre, correo, celular, pagomet, numero, producto);
    nombreProveedor = pnombreProveedor;
    direccion = pdireccion;
}

  
    
    
   
    
}
