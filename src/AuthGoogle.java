public class AuthGoogle {
    String nombreProveedor = "Google";

    boolean validarToken(String tokenAcceso) {
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        return tokenAcceso.equals("Google123");
    }
}
