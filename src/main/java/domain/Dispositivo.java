package domain;

public class Dispositivo {

	private double kWPorHora;
	private boolean encendido;
	
	public Dispositivo(double unosKwPorHora, boolean esEncendido) {
		kWPorHora = unosKwPorHora;
		encendido = esEncendido;
	}

	public double getkWPorHora() {
		return kWPorHora;
	}

	public boolean isEncendido() {
		return encendido;
	}
	
}
