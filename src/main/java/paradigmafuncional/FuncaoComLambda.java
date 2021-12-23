package paradigmafuncional;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhoraNaString = valor -> "Sra. " + valor;
        System.out.println(colocarPrefixoSenhoraNaString.gerar("Helena"));
    }
}
