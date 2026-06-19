package recuperacionende3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import recuperacionende3.Moto;

public class MotoExcepcionesTest {
    @Test
    public void testKmNegativo() {
        Moto moto = new Moto("moto", 100000, true, 1);

        Exception exception = assertThrows(
            IllegalArgumentException.class,
            () -> moto.calcularPrecioBruto(-4000)
        );

        assertEquals("No se pueden ingresar cantidades negativas", exception.getMessage());
    }

}
