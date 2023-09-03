/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dalvi
 */
public class Archivo {
    public void GuardarDatos(String cadena, File archivo) {
        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(cadena + "\r\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void Modificar(String cadenaA, String cadenaN, File archivoA) {
        File archivoN = new File("C:\\Datos\\Auxiliar.txt");

        try {
            archivoN.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        BufferedReader br;
        try {
            if (archivoA.exists()) {

                br = new BufferedReader(new FileReader(archivoA));

                String linea;

                while ((linea = br.readLine()) != null) {

                    if (linea.equals(cadenaA)) {
                        GuardarDatos(cadenaN, archivoN);
                    } else {
                        GuardarDatos(linea, archivoN);
                    }
                }

                br.close();

                Borrar(archivoA);
                archivoN.renameTo(archivoA);

            } else {
                System.out.println("No existe el archivo");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void Borrar(File f) {
        try {
            if (f.exists()) {
                f.delete();
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
  
}

    

