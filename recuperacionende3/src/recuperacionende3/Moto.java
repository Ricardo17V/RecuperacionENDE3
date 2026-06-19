package recuperacionende3;
/**
 * @author ricardo
 * @version 1.0
 */
public class Moto extends Coche{
	/**
	 * Constructor de la clase Moto con los atributos heredados de la clase padre: modelo, precioBase, electrico, tasaEmisiones
	 * @param modelo, se refiere al nombre del modelo de la moto
	 * @param precioBase, precio base que tiene inicialmente la moto sin impuestos
	 * @param electrico, dice si la moto es o no eléctrica
	 * @param tasaEmisiones, porcentaje entre 0 y 1, que hace referencia al porcentaje de tasa de emisiones de la moto
	 */
	public Moto(String modelo, double precioBase, Boolean electrico, float tasaEmisiones) {
		super(modelo, precioBase, electrico, tasaEmisiones);
		
	}
	@Override
	/**
	 * Método que nos permite calcular el precio neto de la moto con sus impuestos correspondientes
	 * @return, nos devuelve dicho precioNeto con los impuestos aplicados correctamente
	 */
	public double calcularPrecioNeto() {
		/**
		 * precioNeto, es el precio tras haberse aplicado los impuestos correspondientes
		 */
		double precioNeto;
		if(electrico == true) {
			precioNeto = precioBase - (precioBase * 0.07);
		}
		else {
			precioNeto = precioBase - (precioBase*getTasaEmisiones());
		}
		return precioNeto;
		
	}
	/**
	 * Método que nos permite calcular el precio bruto de la moto con sus impuestos correspondientes
	 * @param extraKm, es el valor extra por kilometraje que se le aplicará al precio, este no puede ser negativo
	 * @return, nos devuelve el precioBruto calculado tras aplicarle los impuestos correspondientes
	 */
	public double calcularPrecioBruto(double extraKm) {
		/**
		 * es el precio bruto que se nos devolverá con los impuestos aplicados
		 */
		double precioBruto;
		if(extraKm<0) {
			throw new IllegalArgumentException("El kilometraje no puede ser negativo");
		}
		precioBruto = precioBase + extraKm;
		return precioBruto;
		
	}
	/**
	 * Método que nos permite calcular el precio neto aplicando el valor del kilometraje extra
	 * @param extraKm, es el valor extra por kilometraje que se le aplicará al precio
	 * @return, nos devuelve dicho precioNeto con los impuestos aplicados correctamente
	 */
	public double calcularPrecioNeto(double extraKm) {
		/**
		 * precioNeto, es el precio tras haberse aplicado los impuestos correspondientes
		 */
		double precioNeto;
		precioNeto = 0;
		if(electrico == true) {
			precioNeto = precioBase + extraKm;
		}
		else {
			precioNeto = precioBase + extraKm - (precioBase * 0.07);
		}
		return precioNeto;
		
	}

}
