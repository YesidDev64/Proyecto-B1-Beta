/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author LOQ
 */
public class Veterinario {
    private String nombreVeterinario;
    private String cedulaVete;
    private String Telefono; 
    private String especialidad; 
    
 public Veterinario(){
 }

    public Veterinario(String nombreVeterinario, String cedulaVete, String Telefono, String especialidad) {
        this.nombreVeterinario = nombreVeterinario;
        this.cedulaVete = cedulaVete;
        this.Telefono = Telefono;
        this.especialidad = especialidad;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getCedulaVete() {
        return cedulaVete;
    }

    public void setCedulaVete(String cedulaVete) {
        this.cedulaVete = cedulaVete;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
  public void mostrarDatos(){
      System.out.println("Cedula Veterinario"+ cedulaVete);
      System.out.println("Nombre "+ nombreVeterinario);
      System.out.println("Telefono"+ Telefono);
      System.out.println("Especialidad"+ especialidad);
  }
}

   