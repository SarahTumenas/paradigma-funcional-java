package interfacesfuncionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo subtracao = (a, b) -> a - b;
        Calculo divisao= (a, b) -> a * b;
        Calculo multiplicacao = (a, b) -> a / b;

        System.out.println( "soma: "+ executarOperacao(soma,10,5) +"\n"
                + "subtração: " + executarOperacao(subtracao, 10,5) +"\n"
                + "divisão: "+ executarOperacao(divisao, 10, 5)+"\n"
                + "multiplicação: " + executarOperacao(multiplicacao, 10,5));
    }

    public static int executarOperacao (Calculo calculo, int a , int b){
        return calculo.calcular(a,b);

    }

    @FunctionalInterface
    interface Calculo{
        public int calcular (int a, int b);
    }
}
