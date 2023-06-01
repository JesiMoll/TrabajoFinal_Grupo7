package Modelo;


import java.time.LocalDate;

public class Equipo {

    private int id_Proyecto;

    private int id_Equipo;

    private String nombre;

    private LocalDate FechaCreacion;

    private Boolean estado;

    public Equipo() {
    }

    public Equipo(int id_Proyecto, int id_Equipo, String nombre, LocalDate FechaCreacion, Boolean estado) {
        this.id_Proyecto = id_Proyecto;
        this.id_Equipo = id_Equipo;
        this.nombre = nombre;
        this.FechaCreacion = FechaCreacion;
        this.estado = estado;
    }

    public int getId_Proyecto() {
        return id_Proyecto;
    }

    public void setId_Proyecto(int id_Proyecto) {
        this.id_Proyecto = id_Proyecto;
    }

    public int getId_Equipo() {
        return id_Equipo;
    }

    public void setId_Equipo(int id_Equipo) {
        this.id_Equipo = id_Equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_Proyecto=" + id_Proyecto + ", id_Equipo=" + id_Equipo + ", nombre=" + nombre + ", FechaCreacion=" + FechaCreacion + ", estado=" + estado + '}';
    }
    
    
}
