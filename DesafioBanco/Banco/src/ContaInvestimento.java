public class ContaInvestimento extends Conta {
    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    public void investir(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Investimento", valor));
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
        super.imprimirInfosComuns();
    }
}