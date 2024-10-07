package services;

import java.util.ArrayList;
import java.util.List;
import model.tarea;
public class datatareas {
    private List<tarea>tareas;

    public datatareas(){
        tareas=new ArrayList<>();
        tareas.add(new tarea("ejercicio8","envia fotografia del ejercicio","10/9/24","no entregado"));
        tareas.add(new tarea("ejercicio9","envia fotografia del ejercicio","10/9/24"," entregado"));
        tareas.add(new tarea("ejercicio10","envia fotografia del ejercicio","10/9/24","no entregado"));
        tareas.add(new tarea("ejercicio11","envia fotografia del ejercicio","10/9/24"," entregado"));
        tareas.add(new tarea("ejercicio12","envia fotografia del ejercicio","10/9/24","no entregado"));

    }
public  List<tarea>getTareas() {
        return tareas;
}
}
