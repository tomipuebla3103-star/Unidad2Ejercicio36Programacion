public abstract class ProveedorIdentidad {
    String nombreProveedor;

    public ProveedorIdentidad(String nnombreProveedor){
        this.nombreProveedor=nnombreProveedor;
    }

    boolean validarToken(String tokenAcceso){
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }

        return true;
    }
}
