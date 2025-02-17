public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        Conta investimento = new ContaInvestimento(venilton);
        
        cc.depositar(500);
        cc.transferir(200, poupanca);
        investimento.depositar(1000);
        investimento.sacar(300);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        investimento.imprimirExtrato();
    }
}