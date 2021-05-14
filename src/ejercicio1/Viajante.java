package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viajante extends Empleado{
	
	private List<Gastos> GastosRealizados = new ArrayList<Gastos>();
	private List<Ventas> VentasRealizadas = new ArrayList<Ventas>();
	
	public void RealizoVenta(Ventas v, Gastos G) {
		VentasRealizadas.add(v);
		GastosRealizados.add(G);
	}
	
	@Override
	public Double CalcularSueldo() {
		double aux1=0.0;
		double aux2=0.0;
		double Gastos=0.0;
		for(int i=0; i<VentasRealizadas.size(); i++) {
			Gastos += GastosRealizados.get(i).getTotal_Gasto();
			if(VentasRealizadas.get(i).getVendioAgroquimico().get(i).isAgroquimico()) {
				aux1 += VentasRealizadas.get(i).getTotal_Venta();
			}
			if(VentasRealizadas.get(i).getVendioVeterinario().get(i).isVeterinario()) {
				aux2 += VentasRealizadas.get(i).getTotal_Venta();
			}
		}
		if(this.getFechaIngreso().getMonth().equals(LocalDate.now().getMonth())) {
			return (this.getSueldoACobrar()+aux1*0.15+aux2*0.25+Gastos)*1.50;
		}else return this.getSueldoACobrar()+aux1*0.15+aux2*0.25+Gastos;
	}

	public List<Gastos> getGastosRealizados() {
		return GastosRealizados;
	}

	public void setGastosRealizados(List<Gastos> gastosRealizados) {
		GastosRealizados = gastosRealizados;
	}

	public List<Ventas> getVentasRealizadas() {
		return VentasRealizadas;
	}

	public void setVentasRealizadas(List<Ventas> ventasRealizadas) {
		VentasRealizadas = ventasRealizadas;
	}
	
	
}
