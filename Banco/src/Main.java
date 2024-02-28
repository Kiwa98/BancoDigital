import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Cliente gabriel = new Cliente();
    Cliente Igor = new Cliente();
    Cliente Calabreso = new Cliente();
    Calabreso.setNome("Calabreso");
    Igor.setNome("Igor");
    gabriel.setNome("Gabriel");
    gabriel.setCpf(1234213546);
    Conta cc = new ContaCorrente(gabriel);
    Conta cp = new ContaPoupanca(gabriel);

    cc.depositar(100);


    cc.imprimirExtrato();
        ArrayList<Cliente> MeusClientes = new ArrayList<>();
        MeusClientes.add(gabriel);
        MeusClientes.add(Calabreso);
        MeusClientes.add(Igor);


        for (Cliente cliente : MeusClientes){
            System.out.println(cliente.getNome());
        }
    }
}