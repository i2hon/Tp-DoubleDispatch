package compras;

public class Corporativo implements TipoCliente {

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
        float costo = producto.precio() * producto.peso();
        return costo - (costo * 0.5f);
    }

    @Override
    public float impuestoDigital(ServicioDigital producto) {
        return 0;
    }
}
