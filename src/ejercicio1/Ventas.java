package ejercicio1;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Ventas {

	private List<Agroquimico> VendioAgroquimico= new ArrayList<Agroquimico>();
	private List<Veterinario> VendioVeterinario= new ArrayList<Veterinario>();
	
	private Instant fechaVenta;
	private Double total_Venta;
	
	
	public Instant getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Instant fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Double getTotal_Venta() {
		return total_Venta;
	}
	public void setTotal_Venta(Double total_Venta) {
		this.total_Venta = total_Venta;
	}
	public List<Agroquimico> getVendioAgroquimico() {
		return VendioAgroquimico;
	}
	public void setVendioAgroquimico(List<Agroquimico> vendioAgroquimico) {
		VendioAgroquimico = vendioAgroquimico;
	}
	public List<Veterinario> getVendioVeterinario() {
		return VendioVeterinario;
	}
	public void setVendioVeterinario(List<Veterinario> vendioVeterinario) {
		VendioVeterinario = vendioVeterinario;
	}
	
	
	
	
}
