
package graficas2;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafico extends JFrame {

	private ArrayList<MedicionTemperatura> datos = new ArrayList<>();

	public Grafico(ArrayList<MedicionTemperatura> datos) {
		this.datos = datos;
	}

	public JPanel obtenerGrafica() {

		// Creamos el modelo para almacenar los datos que queremos representar.
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		// Añadimos los datos para la categoría "Temperatura media" y dos estaciones.

		for (MedicionTemperatura medicion : datos)
			dataset.setValue(medicion.getValor(), medicion.getEstacion(), medicion.getDia());

		JFreeChart chart = ChartFactory.createLineChart("Temperatura media diaria", "Día", "Temperatura", dataset,
				PlotOrientation.VERTICAL, true, true, false);

		// Fondo alrededor de la gráfica en blanco (ya lo está).
		// chart.setBackgroundPaint(Color.WHITE);

		// Fondo de la gráfica en blanco. También quita las líneas horizontales
		// punteadas.
		chart.getPlot().setBackgroundPaint(Color.WHITE);

		ChartPanel panel = new ChartPanel(chart);

		return (JPanel) panel;

	}

}