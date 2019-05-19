
package graficas2;

public class MedicionTemperatura {

	private double valor;
	private String estacion;
	private String dia;

	public MedicionTemperatura(double medida, String estacion, String dia) {
		this.valor = medida;
		this.estacion = estacion;
		this.dia = dia;
	}

	public double getValor() {
		return valor;
	}

	public String getEstacion() {
		return estacion;
	}

	public String getDia() {
		return dia;
	}

}