package compras;

public class ServicioDigital implements Producto {
    private float precio;
    private String nombre;
    private float iva;

    public ServicioDigital(String nombre, float precio, float iva) {
        this.precio = precio;
        this.nombre = nombre;
        this.iva = iva;
    }


    @Override
    public float impuesto(TipoCliente cliente) {
        return cliente.impuestoDigital(this);
    }

    @Override
    public float enviarA(TipoCliente cliente) {
        return 0;
    }

    @Override
    public float precio() {
        return precio;
    }
}
