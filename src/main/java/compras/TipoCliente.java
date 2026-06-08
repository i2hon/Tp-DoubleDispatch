package compras;

public interface TipoCliente {
    float impuesto(Producto producto);
    float envio(Producto producto);
    float envioFisico(ProductoFisico producto);
    float impuestoDigital(ServicioDigital producto);
}
