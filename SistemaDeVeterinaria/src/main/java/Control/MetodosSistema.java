/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.util.Scanner;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mascota;
import modelo.Medicamento;
import modelo.Veterinario;
import modelo.CitaMedica;
import modelo.AntecedentesMedicos;
import modelo.ClinicaVeterinaria;

/**
 *
 * @author LOQ
 */
 public class MetodosSistema {
    Scanner e = new Scanner(System.in);
    ClinicaVeterinaria clinica = null;
    GuardarArchivos gestor = new GuardarArchivos();
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Mascota> mascotas = new ArrayList<>();
    ArrayList<Medicamento> medicamentos = new ArrayList<>();
    ArrayList<Veterinario> veterinarios = new ArrayList<>();
    ArrayList<CitaMedica> citas = new ArrayList<>();
    ArrayList<AntecedentesMedicos> antecedentes = new ArrayList<>();

    public int menu() {

        System.out.println("\n===== SISTEMA VETERINARIA =====");
    System.out.println("1. Registrar datos de la clinica");
    System.out.println("2. Mostrar datos de la clinica");
    System.out.println("3. Registrar cliente");
    System.out.println("4. Registrar mascota");
    System.out.println("5. Registrar veterinario");
    System.out.println("6. Registrar medicamento");
    System.out.println("7. Registrar cita medica");
    System.out.println("8. Registrar antecedentes medicos");
    System.out.println("9. Listar antecedentes medicos");
    System.out.println("10. Listar clientes");
    System.out.println("11. Listar mascotas");
    System.out.println("12. Listar veterinarios");
    System.out.println("13. Listar medicamentos");
    System.out.println("14. Listar citas");
        System.out.println("15 Mostrar Estadisticas: ");
    System.out.println("0. Salir");

    System.out.print("Seleccione una opcion: ");

    return e.nextInt();
}
    

    public void registrarClinica() {

        System.out.println("\n===== REGISTRO DATOS DE LA CLINICA =====");
        e.nextLine();

        System.out.print("Nombre de la clinica: ");
        String nombre = e.nextLine();

        System.out.print("RUC: ");
        String ruc = e.nextLine();

        System.out.print("Direccion: ");
        String direccion = e.nextLine();

        System.out.print("Telefono: ");
        String telefono = e.nextLine();

        clinica = new ClinicaVeterinaria(nombre, ruc, direccion, telefono);
        
        gestor.guardarLinea("clinica.txt", nombre + "|" + ruc + "|" + direccion + "|" + telefono);

        System.out.println("Datos de la clinica registrados correctamente en el archivo");
    }

    public void mostrarClinica() {

        System.out.println("\n===== DATOS DE LA CLINICA =====");

        if (clinica == null) {
            System.out.println("No hay datos de la clinica registrados");
            return;
        }

        clinica.mostrarDatos();
    }

    public void registrarCliente() {

        System.out.println("\n===== REGISTRO CLIENTE =====");
        e.nextLine();

        System.out.print("Cedula: ");
        String cedula = e.nextLine();

        if (buscarCliente(cedula)) {
            System.out.println("Ya existe un cliente con esa cedula");
            return;
        }

        System.out.print("Nombres y apellidos: ");
        String nombre = e.nextLine();

        System.out.print("Telefono: ");
        String telefono = e.nextLine();

        System.out.print("Correo: ");
        String correo = e.nextLine();

        Cliente c = new Cliente(cedula, nombre, telefono, correo);
        clientes.add(c);
        
        gestor.guardarLinea("clientes.txt", cedula 
                + "|" + nombre + "|" + telefono + "|" + correo);

        System.out.println("Cliente registrado correctamente");
    }

    public boolean buscarCliente(String cedula) {

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }

        return false;
    }

    public void registrarMascota() {

        System.out.println("\n===== REGISTRO MASCOTA =====");
        e.nextLine();

        System.out.print("Nombre: ");
        String nombre = e.nextLine();

        System.out.print("Especie: ");
        String especie = e.nextLine();

        System.out.print("Raza: ");
        String raza = e.nextLine();

        System.out.print("Edad: ");
        int edad = e.nextInt();

        System.out.print("Peso: ");
        double peso = e.nextDouble();
        e.nextLine();

        System.out.print("ID de la mascota: ");
        String idMascota = e.nextLine();

        Mascota m = new Mascota(nombre, especie, raza, edad, peso, idMascota);
        mascotas.add(m);

        gestor.guardarLinea("mascotas.txt", nombre + "|" + especie + "|" 
                + raza + "|" + edad + "|" + peso + "|" + idMascota);
        
        System.out.println("Mascota registrada correctamente");
    }

    public boolean buscarMascota(String nombre) {

        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equals(nombre)) {
                return true;
            }
        }

        return false;
    }

    public void registrarVeterinario() {

        System.out.println("\n===== REGISTRO VETERINARIO =====");
        e.nextLine();

        System.out.print("Cedula: ");
        String cedula = e.nextLine();

        if (buscarVeterinario(cedula)) {
            System.out.println("Ya existe un veterinario con esa cedula");
            return;
        }

        System.out.print("Nombres y apellidos: ");
        String nombre = e.nextLine();

        System.out.print("Telefono: ");
        String telefono = e.nextLine();

        System.out.print("Especialidad: ");
        String especialidad = e.nextLine();

        Veterinario v = new Veterinario(cedula, nombre, telefono, especialidad);
        veterinarios.add(v);
        
        gestor.guardarLinea("veterinarios.txt", cedula + "|" 
                + nombre + "|" + telefono + "|" + especialidad);

        System.out.println("Veterinario registrado correctamente");
    }

    public boolean buscarVeterinario(String cedula) {

        for (int i = 0; i < veterinarios.size(); i++) {
            if (veterinarios.get(i).getCedulaVete().trim().equals(cedula)); {
                return true;
            }
        }

        return false;
    }

    public void registrarMedicamento() {

        System.out.println("\n===== REGISTRO MEDICAMENTO =====");
        e.nextLine();

        System.out.print("Nombre medicamento: ");
        String nombre = e.nextLine();

        System.out.print("Cantidad disponible: ");
        int cantidad = e.nextInt();

        System.out.print("Costo medicamento: ");
        double costo = e.nextDouble();

        Medicamento m = new Medicamento(nombre, cantidad, costo);
        medicamentos.add(m);
        
        gestor.guardarLinea("medicamentos.txt", nombre + "|" 
                + cantidad + "|" + costo);

        System.out.println("Medicamento registrado correctamente");
    }

    public void registrarCita() {

        System.out.println("\n===== REGISTRO CITA MEDICA =====");
        e.nextLine();

        System.out.print("Fecha: ");
        String fecha = e.nextLine();

        System.out.print("Hora: ");
        String hora = e.nextLine();

        System.out.print("Motivo de la consulta: ");
        String motivo = e.nextLine();

        System.out.print("Diagnostico: ");
        String diagnostico = e.nextLine();

        System.out.print("Tratamiento: ");
        String tratamiento = e.nextLine();

        System.out.print("Costo consulta: ");
        double costo = e.nextDouble();
        e.nextLine();

        System.out.print("Cedula del cliente: ");
        String cedulaCliente = e.nextLine();

        if (!buscarCliente(cedulaCliente)) {
            System.out.println("Cliente no registrado");
            return;
        }

        System.out.print("Nombre de la mascota: ");
        String nombreMascota = e.nextLine();

        if (!buscarMascota(nombreMascota)) {
            System.out.println("Mascota no registrada");
            return;
        }

        System.out.print("Cedula del veterinario: ");
        String cedulaVeterinario = e.nextLine();

        if (!buscarVeterinario(cedulaVeterinario)) {
            System.out.println("Veterinario no registrado");
            return;
        }

        System.out.print("Regalo por consulta: ");
        String regalo = e.nextLine();

        CitaMedica cita = new CitaMedica(fecha, hora, motivo, diagnostico,
                tratamiento, costo, regalo, cedulaCliente,
                nombreMascota, cedulaVeterinario);

        citas.add(cita);
        
        gestor.guardarLinea("citas.txt", fecha + "|" + hora + "|" 
                + motivo + "|" + diagnostico + "|" + tratamiento
                + "|" + costo + "|" + regalo + "|" + cedulaCliente + "|" + nombreMascota + "|" + cedulaVeterinario);
        System.out.println("Cita medica registrada correctamente");
    }

    public void registrarAntecedente() {

        System.out.println("\n===== REGISTRO ANTECEDENTE MEDICO =====");
        e.nextLine();

        System.out.print("Nombre de la mascota: ");
        String nombreMascota = e.nextLine();

        if (!buscarMascota(nombreMascota)) {
            System.out.println("Mascota no registrada");
            return;
        }

        System.out.print("Enfermedad: ");
        String enfermedad = e.nextLine();

        System.out.print("Fecha diagnostico: ");
        String fecha = e.nextLine();

        System.out.print("Tratamiento: ");
        String tratamiento = e.nextLine();

        System.out.print("Observaciones: ");
        String observaciones = e.nextLine();

        AntecedentesMedicos a = new AntecedentesMedicos(
                nombreMascota, enfermedad, fecha, tratamiento, observaciones);

        antecedentes.add(a);
        
        gestor.guardarLinea("antecedentes.txt", nombreMascota 
                + "|" + enfermedad + "|" + fecha + "|" 
                + tratamiento + "|" + observaciones);

        System.out.println("Antecedente medico registrado correctamente");
    }

    public void listarAntecedentes() {

        System.out.println("\n===== LISTA ANTECEDENTES MEDICOS =====");

        for (int i = 0; i < antecedentes.size(); i++) {
            antecedentes.get(i).mostrarDatos();
            System.out.println("----------------------");
        }
    }

    public void listarClientes() {

        System.out.println("\n===== LISTA CLIENTES =====");

        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).mostrarDatos();
            System.out.println("----------------------");
        }
    }

    public void listarMascotas() {

        System.out.println("\n===== LISTA MASCOTAS =====");

        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).mostrarDatos();
            System.out.println("----------------------");
        }
    }

    public void listarVeterinarios() {

        System.out.println("\n===== LISTA VETERINARIOS =====");

        for (int i = 0; i < veterinarios.size(); i++) {
            veterinarios.get(i).mostrarDatos();
            System.out.println("----------------------");
        }
    }

    public void listarMedicamentos() {

        System.out.println("\n===== LISTA MEDICAMENTOS =====");

        for (int i = 0; i < medicamentos.size(); i++) {
            medicamentos.get(i).mostrarDatos();
            System.out.println("----------------------");
        }
    }

    public void listarCitas() {

        System.out.println("\n===== LISTA CITAS MEDICAS =====");

        for (int i = 0; i < citas.size(); i++) {
            citas.get(i).mostrarDatos();
            System.out.println("----------------------");
        }
    }
    
    public void mostrarEstadisticas() {

    System.out.println("\n===== ESTADISTICAS DEL SISTEMA =====");
    System.out.println("Total de clientes: " + clientes.size());
    System.out.println("Total de mascotas: " + mascotas.size());
    System.out.println("Total de veterinarios: " + veterinarios.size());
    System.out.println("Total de medicamentos: " + medicamentos.size());
    System.out.println("Total de citas medicas: " + citas.size());
    System.out.println("Total de antecedentes medicos: " + antecedentes.size());

    if (clinica != null) {
        System.out.println("Clinica registrada: Si");
    } else {
        System.out.println("Clinica registrada: No");
    }
}
 }


    






