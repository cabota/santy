/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

/**
 *
 * @author horabaixa
 */


import java.awt.Color;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class ActGraf extends JFrame {

	public static void main(String[] args) {

		new ActGraf();

	}

	public ActGraf() {

		super("Nominas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JFreeChart chart = crearGrafica();

		ChartPanel panel = new ChartPanel(chart);

		add(panel);

		pack();

		setVisible(true);

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

		JFreeChart chart = ChartFactory.createLineChart("Comparativa de conferencias en un año", "Mes", "Conferencias", dataset,
				PlotOrientation.VERTICAL, true, true, false);


		chart.getPlot().setBackgroundPaint(Color.BLUE);

		return chart;

	}

}
