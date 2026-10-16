public class AuthApple {
    String nombreProveedor = "Apple";

    boolean validarToken(String tokenAcceso) {
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        return tokenAcceso.equals("Apple123");
    }
}
