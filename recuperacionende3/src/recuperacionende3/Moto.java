package recuperacionende3;

public class Moto extends Coche{

	public Moto(String modelo, double precioBase, Boolean electrico, float tasaEmisiones) {
		super(modelo, precioBase, electrico, tasaEmisiones);
		
	}
	@Override
	public double calcularPrecioNeto() {
		double precioNeto;
		if(electrico == true) {
			precioNeto = precioBase - (precioBase * 0.07);
		}
		else {
			precioNeto = precioBase - (precioBase*getTasaEmisiones());
		}
		return precioNeto;
		
	}

}
