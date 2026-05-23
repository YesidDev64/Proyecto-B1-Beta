/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author LOQ
 */
public class GuardarArchivos {

    public void guardarLinea(String nombreArchivo, String linea) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true));

            bw.write(linea);
            bw.newLine();

            bw.close();

        } catch (IOException e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }
}
