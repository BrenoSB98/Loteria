package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio {
    private static List<Integer> sorteio;
    private static Random gerador;

    private static List<Integer> sorteios(int quantidadeNumeros, int inicioRange, int fimRange) {
        sorteio = new ArrayList<>();
        gerador = new Random();
        while (sorteio.size() < quantidadeNumeros) {
            int aux = gerador.nextInt(inicioRange, fimRange);
            if (!sorteio.contains(aux)) {
                sorteio.add(aux);
            }
            sorteio.sort(null);
        }
        return sorteio;
    }

    public static List<Integer> lotomania() {
        return sorteios(50, 1, 101);
    }

    public static List<Integer> megaSena() {
        return sorteios(6, 1, 61);
    }

    public static List<Integer> quina() {
        return sorteios(5, 1, 81);
    }

    public static List<Integer> lotoFacil() {
        return sorteios(15, 1, 26);
    }
}