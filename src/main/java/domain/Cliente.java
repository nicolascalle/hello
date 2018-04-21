package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombres;
	private String apellidos;
	private long numeroDocumento;
	private TipoDocumento tipoDocumento;
	private long telefono;
	private String domicilio;
	private LocalDate fechaAlta;
	private List<Dispositivo> dispositivos = new ArrayList<>();

	public Cliente(String nombres, String apellidos, long numeroDocumento,
			TipoDocumento tipoDocumento, long telefono, String domicilio,
			LocalDate fechaAlta, ArrayList<Dispositivo> dispositivos) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.telefono = telefono;
		this.domicilio = domicil;
		this.fechaAlta = fechaAlta;
		this.dispositivos = dispositivos;
	}

	public boolean tieneAlgunEncendido() {
		return dispositivos.stream().anyMatch(dispositivo -> dispositivo.isEncendido());
	}

	public long cantidadEncendidos() {
		return dispositivos.stream().filter(dispositivo -> dispositivo.isEncendido()).count();
	}

	public long cantidadApagados() {
		return dispositivos.stream().filter(dispositivo -> !dispositivo.isEncendido()).count();
	}

	public long cantidadDeDispositivos() {
		return cantidadEncendidos() + cantidadApagados();
	}

}
