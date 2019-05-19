
package practicaAemet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Clock;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Observacion extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    private String encabezado [];
    //Array de 2 dimensiones porque es una tabla
    private String observaciones[][];
    public Observacion() {
        initComponents();
        
        // Serán 15 columnas porque el documento de txt tiene 15 columnas..
        encabezado = new String [15];
        //Lo mismo hay que saber  de cuantas filas(x) y columnas dispone el doc. de txt.
        observaciones = new String [105460][15];
            leerArchivo();
            cargarDatos();
        
// modelo = (DefaultTableModel) tblCotizaciones.getModel();
//  tblCotizaciones.setModel(modelo);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        scrCotizaciones = new javax.swing.JScrollPane();
        tblCotizaciones = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCotizaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Apellidos", "Nombre", "Telefono", "DNI"
            }
        ));
        scrCotizaciones.setViewportView(tblCotizaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrCotizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrCotizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Observacion().setVisible(true);
            }
        });
    }

//Leer los encabezados y los datos del archivo y
//almacenarlos en los arrays correspondientes.
    
     public void leerArchivo() {

        try {

            FileReader archivo = new FileReader("fichero/observaciones.csv");
            BufferedReader buffer = new BufferedReader(archivo);

            String linea;

            // Leemos la primera línea.
            linea = buffer.readLine();
            encabezado = linea.split(",");

            System.out.println(Arrays.toString(encabezado));

            // Seguimos leyendo las cotizaciones.
            boolean eof = false;
            int fila = 0;
            while (!eof) {

                linea = buffer.readLine();

                if (linea == null) {
                    eof = true;
                } else {
                    //elegimos el array a romper luego dentro del array
                    //elegimos que sea linea a linea y lo igualamos a 
                    //linea y llamamos a split
                    observaciones[fila] = linea.split(",");
                    //para que vaya leyendo linea a linea
                    fila++;
                }

            }

            // Comprobamos los valores del array cotizaciones.
            for (int i = 0; i < observaciones.length; i++) {

                System.out.println(Arrays.toString(observaciones[i]));

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida.");
        }

}
    //Muestra los datos de los arrays encabezados y cotizaciones en la tabla.
    public void cargarDatos() {
        
        modelo = new DefaultTableModel(observaciones, encabezado);
        tblCotizaciones.setModel(modelo);
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scrCotizaciones;
    private javax.swing.JTable tblCotizaciones;
    // End of variables declaration//GEN-END:variables
}
