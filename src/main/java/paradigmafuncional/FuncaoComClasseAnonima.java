package paradigmafuncional;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao colocarPrefixoSernhorNaString = new Funcao (){

            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSernhorNaString.gerar("Lucas"));
    }
}
