package ui;

import br.com.newton.dominio.Conta;

public class main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.setSaldo(100.0);
        c2.setSaldo(1000.0);

        c2.transferir(c1,300.00);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
