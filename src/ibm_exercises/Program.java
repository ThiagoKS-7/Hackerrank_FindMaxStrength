package ibm_exercises;

import java.io.*;
import java.util.*;

class Program {

    static int getFactorial(int n) {
        int i = n - 1;
        while (i > 1) {
            n *= i;
            i--;
        }
        System.out.println("FACTORIAL " + n);
        return n;
    }

    static List<Integer> mountTeam(int initialValue) {
        ArrayList<Integer> team = new ArrayList<Integer>(Arrays.asList(initialValue));
        for (int i = 0; i <= 4; i++) {
            team.add(getFactorial(team.get(i)));
            System.out.println(team);

        }
        return team;
    }

    /*
     * Dado um numero inicial, calcular "times" com base na seguinte regra
     * Lider é o maior número do time
     * cada membro de um time so pode chamar integrantes que sejam iguais a soma de
     * suas fatoriais
     * Objetivo - Calcular força de um time, usando a formula -> lider * numero de
     * integrantes
     */

    public static void main(String[] args) throws IOException {
        System.out.println(mountTeam(5));
    }
}