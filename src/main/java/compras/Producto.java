package compras;

public interface Producto {
    float impuesto(TipoCliente cliente);
    float enviarA(TipoCliente cliente);
    float precio();
}