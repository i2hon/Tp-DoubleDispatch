package compras;

public class Regular implements TipoCliente {

    @Override
    public float impuesto(Producto producto) {
        return producto.impuesto(this);
    }

    @Override
    public float envio(Producto producto) {
        return producto.enviarA(this);
    }

    @Override
    public float envioFisico(ProductoFisico producto) {
        return producto.precio() * producto.peso();
    }

    @Override
    public float impuestoDigital(ServicioDigital producto) {
        return producto.precio() * 0.10f;
    }
}