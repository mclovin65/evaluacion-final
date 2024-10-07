package model;

public class tarea {
    private String titulo;
    private String descripcion;
    private  String fechalimite;
    private String estado;

    public tarea(String titulo,String descripcion, String fechalimite,String estado){
        this.descripcion=descripcion;
        this.estado=estado;
        this.fechalimite=fechalimite;
        this.titulo=titulo;
    }

    public  String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getFechalimite(){
        return fechalimite;
    }
    public void setFechalimite(String fechalimite){
        this.fechalimite=fechalimite;
    }
}
