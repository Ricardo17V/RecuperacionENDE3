package recuperacionende3;

public abstract class Vehiculo {

    private static final int PRECIO_BASE_MINIMO = 45;
    protected String modelo;
    protected double precioBase;
    protected boolean electrico;
    protected float tasaEmisiones;

    // Constructor completo
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
    public Vehiculo(String modelo) {
        this.modelo = modelo;
        this.precioBase = PRECIO_BASE_MINIMO;
        this.electrico = false;
        this.tasaEmisiones = 0;
    }
	
    
    public double calcularPrecioBruto(double importe, int numDias) {
    	double precioBruto;
    	precioBruto = precioBase + (importe/numDias);
		return precioBruto;
    	
    }
    
    public abstract double calcularPrecioNeto();
    
    // Getters
    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    
    public boolean isElectrico() {
        return electrico;
    }

    public float getTasaEmisiones() {
        return tasaEmisiones;
    }
    
    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setTasaEmisiones(float tasaEmisiones) {
        this.tasaEmisiones = tasaEmisiones;
    }
	
}