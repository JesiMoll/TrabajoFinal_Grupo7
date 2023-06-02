package Modelo;

public class Miembro {

    private int id_Miembro;

    private int DNI;
    
    private String apellido;

    private String nombre;

    private Boolean estado;

    
    public Miembro() {
    }

    
    public Miembro(int id_Miembro, int DNI, String apellido, String nombre, Boolean estado) {
        this.id_Miembro = id_Miembro;
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public Miembro(int DNI, String apellido, String nombre, Boolean estado) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estado = estado;
    }
    public int getId_Miembro() {
        return id_Miembro;
    }

    public void setId_Miembro(int id_Miembro) {
        this.id_Miembro = id_Miembro;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    /*Consultar información del equipo: Los usuarios podrán ver la lista de miembros del equipo y obtener información detallada
    de cada miembro, como su nombre y rol.*/
    
    public void consultarInformacion() {
        
    }

    @Override
    public String toString() {
        return "Miembro{" + "id_Miembro=" + id_Miembro + ", DNI=" + DNI + ", apellido=" + apellido + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}
