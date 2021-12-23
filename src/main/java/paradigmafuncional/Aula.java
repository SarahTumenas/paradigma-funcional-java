package paradigmafuncional;

import java.util.function.UnaryOperator;

public class Aula {


    public static void main(String[] args) {
        /*paradigma imperativo
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("O resultado é:: " + resultado);
        */

        //paradigma funcional
        UnaryOperator <Integer> calcularValorVezesTres = valor -> valor*3;
        int valor = 10;
        System.out.println("O resultado é:: " + calcularValorVezesTres.apply(10));
    }




}
