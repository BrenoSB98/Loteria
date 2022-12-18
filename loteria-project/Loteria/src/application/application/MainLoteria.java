package application;

import model.entities.Sorteio;

public class MainLoteria {

    public static void main(String[] args) {
        for (Integer numero : Sorteio.lotomania()) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (Integer numero : Loterias.megaSena()) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (Integer numero : Loterias.lotoFacil()) {
            System.out.print(numero + " ");
        }
        System.out.println();
        for (Integer numero : Loterias.quina()) {
            System.out.print(numero + " ");
        }
    }
}