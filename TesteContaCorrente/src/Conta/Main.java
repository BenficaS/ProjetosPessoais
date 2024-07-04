package Conta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        Cliente cliente1 = new Cliente();

        ContaCorrente c2 = new ContaCorrente();
        Cliente cliente2 = new Cliente();

        c1.setSaldo(0.0);
        c2.setSaldo(0.0);

        c1.deposita(100.0);
        cliente1.nome = "GABRIEL";
        c1.numeroConta = 10;

        c2.deposita(200.0);
        cliente2.nome = "Diogo";
        c2.numeroConta = 15;

        c1.setCliente(cliente1);
        c2.setCliente(cliente2);

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);


        for (int i = 0; i < contas.size(); i++) {

            ContaCorrente cc = (ContaCorrente) contas.get(i);

            System.out.println("A conta de numero " + cc.numeroConta + " do cliente " + cc.getCliente().nome + " possui um saldo de " + cc.getSaldo());
        }
    }
}
