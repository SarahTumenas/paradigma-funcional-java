package interfacesfuncionais;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {

        Consumer <String> imprimirUmaFrase = System.out::println;//Method Reference: apenas utilizar o parâmetro da forma que ele foi recebido
        Consumer <String> imprimirUmaFrase2 = frase -> System.out.println(frase); //lambda
        imprimirUmaFrase.accept("Hello There");
        imprimirUmaFrase2.accept("General Kenobi");
    }
}
