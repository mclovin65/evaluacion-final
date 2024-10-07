package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model.tarea;
public class tareaview extends JPanel {
    private ArrayList<tarea>listatareas;
    public tareaview(ArrayList<tarea>listatareas){
        this.listatareas=listatareas;
        initpanel();
    }

    public tareaview() {

    }

    private void initpanel(){
        setLayout(new BorderLayout());
   JLabel titulo=new JLabel("listado de tareas",SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);


        JPanel paneltareas= new JPanel();
        paneltareas.setLayout(new GridLayout(listatareas.size() + 1, 5));

        paneltareas.add(new JLabel("nombre",SwingConstants.CENTER));
        paneltareas.add(new JLabel("descripcion",SwingConstants.CENTER));
        paneltareas.add(new JLabel("fechalimite",SwingConstants.CENTER));
     paneltareas.add(new JLabel("estado",SwingConstants.CENTER));

     for (tarea tarea:listatareas){
         paneltareas.add(new JLabel(tarea.getTitulo(),SwingConstants.CENTER));
         paneltareas.add(new JLabel(tarea.getDescripcion(),SwingConstants.CENTER));
         paneltareas.add(new JLabel(tarea.getFechalimite()));
         paneltareas.add(new JLabel(tarea.getEstado(),SwingConstants.CENTER));
     }
add(paneltareas,BorderLayout.CENTER);
    }
}
