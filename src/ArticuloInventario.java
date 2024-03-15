public class ArticuloInventario {
    private String codigo;
    private String nombre;
    private String descripcion;
    private String categoria;
    private String etiquetas;
    private double precio;
    private String urlFoto;

    public  ArticuloInventario(String codigo, String nombre, String descripcion,String categoria,String etiquetas, double precio,String urlFoto){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
        this.precio = precio;
        this.urlFoto = urlFoto;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEtiquetas() {
        return etiquetas;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getPrecio() {
        return precio;
    }
    public String getUrlFoto() {
        return urlFoto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    public void mostrarDetalle(){
        System.out.println("Código: " + this.codigo + " Nombre: " + this.nombre + " Descripción: " + this.descripcion + " Categoría: " + this.categoria + " Etiquetas: " + this.etiquetas + " Precio: Q " + String.format("%.2f",precio) + " UrlFoto: " + urlFoto);
    }
}
