package ar.edu.utn.frbb.tup.utils;

public enum TipoOperacion {
    DEPOSITO("Depósito"),
    RETIRO("Retiro"),
    TRANSFERENCIA("Transferencia");

    private final String descripcion;

    TipoOperacion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
