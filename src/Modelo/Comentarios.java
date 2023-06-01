package Modelo;


import java.time.LocalDate;

public class Comentarios {

    private int id_Comentario;

    private String comentario;

    private LocalDate FechaAvance;

    private int id_Tarea;

    public Comentarios() {
    }

    public Comentarios(int id_Comentario, String comentario, LocalDate FechaAvance, int id_Tarea) {
        this.id_Comentario = id_Comentario;
        this.comentario = comentario;
        this.FechaAvance = FechaAvance;
        this.id_Tarea = id_Tarea;
    }

    public int getId_Comentario() {
        return id_Comentario;
    }

    public void setId_Comentario(int id_Comentario) {
        this.id_Comentario = id_Comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaAvance() {
        return FechaAvance;
    }

    public void setFechaAvance(LocalDate FechaAvance) {
        this.FechaAvance = FechaAvance;
    }

    public int getId_Tarea() {
        return id_Tarea;
    }

    public void setId_Tarea(int id_Tarea) {
        this.id_Tarea = id_Tarea;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "id_Comentario=" + id_Comentario + ", comentario=" + comentario + ", FechaAvance=" + FechaAvance + ", id_Tarea=" + id_Tarea + '}';
    }
    
}
