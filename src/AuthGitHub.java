public class AuthGitHub {
    String nombreProveedor = "GitHub";

    boolean validarToken(String tokenAcceso) {
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        return tokenAcceso.equals("GitHub123");
    }
}
