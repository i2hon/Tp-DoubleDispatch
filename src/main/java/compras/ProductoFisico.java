package compras;

public class ProductoFisico implements Producto {
    private float precio;
    private float iva;
    private String nombre;
    private float peso;

    public ProductoFisico(String nombre, float precio, int peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.iva = 0.21f;
    }

    @Override
    public float impuesto(TipoCliente cliente) {
        return precio * iva;
    }

    @Override
    public float enviarA(TipoCliente cliente) {
        return cliente.envioFisico(this);
    }

    @Override
    public float precio() {
        return precio;
    }

    public float peso() {
        return peso;
    }
}
