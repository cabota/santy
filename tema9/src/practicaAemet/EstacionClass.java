package practicaAemet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class EstacionClass {
    String lineaLectora;
    static ArrayList<String>listEstaciones;
     public EstacionClass() {
    }
    public static void obtenerEstacion(String Provincia){
        
        String []Pronvincia = obtenerProvincia();
        for(int i =0;i<Provincia.lenght;i++){
            obtenerProvincia=Provincia[i];
        }
         try {
            FileReader archivoEstacion;
            archivoEstacion = new FileReader("fichero/estaciones.csv");
            BufferedReader brListadoEstaciones = new BufferedReader(archivoEstacion);
           boolean eof = false;
            String lineaLectora;
           listEstaciones = new ArrayList<>();
           while(!eof) {
               lineaLectora=brListadoEstaciones.readLine();
               if(lineaLectora!=null){
                   String listaNombreProvincias=lineaLectora.substring(lineaLectora.indexOf(",")+1,lineaLectora.length()); //Muestra a partir de la ,
                      listEstaciones.add(listaNombreProvincias);
               }else{
                   eof=true;
               }
           }
           System.out.println(listEstaciones);
           
           archivoEstacion.close();
           brListadoEstaciones.close();
           
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el doc.");;
        }catch(IOException e){
            System.out.println("Error en entrada o salida.");
        }
    }
     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               EstacionClass e1 = new EstacionClass();
               obtenerEstacion();
               
                
            }
        });
    }
}
