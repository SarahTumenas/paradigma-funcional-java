package paradigmafuncional;

public class AulaFuncional {
    public static void main(String[] args) {
        Funcao1 funcao1 = valor -> {
            return valor;
        };
        System.out.println(funcao1.gerar("Joao"));
    }
}


@FunctionalInterface //anotação não obrigatória
interface Funcao1 {
    String gerar(String valor);
}

