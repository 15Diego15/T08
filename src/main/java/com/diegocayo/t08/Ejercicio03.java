package com.diegocayo.t08;

import javax.swing.*;
import java.awt.*;

public class Ejercicio03 {
    public static void main(String[] args) {




        JFrame ventana = new JFrame("Hola Swing");
        ventana.setSize(800,600);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel etiqueta = new JLabel("Bienvenido al mundo de las interfaces gráficas");
        etiqueta.setBounds(20,20,500,20);
        panel.add(etiqueta);
        ventana.setContentPane(panel);
        ventana.setVisible(true);



    }

}
