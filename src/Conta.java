public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1000;
    protected static int SEQUENCIAL = 1;
    
    protected int numero;
    protected int agencia;
    protected double saldo;
    private Cliente cliente;

    
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.deposito(valor);
    }

    protected void imprimirInfComuns(){
        System.out.println("Titular --> "+ this.cliente.getNome());
        System.out.println("Agenci --> "+ this.agencia);
        System.out.println("Numero --> "+ this.numero);
        System.out.println(String.format("Saldo --> %.2f", this.saldo));
    }

}
