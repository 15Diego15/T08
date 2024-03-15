package com.diegocayo.t08;

import javax.swing.*;
import java.awt.*;

public class Ejercicio04 {
    public static void main(String[] args) {

        Font font = new Font("Arial", Font.BOLD, 50 );




        JFrame ventana = new JFrame("Hola Swing");
        ventana.setSize(1024,768);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        String[] aficiones = {"música","futbol", "programacion", "informática", "música"};

        for (int i = 0; i < aficiones.length; i++) {
            Color color = new Color(80,25 + (i*10), 20);
            JButton boton = new JButton(aficiones[i]);
            boton.setFont(font);
            boton.setForeground(color);
            panel.add(boton);
        }

        ventana.setContentPane(panel);
        ventana.setVisible(true);

        panel.setLayout(null);





    }

}
