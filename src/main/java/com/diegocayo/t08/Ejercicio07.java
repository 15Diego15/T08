package com.diegocayo.t08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ejercicio07 {
    public static Random random = new Random();
    public static int puntuacionJugador = 0;
    public static int puntuacionCPU = 0;

    public static void main(String[] args) {
        int opcionPiedra = 1;
        int opcionPapel = 2;
        int opcionTijera = 3;

        JFrame ventana = new JFrame("Juego piedra, papel o tijera");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton piedra = new JButton("Piedra");
        panel.add(piedra);
        piedra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego(opcionPiedra);
            }
        });

        JButton papel = new JButton("Papel");
        panel.add(papel);
        papel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego(opcionPapel);
            }
        });

        JButton tijera = new JButton("Tijera");
        panel.add(tijera);
        tijera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juego(opcionTijera);
            }
        });

        ventana.add(panel);
        ventana.setVisible(true);
    }

    /**
     * Método que representa una partida del juego.
     * Contiene las diferentes situaciones durante la partida.
     *
     * @param opcionUsuario Opción seleccionada por el jugador.
     */
    public static void juego(int opcionUsuario) {
        int opcionCPU = random.nextInt(3 - 1) + 1;
        String resultado = "";

        switch (opcionCPU) {
            case 1:
                if (opcionUsuario == 1) {
                    resultado = "Empate";
                } else if (opcionUsuario == 2) {
                    resultado = "Ganaste";
                    puntuacionJugador++;
                } else {
                    resultado = "Perdiste";
                    puntuacionCPU++;
                }
                break;
            case 2:
                if (opcionUsuario == 1) {
                    resultado = "Perdiste";
                    puntuacionCPU++;
                } else if (opcionUsuario == 2) {
                    resultado = "Empate";
                } else {
                    resultado = "Ganaste";
                    puntuacionJugador++;
                }
                break;
            case 3:
                if (opcionUsuario == 1) {
                    resultado = "Ganaste";
                    puntuacionJugador++;
                } else if (opcionUsuario == 2) {
                    resultado = "Perdiste";
                    puntuacionCPU++;
                } else {
                    resultado = "Empate";
                }
                break;
        }

        mostrarResultado(opcionCPU, opcionUsuario, resultado);
        verificarFinJuego();
    }

    /**
     * Método que muestra el resultado de la partida y la puntuación actual.
     *
     * @param opcionCPU     Opción seleccionada por la CPU.
     * @param opcionUsuario Opción seleccionada por el jugador.
     * @param resultado     Resultado de la partida.
     */
    public static void mostrarResultado(int opcionCPU, int opcionUsuario, String resultado) {
        JOptionPane.showMessageDialog(null, "La CPU seleccionó: " + textoOpcion(opcionCPU) + "\n" +
                "Tú seleccionaste: " + textoOpcion(opcionUsuario) + "\n" +
                "Resultado: " + resultado + "\n" +
                "Puntuación Jugador: " + puntuacionJugador + "\n" +
                "Puntuación CPU: " + puntuacionCPU);
    }

    /**
     * Método que verifica si se ha alcanzado el fin del juego si uno de los jugadores ha llegado a 5 puntos.
     * En caso afirmativo, muestra el mensaje del ganador y reinicia la puntuación.
     */
    public static void verificarFinJuego() {
        if (puntuacionJugador == 5 || puntuacionCPU == 5) {
            if (puntuacionJugador == 5) {
                JOptionPane.showMessageDialog(null, "¡Has ganado el juego!");
            } else {
                JOptionPane.showMessageDialog(null, "¡Has perdido!");
            }
            puntuacionJugador = 0;
            puntuacionCPU = 0;
        }
    }

    /**
     * Método que traduce el número elegido en texto
     *
     * @param seleccion El número de selección, cada numero representa una opción del juego.
     * @return El texto de la opción seleccionada.
     */
    public static String textoOpcion(int seleccion) {
        switch (seleccion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
        }
        return null;
    }
}
