//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AuthGoogle Google = new AuthGoogle();
    AuthGitHub GitHub = new AuthGitHub();
    AuthApple Apple = new AuthApple();

    if (Google.validarToken("Google123")) {
        System.out.println("Acceso permitido con Google");
    } else {
        System.out.println("Acceso rechazado con Google");
    }

    if (GitHub.validarToken("GitHub123")) {
        System.out.println("Acceso permitido con GitHub");
    } else {
        System.out.println("Acceso rechazado con GitHub");
    }

    if (Apple.validarToken("")) {
        System.out.println("Acceso permitido con Apple");
    } else {
        System.out.println("Acceso rechazado con Apple");
    }
}
