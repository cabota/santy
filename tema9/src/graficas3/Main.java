package graficas3;

import java.util.ArrayList;

import javax.swing.JFrame;

import graficas3.MedicionTemperatura;

public class Main extends JFrame {

    public static void main(String[] args) {

        new Main();

    }

    public Main() {

        super("Ejemplo bueno de gráficos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Datos de ejemplo.
        ArrayList<MedicionTemperatura> datos = getMediciones();

        // Creamos un Grafico con estos datos y lo añadimos a nuestra ventana.
        Grafico grafico = new Grafico("Temperatura media doraria", "Día", "Temperatura", datos);

        add(grafico.obtenerGrafica());

        pack();

        setVisible(true);

    }

    // Datos falsos (estos deberían venir en realidad del modelo de la aplicación).
    private ArrayList<MedicionTemperatura> getMediciones() {

        ArrayList<MedicionTemperatura> datos = new ArrayList<>();

        datos.add(new MedicionTemperatura(13, "Estación Lloseta", "Lunes"));
        datos.add(new MedicionTemperatura(11, "Estación Lloseta", "Martes"));
        datos.add(new MedicionTemperatura(4, "Estación Lloseta", "Miércoles"));
        datos.add(new MedicionTemperatura(-1, "Estación Lloseta", "Jueves"));
        datos.add(new MedicionTemperatura(4, "Estación Lloseta", "Viernes"));
        datos.add(new MedicionTemperatura(5, "Estación Lloseta", "Sábado"));
        datos.add(new MedicionTemperatura(7, "Estación Lloseta", "Domingo"));

        datos.add(new MedicionTemperatura(5, "Estación Lluc", "Lunes"));
        datos.add(new MedicionTemperatura(8, "Estación Lluc", "Martes"));
        datos.add(new MedicionTemperatura(-3, "Estación Lluc", "Miércoles"));
        datos.add(new MedicionTemperatura(-1, "Estación Lluc", "Jueves"));
        datos.add(new MedicionTemperatura(-1, "Estación Lluc", "Jueves"));
        datos.add(new MedicionTemperatura(2, "Estación Lluc", "Viernes"));
        datos.add(new MedicionTemperatura(0, "Estación Lluc", "Sábado"));

        return datos;

    }

}