package com.diegocayo.t08;

import javax.swing.*;
import java.awt.image.Kernel;

public class Ejercicio02 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Hola Swing");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel etiqueta = new JLabel("Bienvenido al mundo de las interfaces gráficas");
        etiqueta.setBounds(50,50,500,500);
        panel.add(etiqueta);
        ventana.setContentPane(panel);
        ventana.setVisible(true);
    }

}
