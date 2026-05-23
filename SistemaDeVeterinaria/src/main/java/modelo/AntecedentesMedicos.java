/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author LOQ
 */
public class AntecedentesMedicos  {
    private String nombreMascota;
    private String enfermedad; 
    private String fechaDiagnostico; 
    private String tratamiento; 
    private String observaciones;
    
 public AntecedentesMedicos (){
     
 }

    public AntecedentesMedicos(String nombreMascota, String enfermedad, String fechaDiagnostico, String tratamiento, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.enfermedad = enfermedad;
        this.fechaDiagnostico = fechaDiagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public void mostrarDatos(){
        System.out.println("Mascotta"+ nombreMascota);
        System.out.println("Enfermedad que tiene o a tenido:"+ enfermedad);
          System.out.println("Fecha Diagnostico:"+ fechaDiagnostico);
           System.out.println("Tratamiendo Dado: "+ tratamiento);
           System.out.println("Observaciones a Dar: "+ observaciones);
    }
 
}
