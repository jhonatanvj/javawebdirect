/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author jhona
 */
public class Cliente extends Persona{
    
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Cliente(String nombre, String correo, String celular, String pagomet, String numero, String producto, String pcedula) {
        super(nombre, correo, celular, pagomet, numero, producto);
        cedula = pcedula;
    }

   
    

}
