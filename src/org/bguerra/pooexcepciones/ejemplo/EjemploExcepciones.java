package org.bguerra.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador");
        String denomiador = JOptionPane.showInputDialog("Ingrese un entero denomiador");
        //int divisor = Integer.parseInt(valor);
        //double division = cal.dividir(10, divisor);
        int divisor;
        double division;
        try {
            //divisor = Integer.parseInt(valor);
            //division = cal.dividir(10, divisor);
            //System.out.println("Divicion 1: " + division);

            double division2 = cal.dividir(numerador, denomiador);
            System.out.println("Divicion 2: " + division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepcion: por porfavor ingrese un valor numerico :" + nfe.getMessage());
            main(args);
        } catch (FormatoNumeroExcepcion e) {
            System.out.println("Se detecto una excepcion: ingrese un numero valido: " + e.getMessage());
            e.printStackTrace(System.out);
        } catch (DivicionPorZeroExcepcion ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepcion");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicacion");
    }
}