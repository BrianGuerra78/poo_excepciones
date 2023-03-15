package org.bguerra.pooexcepciones.ejemplo;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivicionPorZeroExcepcion {
        if (divisor == 0) {
            throw new DivicionPorZeroExcepcion("No de puede dividir por cero!");
        }
        return numerador / (double) divisor;
    }

    public double dividir(String numerador, String divisor) throws DivicionPorZeroExcepcion,
            FormatoNumeroExcepcion {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroExcepcion("Debe ingresar un numero en el nuerador y divisor");
        }

    }
}
