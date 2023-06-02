package Modelo;


import java.time.LocalDate;

public class Tarea {

    private int id_Tarea;

    private String nombre;

    private LocalDate FechaCreacion;

    private LocalDate FechaCierre;

    private boolean estado;// 1.la tarea esta finalizada. 0.progreso.
    private int id_MiembroEq;
    
    private int id_Proyecto;

    public Tarea() {
    }
    //El constructor con Id, lo uso para modificar.
    public Tarea(int id_Tarea, String nombre, LocalDate FechaCreacion, LocalDate FechaCierre, boolean estado, int id_MiembroEq,int id_Proyecto) {
        this.id_Tarea = id_Tarea;
        this.nombre = nombre;
        this.FechaCreacion = FechaCreacion;
        this.FechaCierre = FechaCierre;
        this.estado = estado;
        this.id_MiembroEq = id_MiembroEq;
        this.id_Proyecto = id_Proyecto;
    }
    //El constructor sin Id, lo uso, por ej. para crear o guardar una tarea.
    public Tarea(String nombre, LocalDate FechaCreacion, LocalDate FechaCierre, boolean estado, int id_MiembroEq, int id_Proyecto) {
        this.nombre = nombre;
        this.FechaCreacion = FechaCreacion;
        this.FechaCierre = FechaCierre;
        this.estado = estado;
        this.id_MiembroEq = id_MiembroEq;
        this.id_Proyecto = id_Proyecto;
    }
    
   
    
    public int getId_Tarea() {
        return id_Tarea;
    }

    public void setId_Tarea(int id_Tarea) {
        this.id_Tarea = id_Tarea;
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

    public LocalDate getFechaCierre() {
        return FechaCierre;
    }

    public void setFechaCierre(LocalDate FechaCierre) {
        this.FechaCierre = FechaCierre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_MiembroEq() {
        return id_MiembroEq;
    }

    public void setId_MiembroEq(int id_MiembroEq) {
        this.id_MiembroEq = id_MiembroEq;
    }

    public int getId_Proyecto() {
        return id_Proyecto;
    }

    public void setId_Proyecto(int id_Proyecto) {
        this.id_Proyecto = id_Proyecto;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id_Tarea=" + id_Tarea + ", nombre=" + nombre + ", FechaCreacion=" + FechaCreacion + ", FechaCierre=" + FechaCierre + ", estado=" + estado + ", id_MiembroEq=" + id_MiembroEq + ", id_Proyecto=" + id_Proyecto + '}';
    }
    
    

    

    
    
    
}

