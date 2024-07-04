package br.newton.dominio;
import java.util.Scanner;
import br.newton.funcionario.Funcionario;

public class ui extends Funcionario{
    public static void main(String[] args)  {
        Funcionario f1 = new Funcionario();
        Scanner ler = new Scanner(System.in);


        f1.nomeFunc("jairo alves");
        System.out.println("O nome de funcionario: " + f1.nome);

        f1.salarioFunc(6000.0);
        System.out.printf("O salario bruto é : %.2f\n",f1.salario);

        f1.salarioImposto(1000.0);

        System.out.printf("A taixa é : %.2f\n ",f1.imposto);

        System.out.printf("O salario junto ao imposto é de : %.2f\n" ,f1.calculo);

        System.out.println("Qual a porcentagem a acrecentar ao salario do funcionario?");
        f1.porcentagem=ler.nextDouble();
        f1.salarioF();

        System.out.printf("O novo saldo do funcionario é : %.2f\n" ,f1.salario);




    }
}
