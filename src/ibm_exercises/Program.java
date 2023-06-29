package ibm_exercises;

import java.io.*;

class Program {

    /*
     * Dado um numero inicial, calcular "times" com base na seguinte regra
     * Lider é o maior número do time
     * cada membro de um time so pode chamar integrantes que sejam iguais a soma de
     * suas fatoriais
     * Objetivo - Calcular força de um time, usando a formula -> lider * numero de
     * integrantes
     */

    public static void main(String[] args) throws IOException {
        System.out.println("MAX STRENGTH - " + MaxStrength.getMaxStrength(5));
    }
}