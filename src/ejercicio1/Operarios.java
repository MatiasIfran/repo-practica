package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operarios extends Empleado {

	private List<Viajante> AtenderViajante = new ArrayList<Viajante>();

	@Override
	public Double CalcularSueldo() {
		Double aux = 0.0;
		for(int i=0; i<AtenderViajante.size(); i++) {
			aux += AtenderViajante.get(i).getVentasRealizadas() //me gustaria hacerlo con stream pero no encuentro la forma
					.get(i).getTotal_Venta();
		}
		if(this.getFechaIngreso().getMonth().equals(LocalDate.now().getMonth())) {
			return (this.getSueldoACobrar()+aux*0.20)*1.50;
			
		}else return this.getSueldoACobrar()+aux*0.20;
	}

	public List<Viajante> getAtenderViajante() {
		return AtenderViajante;
	}

	public void setAtenderViajante(List<Viajante> atenderViajante) {
		AtenderViajante = atenderViajante;
	}
	
	
	
	
}
