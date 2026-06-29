public class contaScanner {
    double saldo = 500.0;
    double verificarSaldo(){
        return saldo;
    }
    void sacar(double valor ){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de r$" + valor + "realizado");
        }else{System.out.println("saldo inuficiente para saque de r$" + valor);}

    }
}
