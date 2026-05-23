/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LOQ
 */
public class CitaMedica  {
    private String fecha;
    private String Hora; 
    private String motivoConsulta;
    private String Diagnostico; 
    private String tratamientoMascota; 
    private double costoConsulta;
    private String regaloConsulta;
    
    private String cedulaCliente;
    private String nombreMascota;
    private String cedulaVeterinario;
    
    
 private CitaMedica(){
 }

    public CitaMedica(String fecha, String Hora, String motivoConsulta, String Diagnostico, String tratamientoMascota, double costoConsulta, String regaloConsulta, String cedulaCliente, String nombreMascota, String cedulaVeterinario) {
        this.fecha = fecha;
        this.Hora = Hora;
        this.motivoConsulta = motivoConsulta;
        this.Diagnostico = Diagnostico;
        this.tratamientoMascota = tratamientoMascota;
        this.costoConsulta = costoConsulta;
        this.regaloConsulta = regaloConsulta;
        this.cedulaCliente = cedulaCliente;
        this.nombreMascota = nombreMascota;
        this.cedulaVeterinario = cedulaVeterinario;
    }

   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getTratamientoMascota() {
        return tratamientoMascota;
    }

    public void setTratamientoMascota(String tratamientoMascota) {
        this.tratamientoMascota = tratamientoMascota;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public String getRegaloConsulta() {
        return regaloConsulta;
    }

    public void setRegaloConsulta(String regaloConsulta) {
        this.regaloConsulta = regaloConsulta;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getCedulaVeterinario() {
        return cedulaVeterinario;
    }

    public void setCedulaVeterinario(String cedulaVeterinario) {
        this.cedulaVeterinario = cedulaVeterinario;
    }
    public void mostrarDatos(){
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + Hora);
        System.out.println("Motivo: " + motivoConsulta);
        System.out.println("Diagnostico: " + Diagnostico);
        System.out.println("Tratamiento: " + tratamientoMascota);
        System.out.println("Costo consulta: " + costoConsulta);
        System.out.println("Regalo por la Consulta"+ regaloConsulta);
        System.out.println("Cedula cliente: " + cedulaCliente);
        System.out.println("Mascota: " + nombreMascota);
        System.out.println("Cedula veterinario: " + cedulaVeterinario);
        
    }
}

