package recuperacionende3;
/**
 * @author ricardo
 * @version 1.0
 */
public class Coche extends Vehiculo{

	/**
	 * es un porcentaje de entre 0 y 1, que indica el porcentaja de la tasa de emisión del coche
	 */
	private float tasaEmisiones;
	/**
	 * Constructor con los atributos de la clase padre Vehiculo: modelo, precioBase,electrico, y el atributo de tasaEmisiones
	 * @param modelo, hace referencia al nombre del modelo del coche
	 * @param precioBase, se refiere al precio base inicial sin aplicarle impuestos del coche
	 * @param electrico, se refiere a si el coche es o no electrico
	 * @param tasaEmisiones, es un porcentaje de entre 0 y 1, que indica el porcentaja de la tasa de emisión del coche
	 */
	public Coche(String modelo, double precioBase, Boolean electrico, float tasaEmisiones) {
		super(modelo, precioBase, electrico, tasaEmisiones);
		
	}

	@Override
	/**
	 * método que nos permite calcular el precio neto del vehículo aplicandole sus impuestos al precio
	 * @return, nos devuelve el precio neto tras aplicarle los impuestos
	 */
	public double calcularPrecioNeto() {
		/**
		 * precioNeto, es el precio del coche con los impuestos aplicados
		 */
		double precioNeto;
		precioNeto = precioBase - (precioBase*tasaEmisiones);
		return precioNeto;
	}

	//getters y setters
	/**
	 * Método que nos permite obtener la tasa de emisiones del coche
	 */
	public float getTasaEmisiones() {
		return tasaEmisiones;
	}
	/**
	 * método que nos permite cambiar la tasa de emisiones del coche
	 */
	public void setTasaEmisiones(float tasaEmisiones) {
		this.tasaEmisiones = tasaEmisiones;
	}

}
