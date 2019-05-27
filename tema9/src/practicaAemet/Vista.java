/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaAemet;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author horabaixa
 */
public class Vista extends javax.swing.JFrame {
static ArrayList<String>listProvincias;
static ArrayList<String>listEstaciones;
static ArrayList<String[]>idpro;
static ArrayList<String[]>datos;
static JTable jTable1 = new JTable();
static JFreeChart chart ;
 Provincia p5;
 
 static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form Vista
     */
    
    public Vista() {
        
        
        initComponents();
        obtenerProvincias();
        enviarProvincias();
        enviarEstaciones();
       // obtenerEstacion();
        
        
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEleccionesBuscar = new javax.swing.JPanel();
        lblProvincia = new javax.swing.JLabel();
        lblDataInici = new javax.swing.JLabel();
        cmbListProvincias = new javax.swing.JComboBox<>();
        txtDataInici = new javax.swing.JTextField();
        lblEstacion = new javax.swing.JLabel();
        lblDataFin = new javax.swing.JLabel();
        cmbEstacion = new javax.swing.JComboBox<>();
        txtDataFin = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        pnlEnglobaTodoAbajo = new javax.swing.JPanel();
        pnlGraficaGran = new javax.swing.JPanel();
        pnlGenerarGraf = new javax.swing.JPanel();
        pnlContenedorGenerarGraf = new javax.swing.JPanel();
        lblMagnitud = new javax.swing.JLabel();
        btnGenerarGrafica = new javax.swing.JButton();
        cmbMagnitud = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEleccionesBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProvincia.setText("Provincia");

        lblDataInici.setText("Fecha inicio");

        cmbListProvincias.setName(""); // NOI18N
        cmbListProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListProvinciasActionPerformed(evt);
            }
        });

        lblEstacion.setText("Estación");

        lblDataFin.setText("Fecha fin");

        cmbEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstacionActionPerformed(evt);
            }
        });

        txtDataFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataFinActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEleccionesBuscarLayout = new javax.swing.GroupLayout(pnlEleccionesBuscar);
        pnlEleccionesBuscar.setLayout(pnlEleccionesBuscarLayout);
        pnlEleccionesBuscarLayout.setHorizontalGroup(
            pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEleccionesBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProvincia)
                    .addComponent(lblDataInici))
                .addGap(41, 41, 41)
                .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataInici, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbListProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstacion)
                    .addComponent(lblDataFin))
                .addGap(35, 35, 35)
                .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEstacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDataFin))
                .addGap(80, 80, 80)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        pnlEleccionesBuscarLayout.setVerticalGroup(
            pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEleccionesBuscarLayout.createSequentialGroup()
                .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEleccionesBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProvincia)
                            .addComponent(cmbListProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstacion)
                            .addComponent(cmbEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnlEleccionesBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataInici)
                            .addComponent(txtDataInici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataFin)
                            .addComponent(txtDataFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEleccionesBuscarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnlEnglobaTodoAbajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlGraficaGran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlGraficaGranLayout = new javax.swing.GroupLayout(pnlGraficaGran);
        pnlGraficaGran.setLayout(pnlGraficaGranLayout);
        pnlGraficaGranLayout.setHorizontalGroup(
            pnlGraficaGranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        pnlGraficaGranLayout.setVerticalGroup(
            pnlGraficaGranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        pnlGenerarGraf.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlContenedorGenerarGraf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlContenedorGenerarGraf.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlContenedorGenerarGrafComponentShown(evt);
            }
        });

        javax.swing.GroupLayout pnlContenedorGenerarGrafLayout = new javax.swing.GroupLayout(pnlContenedorGenerarGraf);
        pnlContenedorGenerarGraf.setLayout(pnlContenedorGenerarGrafLayout);
        pnlContenedorGenerarGrafLayout.setHorizontalGroup(
            pnlContenedorGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContenedorGenerarGrafLayout.setVerticalGroup(
            pnlContenedorGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        lblMagnitud.setText("Magnitud");

        btnGenerarGrafica.setText("Generar gráfica");
        btnGenerarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarGraficaActionPerformed(evt);
            }
        });

        cmbMagnitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        javax.swing.GroupLayout pnlGenerarGrafLayout = new javax.swing.GroupLayout(pnlGenerarGraf);
        pnlGenerarGraf.setLayout(pnlGenerarGrafLayout);
        pnlGenerarGrafLayout.setHorizontalGroup(
            pnlGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenerarGrafLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlGenerarGrafLayout.createSequentialGroup()
                        .addGroup(pnlGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGenerarGrafLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGenerarGrafica)
                                .addGap(37, 48, Short.MAX_VALUE))
                            .addComponent(pnlContenedorGenerarGraf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnlGenerarGrafLayout.createSequentialGroup()
                        .addComponent(lblMagnitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        pnlGenerarGrafLayout.setVerticalGroup(
            pnlGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenerarGrafLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGenerarGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMagnitud)
                    .addComponent(cmbMagnitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(pnlContenedorGenerarGraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEnglobaTodoAbajoLayout = new javax.swing.GroupLayout(pnlEnglobaTodoAbajo);
        pnlEnglobaTodoAbajo.setLayout(pnlEnglobaTodoAbajoLayout);
        pnlEnglobaTodoAbajoLayout.setHorizontalGroup(
            pnlEnglobaTodoAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnglobaTodoAbajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGraficaGran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlGenerarGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEnglobaTodoAbajoLayout.setVerticalGroup(
            pnlEnglobaTodoAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGraficaGran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlGenerarGraf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEleccionesBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlEnglobaTodoAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEleccionesBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEnglobaTodoAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbListProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListProvinciasActionPerformed
           // System.out.println(cmbListProvincias.getSelectedItem().toString());
               // rellenaComboEstacion(cmbListProvincias.getSelectedItem().toString());
                
               
                 
                for(int i =0;i<idpro.size();i++){
                    String[] idcompa= idpro.get(i);
                if( idcompa[1].contains(cmbListProvincias.getSelectedItem().toString())){
                    rellenaComboEstacion(idcompa[0]);
                }
                        
                        }
               
                
               
    }//GEN-LAST:event_cmbListProvinciasActionPerformed

    private void btnGenerarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarGraficaActionPerformed
        // TODO add your handling code here:
        pnlContenedorGenerarGraf.setLayout(new FlowLayout());
        
        chart = this.crearGrafica();
        ChartPanel CP = new ChartPanel(chart);
         pnlContenedorGenerarGraf.add(CP);
         pnlContenedorGenerarGraf.setVisible(true);
        
        
       // pnlContenedorGenerarGraf.add(crearGrafica());
    }//GEN-LAST:event_btnGenerarGraficaActionPerformed

    private void cmbEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstacionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbEstacionActionPerformed

    private void txtDataFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataFinActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        pnlGraficaGran.setLayout(new FlowLayout());
        if(txtDataFin.getText().isEmpty()&& txtDataInici.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Las fechas no pueden estar vacias");
        }else{
            if(!validarFecha(txtDataFin.getText()) || !validarFecha(txtDataInici.getText())){
                JOptionPane.showMessageDialog(null, "Las fechas Tiene que ser un formato YYYY-MM-DD");
            }else{
            
            try {
                Obtenerdatos(cmbEstacion.getSelectedItem().toString(), txtDataInici.getText(), txtDataFin.getText());
                  pnlGraficaGran.add(jTable1);
         pnlGraficaGran.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            } 
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void pnlContenedorGenerarGrafComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlContenedorGenerarGrafComponentShown
            
        
    }//GEN-LAST:event_pnlContenedorGenerarGrafComponentShown

    /**
     * @param args the command line arguments
     */
 
    public static void main(String args[]) {
          
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
                
            }
        });
    }
         public static void obtenerProvincias(){
        try {
            FileReader archivoProvincas;
            archivoProvincas = new FileReader("fichero/provincias.csv");
            BufferedReader brListadoProvincias = new BufferedReader(archivoProvincas);
           boolean eof = false;
            String lineaLectora;
           
           listProvincias = new ArrayList<>();
           idpro = new ArrayList<>();
           while(!eof) {
               lineaLectora=brListadoProvincias.readLine();
               if(lineaLectora!=null){
                   String listaNombreProvincias=lineaLectora.substring(lineaLectora.indexOf(",")+1,lineaLectora.length()); //Muestra a partir de la ,
//                   String listadoDone = listaNombreProvincias[1];  //Muestra la lista de los nombres
//                   String listaDoneOk = listadoDone.replaceAll("\"", "");//Reemplaza "" por caracteres extraños

                       String[] id = lineaLectora.split(",");
                  
                    //listIdProvincias.add(id[0]);
                   idpro.add(id);
                   listProvincias.add(listaNombreProvincias.replaceAll("\"", ""));

                   
               }else{
                   eof=true;
               }
               
               
           }
           //System.out.println(listProvincias);
           
           archivoProvincas.close();
           brListadoProvincias.close();
           
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el doc.");;
        }catch(IOException e){
            System.out.println("Error en entrada o salida.");
        }
        
        
    } 
         
          public static void Obtenerdatos(String estacion,String fechaini, String fechafin) throws ParseException, IOException{
        try {
            FileReader archivoProvincas;
            archivoProvincas = new FileReader("fichero/observaciones.csv");
            BufferedReader brListadoProvincias = new BufferedReader(archivoProvincas);
           boolean eof = false;
            String lineaLectora;
           
           datos = new ArrayList<String[]>();
        
           while(!eof) {
               lineaLectora=brListadoProvincias.readLine();
               if(lineaLectora!=null  ){
                   if(!lineaLectora.contains("ESPESOR_NIEVE")){
                 
//                   String listadoDone = listaNombreProvincias[1];  //Muestra la lista de los nombres
//                   String listaDoneOk = listadoDone.replaceAll("\"", "");//Reemplaza "" por caracteres extraños

                       String[] dat = lineaLectora.split(",");
                       if(dat[2].contains(estacion)){
                           Date fechain = sdf.parse(fechaini);
                           Date fechafi=sdf.parse(fechafin);
                           Date fechadoc=sdf.parse(dat[1].replaceAll("\"", ""));
                           if(comprobarfecha(fechain,fechafi,fechadoc)){
                               datos.add(dat);
                           }
                           
                        
                          
                           
                           
                       }
                       
                       
                   }
                  
                   
                  

                   
               }else{
                     ListarTabla(jTable1, datos);
                   eof=true;
               }
               
               
           }
           //System.out.println(listProvincias);
           
           archivoProvincas.close();
           brListadoProvincias.close();
           
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el doc.");;
        }catch(IOException e){
            System.out.println("Error en entrada o salida.");
        }
        
        
    } 
    public static void enviarProvincias() {
        
        for(String listaPro : listProvincias){
            
            cmbListProvincias.addItem(listaPro.toString());
        }
    }
    
    public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
     public static void enviarEstaciones() {
        
        for(String listaPro : listEstaciones){
            
            cmbEstacion.addItem(listaPro.toString());
        }
    }
     
     public JFreeChart crearGrafica() {

DefaultCategoryDataset dataset = new DefaultCategoryDataset();

dataset.setValue(3, "Presidente", "Enero");
dataset.setValue(6, "Presidente", "Febrero");
dataset.setValue(3, "Presidente", "Marzo");
dataset.setValue(3, "Presidente", "Abril");
dataset.setValue(8, "Presidente", "Mayo");
dataset.setValue(10, "Presidente", "Junio");
dataset.setValue(14, "Presidente", "Julio");
                dataset.setValue(3, "Presidente", "Agosto");
                dataset.setValue(3, "Presidente", "Septiembre");
                dataset.setValue(15, "Presidente", "Octubre");
                dataset.setValue(14, "Presidente", "Noviembre");
                dataset.setValue(3, "Presidente", "Diciembre");

dataset.setValue(6, "Ministro", "Enero");
dataset.setValue(5, "Ministro", "Febrero");
dataset.setValue(8, "Ministro", "Marzo");
dataset.setValue(3, "Ministro", "Abril");
dataset.setValue(7, "Ministro", "Mayo");
dataset.setValue(6, "Ministro", "Junio");
dataset.setValue(8, "Ministro", "Julio");
                dataset.setValue(12, "Ministro", "Agosto");
                dataset.setValue(3, "Ministro", "Septiembre");
                dataset.setValue(14, "Ministro", "Octubre");
                dataset.setValue(8, "Ministro", "Noviembre");
                dataset.setValue(6, "Ministro", "Diciembre");

JFreeChart grafi = ChartFactory.createLineChart("Comparativa de conferencias en un año", "Mes", "Conferencias", dataset,
PlotOrientation.VERTICAL, true, true, false);


grafi.getPlot().setBackgroundPaint(Color.BLUE);

return grafi;

}
    
    public static void rellenaComboEstacion(String provinciaSelected){
          
           
         try {
            FileReader archivoEstacion;
            archivoEstacion = new FileReader("fichero/estaciones.csv");
            BufferedReader brListadoEstaciones = new BufferedReader(archivoEstacion);
           boolean eof = false;
            String lineaLectora;
           
           listEstaciones = new ArrayList<>();
           while(!eof) {
               lineaLectora=brListadoEstaciones.readLine();
               if(lineaLectora!=null  ){
                      String [] comparacion =lineaLectora.split(",");
                      cmbEstacion.removeAllItems();
                    
                    if(comparacion[3].equalsIgnoreCase(provinciaSelected)){
                    
                   listEstaciones.add(comparacion[1].replaceAll("\"", ""));
                    }else{
                        
                    }
                   
               }else{
                   eof=true;
               }
               
               
           }
           enviarEstaciones();
          // System.out.println(listEstaciones);
           
           archivoEstacion.close();
           brListadoEstaciones.close();
           
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el doc.");;
        }catch(IOException e){
            System.out.println("Error en entrada o salida.");
        }
        
    }
    
    public static boolean comprobarfecha(Date in ,Date out,Date doc){   
            if(doc.after(in) && doc.before(out) ){
                    return true;
            }else{
                    return false;
            }
    }
    public static void ListarTabla(JTable tabla ,ArrayList<String[]> dat){
    DefaultTableModel modeloTabla= new DefaultTableModel();
    tabla.setModel(modeloTabla);

    modeloTabla.addColumn("FECHA");
    modeloTabla.addColumn("HORA");
    modeloTabla.addColumn("temperatura");
    modeloTabla.addColumn("Humedad");
    modeloTabla.addColumn("Viento");
    modeloTabla.addColumn("Direccion viento");
    modeloTabla.addColumn("Nieve");
    modeloTabla.addColumn("Lluvia");
    modeloTabla.addColumn("Visibilidad");
    

    Object[] columna= new Object[9];

    
    
    for (int i = 0; i < dat.size(); i++) {
        String[] datpro = dat.get(i);       
        String[] fechashora= datpro[1].split(" ");
        columna[0]= fechashora[0];
        columna[1]= fechashora[1];
        columna[2]= datpro[10];
        columna[3]= datpro[7];
        columna[4]= datpro[4];
        columna[5]= datpro[6];
        columna[6]= datpro[14];
        columna[7]= datpro[3];
        columna[8]= datpro[13];
        

        modeloTabla.addRow(columna);
      
     }
    jTable1=tabla;
    
   }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerarGrafica;
    private static javax.swing.JComboBox<String> cmbEstacion;
    private static javax.swing.JComboBox<String> cmbListProvincias;
    private javax.swing.JComboBox<String> cmbMagnitud;
    private javax.swing.JLabel lblDataFin;
    private javax.swing.JLabel lblDataInici;
    private javax.swing.JLabel lblEstacion;
    private javax.swing.JLabel lblMagnitud;
    private javax.swing.JLabel lblProvincia;
    private static javax.swing.JPanel pnlContenedorGenerarGraf;
    private javax.swing.JPanel pnlEleccionesBuscar;
    private javax.swing.JPanel pnlEnglobaTodoAbajo;
    private javax.swing.JPanel pnlGenerarGraf;
    private static javax.swing.JPanel pnlGraficaGran;
    private javax.swing.JTextField txtDataFin;
    private javax.swing.JTextField txtDataInici;
    // End of variables declaration//GEN-END:variables
}
