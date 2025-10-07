package Models;

import interfaces.Filtrable;

import java.util.Date;

public class Carpeta extends AtributosPadre implements Filtrable {
    private Long idCarpeta;
    private Long idCarpetaPadre;
    private Date fechaModificacion;
    private String color;

    public Long getIdCarpeta() {
        return idCarpeta;
    }

    public void setIdCarpeta(Long idCarpeta) {
        this.idCarpeta = idCarpeta;
    }

    public Long getIdCarpetaPadre() {
        return idCarpetaPadre;
    }

    public void setIdCarpetaPadre(Long idCarpetaPadre) {
        this.idCarpetaPadre = idCarpetaPadre;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Carpeta(){}

    public Carpeta(Long idCarpeta, Long idCarpetaPadre, Date fechaModificacion, String color) {
        this.idCarpeta = idCarpeta;
        this.idCarpetaPadre = idCarpetaPadre;
        this.fechaModificacion = fechaModificacion;
        this.color = color;
    }

    public Carpeta(String idUsuario, String nombre, String descripcion, String materia, String categoria, Boolean publico, Date fechaDeCreacion, Long idCarpeta, Long idCarpetaPadre, Date fechaModificacion, String color) {
        super(idUsuario, nombre, descripcion, materia, categoria, publico, fechaDeCreacion);
        this.idCarpeta = idCarpeta;
        this.idCarpetaPadre = idCarpetaPadre;
        this.fechaModificacion = fechaModificacion;
        this.color = color;
    }

    @Override
    public String getMateria() {
        return super.getMateria();

    }

    @Override
    public String getCategoria() {
        return super.getCategoria();

    }

    @Override
    public int getLikes() {
        return 0;
    }

    @Override
    public Date getFechaCreacion() {
        return this.getFechaDeCreacion();
    }

}
