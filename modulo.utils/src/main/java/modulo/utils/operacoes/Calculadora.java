package modulo.utils.operacoes;

import modulo.utils.operacoes.internal.DivHelper;
import modulo.utils.operacoes.internal.MultHelper;
import modulo.utils.operacoes.internal.SubHelper;
import modulo.utils.operacoes.internal.SumHelper;


public class Calculadora {
    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;


    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();

    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub (int a, int b){
        return subHelper.execute(a,b);
    }

    public int mult (int a, int b){
        return  multHelper.execute(a, b);

    }

    public int div (int a, int b){
        return divHelper.execute(a, b);
    }
}
