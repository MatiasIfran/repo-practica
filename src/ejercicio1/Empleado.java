package ejercicio1;

import java.time.Instant;
import java.time.LocalDate;

public abstract class Empleado {

	protected Integer cuil;
	protected String nombre;
	protected String apellido;
	protected LocalDate fechaIngreso;
	protected Double SueldoACobrar;
	
	public abstract Double CalcularSueldo();
	
	
	public Integer getCuil() {
		return cuil;
	}
	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Double getSueldoACobrar() {
		return SueldoACobrar;
	}
	public void setSueldoACobrar(Double sueldoACobrar) {
		SueldoACobrar = sueldoACobrar;
	}
	
	
}
