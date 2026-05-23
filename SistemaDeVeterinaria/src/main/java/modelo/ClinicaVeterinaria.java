/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author LOQ
 */
public class ClinicaVeterinaria  {
    private String nombreClinica;
    private String ruc; 
    private String direccion; 
    private String telefono;
    
  public ClinicaVeterinaria(){
      
  }

    public ClinicaVeterinaria(String nombreClinica, String ruc, String direccion, String telefono) {
        this.nombreClinica = nombreClinica;
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void mostrarDatos() {
        System.out.println("Nombre clinica: " + nombreClinica);
        System.out.println("RUC: " + ruc);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }
}
