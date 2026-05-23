/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author LOQ
 */
public class Mascota {
    private String nombre; 
    private String especie; 
    private String raza; 
    private int edad; 
    private double peso; 
    private String idMascota; 

    public Mascota(){
        
    }

    public Mascota(String nombre, String especie, String raza, int edad, double peso, String idMascota) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.idMascota = idMascota;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }
    public void mostrarDatos(){
        System.out.println("Nombre de la Mascota:"+ nombre);
        System.out.println("Especie de la Mascota:"+ especie);
        System.out.println("Raza de la Mascota:"+ raza);
         System.out.println("Edad:"+ edad);
         System.out.println("Peso:" + peso);
         System.out.println("ID Mascota"+ idMascota);
    }
}
