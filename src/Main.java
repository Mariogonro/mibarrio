public class Main {
    public static void main(String[] args) {
        ProductoAlimenticio Product = new ProductoAlimenticio(1, "Pan", "Pan dulce", "Arinas", "Pan,Arina,Dulce", 2, "http://pan.com", "22/03/2024");
        Product.mostrarDetalle();
        Product.calcularPrecioVenta();

        ProductoElectronico Producto = new ProductoElectronico(2, "Refrigerador", "Refrigerador 11'", "Linea Blanca", "Linea Blanca, Congelador, Refrigerador", 2000, "http://refri.com", 6);
        Producto.mostrarDetalle();
        Producto.calcularPrecioVenta();


    }
}