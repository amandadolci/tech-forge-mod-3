public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("131217", "Amanda D Figueiredo", 130000);
        cliente.depositar(500.00);
        System.out.println(cliente.getSaldoAtual());

        cliente.sacar(200.00);
        System.out.println(cliente.getSaldoAtual());

        cliente.sacar(2000.00);
    }
}
