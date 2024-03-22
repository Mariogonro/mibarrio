public class ProductoElectronico extends Producto implements Vendible{
    private int garantiaMeses;

    public ProductoElectronico(int id, String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto, int garantiaMeses) {
        super(id, nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Producto:");
        System.out.println("Código: " + this.getId() + ", Nombre: " + this.getNombre() + ", Descripción: " + this.getDescripcion() + ", Categoría: " + this.getCategoria() + ", Etiquetas: " + this.getEtiquetas() + ", Precio: Q " + String.format("%.2f",this.getPrecio()) + ", UrlFoto: " + this.getUrlFoto() + ", Meses Garantía: " + this.garantiaMeses);
    }

    @Override
    public void calcularPrecioVenta() {
        double precioVenta;
        precioVenta = (this.getPrecio() * 0.25) + this.getPrecio();
        System.out.println("Precio de Venta: Q. " + String.format("%.2f",precioVenta));
    }
}
