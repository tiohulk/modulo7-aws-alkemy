package usuarios.src;

public class UsuarioService {
    public String obtenerUsuario() {
        return "Usuario ejemplo";
    }

    public static void main(String[] args) {
        UsuarioService service = new UsuarioService();
        System.out.println(service.obtenerUsuario());
    }
}
