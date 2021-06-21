package com.kazue.collection.gft.collection.api.map;

import java.util.*;

public class lancamentoDados {
    public static void main(String[] args) {
        int qtdlancamentos=100;

        List<Integer> valores = new ArrayList<>();
        Random lancamento = new Random();
        for (int i= 0; i<qtdlancamentos; i++) {
            int numero = lancamento.nextInt(6)+1;
            valores.add(numero);
        }
        Map<Integer, Integer> numerosLancados = new HashMap<>();
        for (Integer resultado : valores) {
           if (numerosLancados.containsKey(resultado))
               numerosLancados.put(resultado, numerosLancados.get(resultado));
           else numerosLancados.put(resultado, 1);
        }

        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : numerosLancados.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }

    }
}
