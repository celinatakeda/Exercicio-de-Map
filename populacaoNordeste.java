package com.kazue.collection.gft.collection.api.map;

import java.util.*;
import java.util.concurrent.Callable;

public class populacaoNordeste {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações:");
        Map<String, Integer>populacaoNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoNE);

        System.out.println("---------------------------------");
        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacaoNE.put("RN", 3534165);
        System.out.println(populacaoNE);

        System.out.println("---------------------------------");
        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                "PB - 4.039.277: ");
        populacaoNE.put("PB", 4039277);
        System.out.println(populacaoNE);

        System.out.println("---------------------------------");
        System.out.println("Exiba a população do estado PE: " + populacaoNE.get("PE"));

        System.out.println("---------------------------------");
        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String,Integer> populacaoOrdemInformada = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoOrdemInformada);

        System.out.println("---------------------------------");
        System.out.println("Exiba os estados e suas populações na ordem alfabética: ");
        Map<String, Integer>populacaoOrdemAlfabetica = new TreeMap<>(populacaoNE);
        System.out.println(populacaoOrdemAlfabetica);

        System.out.println("---------------------------------");
        System.out.println("Exiba o estado com menor população e sua quantidade: ");
        Map<String, Integer>populacaoNE1 = new TreeMap<>(populacaoNE);

        Collection<Integer> populacao1 = populacaoNE.values();
        String MenorPopulacao = "";

        for(Map.Entry<String, Integer> entry : populacaoNE.entrySet()){
            if (entry.getValue().equals(Collections.min(populacao1)))
                MenorPopulacao = entry.getKey();
        }
        System.out.println("Estado com menor população: " + MenorPopulacao + " \nQuantidade: "+ Collections.min(populacao1));

        System.out.println("---------------------------------");
        System.out.println("Exiba o estado com maior população e sua quantidade: ");
        Map<String, Integer>populacaoNE2 = new TreeMap<>(populacaoNE);

        Collection<Integer> populacao2 = populacaoNE.values();
        String MaiorPopulacao = "";

        for(Map.Entry<String, Integer> entry : populacaoNE.entrySet()){
            if (entry.getValue().equals(Collections.max(populacao2)))
                MaiorPopulacao = entry.getKey();
        }
        System.out.println("Estado com maior população: " + MaiorPopulacao + " \nQuantidade: "+ Collections.max(populacao2));

        System.out.println("---------------------------------");
        System.out.println("Exiba a soma da população desses estados: ");
        int soma = 0;
        Iterator<Integer> iterator = populacaoNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("A soma da população desses estados: " + soma);

        System.out.println("---------------------------------");
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma/populacaoNE.size()));

        System.out.println("---------------------------------");
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoNE.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(populacaoNE);

        System.out.println("---------------------------------");
        System.out.println("Apague o dicionario de estados: ");
        populacaoNE.clear();
        System.out.println(populacaoNE);

        System.out.println("---------------------------------");
        System.out.println("Confira se o dicionario está vazio: " + populacaoNE.isEmpty());

    }
}
