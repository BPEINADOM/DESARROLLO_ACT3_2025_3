package co.edu.udec.taskmgr.domain.entidades;
import java.util.Date;

public class Empleado {
    private int empleado_id;
    private String tipo_documento;
    private String numero_documento;
    private String nombres;
    private String apellidos;
    private Date fecha_nacimiento;
    private String genero;
    private String correo;
    private String direccion;
    private String numero_telefono;

    public Empleado(int empleado_id, String tipo_documento, String numero_documento, String nombres, String apellidos) {
        
        this.empleado_id = empleado_id;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Empleado(Date fecha_nacimiento, String genero, String correo, String direccion, String numero_telefono) {
        
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.correo = correo;
        this.direccion = direccion;
        this.numero_telefono = numero_telefono;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }




}