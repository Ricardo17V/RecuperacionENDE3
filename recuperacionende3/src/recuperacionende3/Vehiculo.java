package recuperacionende3;
/**
 * @author ricardo
 * @version 1.0
 */
public abstract class Vehiculo {
	/**
	 * constante que indica el precio mínimo que debe tener un vehiculo
	 */
    private static final int PRECIO_BASE_MINIMO = 45;
    /**
     * atributo que hace referencia al nombre del modelo del vehiculo
     */
    protected String modelo;
    /**
     * número decimal que nos indica el precio base sin aplicar los impuestos del vehiculo
     */
    protected double precioBase;
    /**
     * nos indica si dicho vehiculo es o no electrico
     */
    protected boolean electrico;
    /**
     * número decimal que indica la tasa de emisiones del vehiculo
     */
    protected float tasaEmisiones;

    // Constructor completo
    /**
     * Constructor completo de la clase Vehiculo, con los atributos de: modelo, precioBase, electrico, tasaEmisiones
     * @param modelo, atributo que hace referencia al nombre del modelo del vehiculo
     * @param precioBase, número decimal que nos indica el precio base sin aplicar los impuestos del vehiculo
     * @param electrico, nos indica si dicho vehiculo es o no electrico
     * @param tasaEmisiones, número decimal que indica la tasa de emisiones del vehiculo
     */
    public Vehiculo(String modelo, double precioBase, Boolean electrico, float tasaEmisiones) {
        if (precioBase < PRECIO_BASE_MINIMO) {
            throw new IllegalArgumentException("El precio base no puede ser inferior al mínimo permitido");
        }
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.electrico = electrico;
        this.tasaEmisiones = tasaEmisiones;
    }
	
    // Constructor simplificado
    /**
     * Constructor simplificado de la clase Vehiculo con solo el atributo de modelo
     * @param modelo, atributo que hace referencia al nombre del modelo del vehiculo
     */
    public Vehiculo(String modelo) {
        this.modelo = modelo;
        this.precioBase = PRECIO_BASE_MINIMO;
        this.electrico = false;
        this.tasaEmisiones = 0;
    }
	
    /**
     * Método que nos permite calcular el preccio bruto del vehiculo tras los impuestos
     * @param importe, es el importe de la fianza a pagar, no puede ser negativo
     * @param numDias, es el número de días en los que se distribuye dicha fianza, puede ser de entre 0 y 12, ambos incluidos
     * @return, nos devuelve el precioBruto tras aplicarle los impuestos correspondientes
     */
    public double calcularPrecioBruto(double importe, int numDias) {
    	/**
    	 * el precioBruto es el precio tras aplicarle los impuestos del Vehiculo
    	 */
    	double precioBruto;
    	if(importe<0) {
    		throw new IllegalArgumentException("El importe de la fianza no puede ser negativo");
    	}
    	if(numDias<=0 || numDias>=12) {
    		throw new IllegalArgumentException("El número de días debe estar entre 1 y 12 incluidos");
    	}
    	precioBruto = precioBase + (importe/numDias);
		return precioBruto;
    	
    }
    /**
     * Método abstracto que será desarrollado en sus clases hijas para calcular el precio neto del vehiculo
     * @return, devuelve el precio neto del vehiculo
     */
    public abstract double calcularPrecioNeto();
    
    // Getters
    /**
     * Método que nos permite obtener el modelo del vehiculo
     * @return, nos devuelve el nombre del modelo del vehiculo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Método que nos permite obtener el precio base del vehiculo
     * @return, nos devuelve el precio base del vehiculo
     */
    public double getPrecioBase() {
        return precioBase;
    }
    /**
     * Método que nos permite obtener si el vehiculo es o no electrico 
     * @return, nos devuelve si el coche es o no eléctrico
     */
    public boolean isElectrico() {
        return electrico;
    }
    /**
     * Método que nos permite obtener la tasa de emisiones del vehiculo
     * @return, nos devuelve dicha tasa de emisiones
     */
    public float getTasaEmisiones() {
        return tasaEmisiones;
    }
    
    // Setters
    /**
     * Método que nos permite cambiar el modelo del vehiculo
     * @param modelo, es el nombre del modelo del vehiculo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Método que nos permite cambiar el precio base sin impuestos del vehiculo
     * @param precioBase, es un número decimal que nos indica el precio base sin aplicar los impuestos del vehiculo
     */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    /**
     * Método que nos permite cambiar el estado del vehiculo si es o no electrico 
     * @param electrico, nos indica si dicho vehiculo es o no electrico
     */
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    /**
     * Método que nos permite cambiar la tasa de emisiones del vehiculo
     * @param tasaEmisiones, número decimal que indica la tasa de emisiones del vehiculo
     */
    public void setTasaEmisiones(float tasaEmisiones) {
        this.tasaEmisiones = tasaEmisiones;
    }

	public double calcularPrecioNeeto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}