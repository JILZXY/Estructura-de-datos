package Models;

import java.util.Date;

public class AtributosPadre {
    private String idUsuario;
    private String nombre;
    private String descripcion;
    private String materia;
    private String categoria;
    private Boolean publico;
    private Date fechaDeCreacion;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String usuario) {
        this.idUsuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getPublico() {
        return publico;
    }

    public void setPublico(Boolean publico) {
        this.publico = publico;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public AtributosPadre(){}

    public AtributosPadre(String idUsuario, String nombre, String descripcion, String materia, String categoria, Boolean publico, Date fechaDeCreacion) {
        this.idUsuario =  idUsuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.materia = materia;
        this.categoria = categoria;
        this.publico = publico;
        this.fechaDeCreacion = fechaDeCreacion;
    }
}
