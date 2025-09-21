package usuarios.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioServiceTest {
    @Test
    public void testObtenerUsuario() {
        assertEquals("Usuario ejemplo", new usuarios.src.UsuarioService().obtenerUsuario());
    }
}
