package notificaciones.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificacionServiceTest {
    @Test
    public void testEnviarNotificacion() {
        assertEquals("Notificación enviada", new notificaciones.src.NotificacionService().enviarNotificacion());
    }
}
