/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author LOQ
 */
public class Cliente  {
    private String cedula;
    private String nombresApellidos;
    private String Telefono;
    private String correo; 
    
    public Cliente(){
    }

    public Cliente(String cedula, String nombresApellidos, String Telefono, String correo) {
        this.cedula = cedula;
        this.nombresApellidos = nombresApellidos;
        this.Telefono = Telefono;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void mostrarDatos() {

    System.out.println("Cedula: " + cedula);
    System.out.println("Nombre: " + nombresApellidos);
    System.out.println("Telefono: " + Telefono);
    System.out.println("Correo: " + correo);

}
}
