package Modelo;


import java.time.LocalDate;

public class EquipoMiembros {

    private int id_MiembroEq;

    private LocalDate fechaIncorporacion;

    private int id_Equipo;

    private int id_Miembro;

    public EquipoMiembros() {
    }

    public EquipoMiembros(int id_MiembroEq, LocalDate fechaIncorporacion, int id_Equipo, int id_Miembro) {
        this.id_MiembroEq = id_MiembroEq;
        this.fechaIncorporacion = fechaIncorporacion;
        this.id_Equipo = id_Equipo;
        this.id_Miembro = id_Miembro;
    }

    public EquipoMiembros(LocalDate fechaIncorporacion, int id_Equipo, int id_Miembro) {
        this.fechaIncorporacion = fechaIncorporacion;
        this.id_Equipo = id_Equipo;
        this.id_Miembro = id_Miembro;
    }
    

    public int getId_MiembroEq() {
        return id_MiembroEq;
    }

    public void setId_MiembroEq(int id_MiembroEq) {
        this.id_MiembroEq = id_MiembroEq;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int getId_Equipo() {
        return id_Equipo;
    }

    public void setId_Equipo(int id_Equipo) {
        this.id_Equipo = id_Equipo;
    }

    public int getId_Miembro() {
        return id_Miembro;
    }

    public void setId_Miembro(int id_Miembro) {
        this.id_Miembro = id_Miembro;
    }

    @Override
    public String toString() {
        return "EquipoMiembros{" + "id_MiembroEq=" + id_MiembroEq + ", fechaIncorporacion=" + fechaIncorporacion + ", id_Equipo=" + id_Equipo + ", id_Miembro=" + id_Miembro + '}';
    }
    
    
    
}
