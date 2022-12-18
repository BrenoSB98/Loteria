package application;

import entities.Sorteio;

public class MainLoteria {

    public static void main(String[] args) {
        for (Integer numero : Sorteio.lotomania()) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (Integer numero : Sorteio.megaSena()) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (Integer numero : Sorteio.lotoFacil()) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (Integer numero : Sorteio.quina()) {
            System.out.print(numero + " ");
        }
    }
}