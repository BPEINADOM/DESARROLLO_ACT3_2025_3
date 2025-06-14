package co.edu.udec.taskmgr.domain.entidades;

public class Producto {
    private int producto_id;
    private String codigo;
    private String descripcion;

    public Producto(int producto_id, String codigo, String descripcion) {
        this.producto_id = producto_id;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getProducto_id() { return producto_id; }
    public void setProducto_id(int producto_id) { this.producto_id = producto_id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
