

public class Main {

    public static void main(String[] args) {
        Cliente Igor = new Cliente("Igor");


        Conta cc = new ContaCorrente(Igor);
        Conta poupanca = new ContaPoupanca(Igor);

        cc.depositar(1000);
        cc.transferir(120, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}