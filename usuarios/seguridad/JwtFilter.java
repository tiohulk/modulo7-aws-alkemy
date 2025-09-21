package usuarios.src.seguridad;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

public class JwtFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String token = req.getHeader("Authorization");

        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7); // quitar "Bearer "
            try {
                JwtUtil.validateToken(token);
                chain.doFilter(request, response); // continuar si el token es válido
            } catch (Exception e) {
                throw new ServletException("Token inválido: " + e.getMessage());
            }
        } else {
            throw new ServletException("Token no proporcionado");
        }
    }
}
