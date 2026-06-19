package recuperacionende3;

public class Coche extends Vehiculo{


	private float tasaEmisiones;
	
	public Coche(String modelo, double precioBase, Boolean electrico, float tasaEmisiones) {
		super(modelo, precioBase, electrico, tasaEmisiones);
		
	}

	@Override
	public double calcularPrecioNeto() {
		double precioNeto;
		precioNeto = precioBase - (precioBase*tasaEmisiones);
		return precioNeto;
	}

	//getters y setters
	public float getTasaEmisiones() {
		return tasaEmisiones;
	}

	public void setTasaEmisiones(float tasaEmisiones) {
		this.tasaEmisiones = tasaEmisiones;
	}

}
