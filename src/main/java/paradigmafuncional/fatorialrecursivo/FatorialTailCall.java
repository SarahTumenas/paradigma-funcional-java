package paradigmafuncional.fatorialrecursivo;

public class FatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(7));
    }
    public static double fatorialA (double valor){
        return fatorialComTailCall (valor, 1);
    }
    public static double fatorialComTailCall (double valor, double number){
        if (valor == 0){
            return number;
        }
        return fatorialComTailCall(valor -1, number*valor);
    }
}
