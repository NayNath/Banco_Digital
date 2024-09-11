public class Main {
    public static void main(String[] args) {
    
        Cliente veve = new Cliente();
        veve.setNome("Veronica");
        Cliente ana = new Cliente();
        ana.setNome("Ana");

        ContaCorrente contaC = new ContaCorrente(veve);
        ContaPoupanca contaP = new ContaPoupanca(veve);
        ContaPoupanca contaR = new ContaPoupanca(ana);

        contaC.deposito(2300.00);
        contaC.imprimirExtrato();

        contaC.sacar(120.65);
        contaC.imprimirExtrato(); 


        contaP.deposito(5000.00);
        contaP.imprimirExtrato();

        contaP.transferencia(1000, contaR);
        contaP.imprimirExtrato();
        contaR.imprimirExtrato();
 }
}
