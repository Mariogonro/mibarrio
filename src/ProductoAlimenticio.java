public class ProductoAlimenticio extends Producto implements Vendible{
    private String fechaCaducidad;

    public ProductoAlimenticio(int id, String nombre, String descripcion, String categoria, String etiquetas, double precio, String urlFoto, String fechaCaducidad) {
        super(id, nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Producto:");
        System.out.println("Código: " + this.getId() + ", Nombre: " + this.getNombre() + ", Descripción: " + this.getDescripcion() + ", Categoría: " + this.getCategoria() + ", Etiquetas: " + this.getEtiquetas() + ", Precio: Q " + String.format("%.2f",this.getPrecio()) + ", UrlFoto: " + this.getUrlFoto() + ", Fecha Caducidad: " + this.fechaCaducidad);
    }

    @Override
    public void calcularPrecioVenta() {
        double precioVenta;
        precioVenta = (this.getPrecio() * 0.2) + this.getPrecio();
        System.out.println("Precio de Venta: Q. " + String.format("%.2f",precioVenta));
    }
}
