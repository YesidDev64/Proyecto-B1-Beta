/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author LOQ
 */
public class Medicamento {
    private String nombreMedicamento;
    private int cantidadStock; 
    private double costoMedicamento; 
    
 public Medicamento(){
 }

    public Medicamento(String nombreMedicamento, int cantidadStock, double costoMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantidadStock = cantidadStock;
        this.costoMedicamento = costoMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getCostoMedicamento() {
        return costoMedicamento;
    }

    public void setCostoMedicamento(double costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }
 
  public void mostrarDatos(){
      System.out.println("Medicamento:"+ nombreMedicamento);
      System.out.println("Cantidad Dispoble: "+ cantidadStock);
      System.out.println("Costo: "+ costoMedicamento);
  }
 
}
