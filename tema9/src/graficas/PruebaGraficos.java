/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Pruebas de la librería gráfica JFreeChart.
 * 
 * @author horabaixa
 *
 */
public class PruebaGraficos extends JFrame {

	public static void main(String[] args) {

		new PruebaGraficos();

	}

	public PruebaGraficos() {

		super("Ejemplo de gráficos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JFreeChart chart = crearGrafica();

		ChartPanel panel = new ChartPanel(chart);

		add(panel);

		pack();

		setVisible(true);

	}

	public JFreeChart crearGrafica() {

		// Creamos el modelo para almacenar los datos que queremos representar.
                //llamamos al modelo dataset
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		// Añadimos los datos para la categoría "Temperatura media" y dos estaciones.
		dataset.setValue(13, "Estación Lloseta", "Lunes");
		dataset.setValue(11, "Estación Lloseta", "Martes");
		dataset.setValue(4, "Estación Lloseta", "Miércoles");
		dataset.setValue(-1, "Estación Lloseta", "Jueves");
		dataset.setValue(4, "Estación Lloseta", "Viernes");
		dataset.setValue(5, "Estación Lloseta", "Sábado");
		dataset.setValue(7, "Estación Lloseta", "Domingo");

		dataset.setValue(5, "Estación Lluc", "Lunes");
		dataset.setValue(8, "Estación Lluc", "Martes");
		dataset.setValue(-3, "Estación Lluc", "Miércoles");
		dataset.setValue(-1, "Estación Lluc", "Jueves");
		dataset.setValue(2, "Estación Lluc", "Viernes");
		dataset.setValue(0, "Estación Lluc", "Sábado");
		dataset.setValue(2, "Estación Lluc", "Domingo");

                //objeto con metodo estatico que devuelve ...
                //representan la x , la y, datos, posicionamiento, y true true false que son
                //?,tooltip, url 
		JFreeChart chart = ChartFactory.createLineChart("Temperatura media diaria", "Día", "Temperatura", dataset,
				PlotOrientation.VERTICAL, true, true, false);

		// chart.setBackgroundPaint(Color.WHITE); // Fondo alrededor de la gráfica en
		// blanco (ya lo está).

		// Fondo de lna gráfica en blanco. También quita las líneas horizontales
		// punteadas.
		chart.getPlot().setBackgroundPaint(Color.WHITE);

		return chart;

	}

}