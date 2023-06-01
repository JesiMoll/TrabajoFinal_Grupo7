package Modelo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private int id_Proyecto;

    private String nombre;

    private String descripcion;

    private LocalDate fechaInicio;
    
    private Boolean estado;
    
    private List<Tarea> tareas;

    public Proyecto() {
    }

    public Proyecto(int id_Proyecto, String nombre, String descripcion, LocalDate fechaInicio, Boolean estado) {
        this.id_Proyecto = id_Proyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.tareas = new ArrayList<>();
    }

    

    public int getId_Proyecto() {
        return id_Proyecto;
    }

    public void setId_Proyecto(int id_Proyecto) {
        this.id_Proyecto = id_Proyecto;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    //Los usuarios podrán crear nuevos proyectos : Crear proyecto.
    public void crearProyecto() {
    
    System.out.println("Id del Proyecto: " + id_Proyecto);    
    System.out.println("Proyecto creado: " + nombre);
    System.out.println("Descripción Proyecto: " + descripcion);
    System.out.println("Fecha de inicio: " + fechaInicio);
    
    if(estado){
      System.out.println("Proyecto Activo");  
    }else{
      System.out.println("Proyecto Inactivo"); 
    }
    
    Tarea tarea1 = new Tarea(1,"Crear una Base de Datos",LocalDate.now(),null,false,1);
    Tarea tarea2 = new Tarea(1,"Proyecto en Netbeans",LocalDate.now(),null,false,2);
    Tarea tarea3 = new Tarea(1,"Desarrollo de todas las clases principales del dominio (ABM)",LocalDate.now(),null,true,3);
    
    tareas.add(tarea1);
    tareas.add(tarea2);
    tareas.add(tarea3);
    
    this.estado= true;
    
    informeProyecto();
    } 
    
    private void informeProyecto() {
        System.out.println("\nDetalle Completo del Proyecto: " + id_Proyecto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Estado: " + (estado ? "Activo" : "Inactivo"));
        
        System.out.println("Tareas asignadas:");
        
        for(int i=0;i<tareas.size();i++){
        
        Tarea tarea = tareas.get(i);
        System.out.println("- " + tarea.getNombre());
        
      }
        
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id_Proyecto=" + id_Proyecto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", estado=" + estado + ", tareas=" + tareas + '}';
    }
    
    
}
        



