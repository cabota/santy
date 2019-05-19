package practicaAemet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//le paso un arraylist al metodo y seleccion de estacion por cada provincia
//metodo que devuelva arrayList y reciba una provincia (por 
public class ObservacionClass {
     public static void main(String[] args) throws IOException{
        
        ObservacionClass classe= new ObservacionClass();
         classe.leerfichero("fichero/observaciones.csv");
    } 
    public String[] leerfichero(String ruta) throws IOException {
        
        String[] datos = null;
        
         try {
            BufferedReader br = null;
            
            br = new BufferedReader(new FileReader("fichero/observaciones.csv"));
            
            String liniea = br.readLine();
            
            while  (liniea!=null){
                datos=liniea.split(",");
                
                System.out.print(liniea);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObservacionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return datos;
        
    }
     
}


