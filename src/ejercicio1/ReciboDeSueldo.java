package ejercicio1;

import java.time.LocalDate;

public class ReciboDeSueldo {

	private Integer id_recibo;
	private Integer mesPertenece;
	private Double total_pago;
	private Empleado empleado;
	public Integer getId_recibo() {
		return id_recibo;
	}
	public void setId_recibo(Integer id_recibo) {
		this.id_recibo = id_recibo;
	}
	public Integer getMesPertenece() {
		return mesPertenece;
	}
	public void setMesPertenece(Integer mesPertenece) {
		this.mesPertenece = mesPertenece;
	}
	public Double getTotal_pago() {
		return total_pago;
	}
	public void setTotal_pago(Double total_pago) {
		this.total_pago = total_pago;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
}
