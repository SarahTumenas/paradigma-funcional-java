package interfacesfuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String [] nomes = {"Sarah", "Tumenas", "Desenvolvedora", "Java"};
        Integer [] numeros = {1,2,3,4,5};
        //imprimirNomesFiltrados(nomes);
        //imprimirTodosNomes(nomes;
        //imprimirDobroDeCadaItemDaLista (numeros);

        List <String> profissoes = new ArrayList<>();
        profissoes.add("Engenheira de Software");
        profissoes.add("Gerente de projeto");
        profissoes.add("Especialista");

        profissoes.stream().filter(profissao ->profissao
                        .startsWith("Engenheira de Software"))
                        .forEach(System.out::println);

    }

    public static void imprimirNomesFiltrados (String... nomes){
        String nomesParaImprimir = " ";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Sarah")){
                nomesParaImprimir+=" "+nomes[i];
            }
        }
        System.out.println("Nomes do for: " + nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Sarah"))
                .collect(Collectors.joining());
        System.out.println("Nomes do stream: " + nomesParaImprimirDaStream);
        /*
        String nomesResultados = Stream.of(nomes).filter(nome -> nome.equals("Sarah"))
                .collect(Collectors.joining());
        System.out.println(nomesResultados);
         */

    }

    public static void imprimirTodosNomes (String... nomes){
        for(String nome:nomes){
            System.out.println("imprimindo pelo for: " + nome);
        }
        Stream.of(nomes).forEach(nome -> System.out.println("Imprimindo pelo forEach: " + nome));
    }

    public static void imprimirDobroDeCadaItemDaLista (Integer...numeros){
        for (Integer numero:numeros){
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero->numero*2).forEach(System.out::println);
    }
}
