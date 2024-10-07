package view;
import model.tarea;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class tareasview extends JFrame {
    private  JTextField nombreField;
    private JTextField descripcionField;
    private JButton   btnbutton;
    private int[] pantalla = {1300, 800};
    private JPanel panelCentro; // Panel central para cambiar dinámicamente
    private ArrayList<tarea>tareas;

    public tareasview() {
        // Configuración básica del JFrame
        setTitle("Hospital Santa Catalina - Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        add(componentesMenuLateral(), BorderLayout.WEST);
        componentesMenuLateral().add(nuevatarea(),BorderLayout.NORTH);
        componentesMenuLateral().add(eliminartarea(),BorderLayout.SOUTH);

        panelCentro = new JPanel(new BorderLayout());
        add(panelCentro, BorderLayout.CENTER);


    }

    private JPanel componentesMenuLateral() {
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(1000, pantalla[1]));
        menu.setBackground(Color.black);
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        return menu;

    }

    private JPanel nuevatarea(){
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel nombreLabel = new JLabel("nombre");
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Negrita y más grande
        formPanel.add(nombreLabel, gbc);

        // Campo de texto de correo
        gbc.gridx = 1;
        nombreField = new JTextField(20);
        nombreField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // Borde gris
        formPanel.add(nombreField, gbc);

        JLabel descripcionLabel = new JLabel("descripcion:");
        descripcionLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Negrita y más grande
        formPanel.add(descripcionLabel, gbc);

        // Campo de texto de correo
        gbc.gridx = 1;
        nombreField = new JTextField(20);
        nombreField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // Borde gris
        formPanel.add(descripcionField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER; // Centrar el botón
        btnbutton = new JButton("Iniciar Sesión");
        btnbutton.setFont(new Font("Arial", Font.BOLD, 14));
        btnbutton.setForeground(Color.WHITE);
        btnbutton.setBackground(new Color(70, 130, 180)); // Azul claro
        btnbutton.setFocusPainted(false); // Elimina el borde del foco
        btnbutton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        formPanel.add(btnbutton, gbc);
        return formPanel;
    }
    private JPanel eliminartarea(){

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel nombreLabel = new JLabel("nombre");
        nombreLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Negrita y más grande
        formPanel.add(nombreLabel, gbc);

        // Campo de texto de correo
        gbc.gridx = 1;
        nombreField = new JTextField(20);
        nombreField.setBorder(BorderFactory.createLineBorder(Color.GRAY)); // Borde gris
        formPanel.add(nombreField, gbc);



        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER; // Centrar el botón
        btnbutton = new JButton("eliminar");
        btnbutton.setFont(new Font("Arial", Font.BOLD, 14));
        btnbutton.setForeground(Color.WHITE);
        btnbutton.setBackground(new Color(70, 130, 180)); // Azul claro
        btnbutton.setFocusPainted(false); // Elimina el borde del foco
        btnbutton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        formPanel.setBackground(Color.BLUE);
        formPanel.add(btnbutton, gbc);
        return formPanel;

    }
    public void listatareas(){
        JPanel list=new JPanel();
        list.setLayout(new GridLayout(0, 7, 10, 10));

        String[] columnas = {"Nombre", "descripcion","fechalimite","estado"};
        for (String columna : columnas) {
            JLabel label = new JLabel(columna);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(Color.DARK_GRAY);
            list.add(label);
        }
        for (tarea tarea:tareas) {
            list.add(new JLabel(tarea.getTitulo()));
            list.add(new JLabel(tarea.getDescripcion()));
            list.add(new JLabel(tarea.getFechalimite()));
            list.add(new JLabel(tarea.getEstado()));

        }


        panelCentro.removeAll();
        panelCentro.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Márgenes
        panelCentro.add(list, BorderLayout.CENTER);

        revalidate();
        repaint();
    }



}






