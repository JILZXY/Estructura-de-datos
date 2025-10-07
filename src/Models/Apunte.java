package Models;

import interfaces.Filtrable;

import java.util.Date;

public class Apunte extends AtributosPadre implements Filtrable {
    private Long idApunte;
    private String archivoUrl;
    private Date fechaModificacion;
    private int likes;

    public Long getIdApunte() {
        return idApunte;
    }

    public void setIdApunte(Long idApunte) {
        this.idApunte = idApunte;
    }

    public String getArchivoUrl() {
        return archivoUrl;
    }

    public void setArchivoUrl(String archivoUrl) {
        this.archivoUrl = archivoUrl;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Apunte(){}

    public Apunte(Long idApunte, String archivoUrl, Date fechaModificacion, int likes) {
        this.idApunte = idApunte;
        this.archivoUrl = archivoUrl;
        this.fechaModificacion = fechaModificacion;
        this.likes = likes;
    }

    public Apunte(String idUsuario, String nombre, String descripcion, String materia, String categoria, Boolean publico, Date fechaDeCreacion, Long idApunte, String archivoUrl, Date fechaModificacion, int likes) {
        super(idUsuario, nombre, descripcion, materia, categoria, publico, fechaDeCreacion);
        this.idApunte = idApunte;
        this.archivoUrl = archivoUrl;
        this.fechaModificacion = fechaModificacion;
        this.likes = likes;
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
        return likes;
    }

    @Override
    public Date getFechaCreacion() {
        return this.getFechaDeCreacion();
    }
}
