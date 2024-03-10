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
    
    private int cedula;

    public Cliente(String nombre, String correo, int celular, String pagomet, int numero, String producto,int pcedula) {
        super(nombre, correo, celular, pagomet, numero, producto);
        cedula = pcedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    

}
