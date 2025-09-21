package usuarios.src.seguridad;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtUtil {
    private static final String SECRET_KEY = "clave-secreta";

    public static Claims validateToken(String token) {
        return Jwts.parser()
                   .setSigningKey(SECRET_KEY)
                   .parseClaimsJws(token)
                   .getBody();
    }
}
