package com.diegocayo.t08;

import javax.swing.*;

public class Ejercicio06 {
    public static void main(String[] args) {

        double masaDouble;
        double estaturaDouble;
        do {
            String masa = JOptionPane.showInputDialog("Introduce tu masa en kg");
            String estatura = JOptionPane.showInputDialog("Introduce tu estatura en metros");

            masaDouble = Double.parseDouble(masa);
            estaturaDouble = Double.parseDouble(estatura);

        } while (masaDouble <=0 || (estaturaDouble<=0 || estaturaDouble>=3));
        double imc = calculoIMC(masaDouble, estaturaDouble);

        JFrame ventana = new JFrame("Calculadora IMC");
        ventana.setSize(600, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel etiqueta = new JLabel("IMC: " + imc + "  Categoría IMC: " + categoriaIMC(imc));
        etiqueta.setBounds(20,20,500,50);
        panel.add(etiqueta);
        ventana.setContentPane(panel);
        ventana.setVisible(true);

    }

    /**
     * Según el resultado del imc, el metodo devulve la categoría en la que se encuentra su imc
     *
     * @param imc IMC del usuario
     * @return    devulve la categoria
     * */
    public static String categoriaIMC(double imc) {
            if (imc < 16.00) {
                return clasificacion.DELGADEZ_SEVERA.toString();
            } else if (imc >= 16.00 && imc < 16.99) {
                return clasificacion.DELGADEZ_MODERADA.toString();
            } else if (imc >= 17.00 && imc < 18.49) {
                return clasificacion.DELGADEZ_LEVE.toString();
            } else if (imc >= 18.5 && imc < 24.99) {
                return clasificacion.NORMAL.toString();
            } else if (imc >= 25.00 && imc < 29.99) {
                return clasificacion.PREOBESIDAD.toString();
            } else if (imc >= 30.00 && imc < 34.99) {
                return clasificacion.OBESIDAD_LEVE.toString();
            } else if (imc >= 35.00 && imc < 39.99) {
                return clasificacion.OBESIDAD_MEDIA.toString();
            } else {
                return clasificacion.OBESIDAD_MORBIDA.toString();
            }
    }


    /**
     * Calcula el imc del usuario.
     *
     * @param masa      La masa introducida por el usuario.
     * @param estatura  La estatura introducida por el usuario.
     * @return devuleve el resultado de la operación.
     * */
    public static double calculoIMC (double masa, double estatura) {
        double resultado = masa / (estatura * estatura);
        return resultado;
    }

    public enum clasificacion{
        DELGADEZ_SEVERA{
            @Override
            public String toString() {
                return "delgadez severa";
            }
        }, DELGADEZ_MODERADA{
            @Override
            public String toString() {
                return "delgadez moderada";
            }
        }, DELGADEZ_LEVE{
            @Override
            public String toString() {
                return "delgadez leve";
            }
        }, NORMAL{
            @Override
            public String toString() {
                return "peso normal";
            }
        }, PREOBESIDAD{
            @Override
            public String toString() {
                return "preobesidad";
            }
        }, OBESIDAD_LEVE{
            @Override
            public String toString() {
                return "obesidad leve";
            }
        }, OBESIDAD_MEDIA{
            @Override
            public String toString() {
                return "obesidad media";
            }
        }, OBESIDAD_MORBIDA{
            @Override
            public String toString() {
                return "obesidad morbida";

            }
        }
    }
    

}
