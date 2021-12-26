package Exercicio;

import java.util.function.Function;

public class InferencialLambda {
    public static void main(String[] args) {
        Function<Integer,Double> divisaoPorDois = (var numero)-> Double.valueOf(numero/2);
        System.out.println(divisaoPorDois.apply(129875));
    }
}
