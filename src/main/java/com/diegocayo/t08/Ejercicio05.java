package com.diegocayo.t08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ejercicio05 {
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom = random.nextInt(100 - 0)+ 0;
        System.out.println("numRandom = " + numRandom);

        JFrame ventana = new JFrame("Adivinar número");
        ventana.setSize(1024,768);


        JPanel panel = new JPanel();
        ventana.setContentPane(panel);


        JLabel intentos = new JLabel("Intentos restantes: "  );

        JLabel textoAdivinarNum = new JLabel("Adivina un número entre 1 y 100");
        JTextField texto = new JTextField(3);


        JButton botonConfirmar = new JButton("check");
        botonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(intentos);
        panel.add(textoAdivinarNum);
        panel.add(texto);
        panel.add(botonConfirmar);
        ventana.setVisible(true);


    }



}
