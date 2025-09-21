package pagos.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagoServiceTest {
    @Test
    public void testProcesarPago() {
        assertEquals("Pago procesado", new pagos.src.PagoService().procesarPago());
    }
}
