package ui;

import br.com.newton.calculosalario.Funcionario;
import br.com.newton.calculosalario.Salario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Integer opcao = 0;
        Double salarioF = 0.0, porcent = 0.0;
        String nomeF;

        Scanner ler = new Scanner(System.in);

        Salario s1 = new Salario();


        Funcionario f1 = new Funcionario();


        System.out.println("Entre com o nome do funcionario:");
        nomeF = ler.nextLine();
        f1.setNome(nomeF);

        System.out.println("Entre com o salario do funcionario: ");
        salarioF = ler.nextDouble();
        s1.setSalario(salarioF);
        s1.calculo();
        System.out.printf("O Nome do funcionario é : " + f1.getNome() + " \nO salario do funcionario é " + s1.getSalario() + "\nA taxa cobrada é " + s1.getTaxa());
        System.out.println(" " + f1.getNome() + "," + s1.getValorTotal());
        System.out.println("Deseja adicionar uma porcentagem ao salario do funcionario?: 1-sim. 2-não.");
        opcao = ler.nextInt();
        if (opcao == 1) {
            System.out.println("Entre com a porcentagem.");
            porcent = ler.nextDouble();
            s1.setPorcentagem(porcent);
            s1.calculoPorcentagem();
        } else {
            System.out.println("Obrigado por utilizar nosso Sistema.");
        }

        System.out.printf("O novo salario com a adição de porcentagem é : " + s1.getValorTotal());
    }
}


