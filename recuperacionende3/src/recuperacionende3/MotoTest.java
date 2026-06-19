package recuperacionende3;

import org.junit.*;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

public class MotoTest {
	private static List<Moto> listaMotos; // lista compartida entre tests

	private String modelo;
	private double precioBase;
	private Boolean electrico;
	private float tasaEmisiones;
	private Moto moto;

	public MotoTest(String modelo, double precioBase, Boolean electrico, float tasaEmisiones, Moto moto) {
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.electrico = electrico;
		this.moto = moto;
		
	}

	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { { "moto", 100000, true, 0.2 }, { "moto gp", 120000, false, 0.9 }, { "moto gt", 20000, true, 0.33 }, { "moto suzuki", 30000, false, 0.4 },
				{ "moto ninja", 120000, false, 0.45 } });
	}

	@BeforeClass
	public static void iniciarlistaVehiculos() {
		listaMotos = new ArrayList<Moto>();
		System.out.println("Creando lista de motos para todos los tests");
	}

	@Before
	public void crearVehiculo() {
		Moto moto = new Moto("Test", precioBase, electrico, tasaEmisiones);
	}

	@AfterClass
	public void limpiarLista() {
		listaMotos = null;
		System.out.println("=== Lista de cuentas liberada despu�s de todos los tests ===");
	}

	@After
	public void limpiarVehiculo() {
		moto = null;
	}


	@Ignore("Test ignorado")
	public void testPrecio() {

	}
}
