package paradigmafuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args) {
        BiPredicate <Integer,Integer> verificarSeMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;
        //devem sempre retornar o mesmo valor, quantas vezes forem chamadas
        System.out.println(verificarSeMaior.test(13,12));
        System.out.println(verificarSeMaior.test(13,12));
        System.out.println(verificarSeMaior.test(12,13));
        System.out.println(verificarSeMaior.test(12,13));
    }
}
