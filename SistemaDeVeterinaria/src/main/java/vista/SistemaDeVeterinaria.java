/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;
import Control.MetodosSistema;
/**
 *
 * @author LOQ
 */
public class SistemaDeVeterinaria {

    public static void main(String[] args) {
        int opc;

        MetodosSistema metodos = new MetodosSistema();
        System.out.println("======================================");
        System.out.println("   CLINICA VETERINARIA HUELLITAS");
        System.out.println("   Sistema de Gestion Veterinaria");
        System.out.println("======================================");
        do {

            opc = metodos.menu();

            switch (opc) {

                case 1:
                    metodos.registrarClinica();
                    break;

                case 2:
                    metodos.mostrarClinica();
                    break;

                case 3:
                    metodos.registrarCliente();
                    break;

                case 4:
                    metodos.registrarMascota();
                    break;

                case 5:
                    metodos.registrarVeterinario();
                    break;

                case 6:
                    metodos.registrarMedicamento();
                    break;

                case 7:
                    metodos.registrarCita();
                    break;

                case 8:
                    metodos.registrarAntecedente();
                    break;

                case 9:
                    metodos.listarAntecedentes();
                    break;

                case 10:
                    metodos.listarClientes();
                    break;

                case 11:
                    metodos.listarMascotas();
                    break;

                case 12:
                    metodos.listarVeterinarios();
                    break;

                case 13:
                    metodos.listarMedicamentos();
                    break;

                case 14:
                    metodos.listarCitas();
                    break;
                    
                case 15:
                    metodos.mostrarEstadisticas();

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 0);

    }

}
