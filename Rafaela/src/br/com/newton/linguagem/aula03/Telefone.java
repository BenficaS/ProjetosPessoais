package br.com.newton.linguagem.aula03;

public class Telefone {

    Contato contato;
    public String cor;
    public String marca;

    public void tocar(String estiloMusical){
        if (estiloMusical == "pagode" )
        System.out.println("só tocamos pagode" );
        else
            System.out.println("o estilo musical não é pagode");
    }




    //public void ligar(Contato contato ){System.out.println("ligar" );}

    //public void ligar(Telefone tele){ System.out.println();
    //if (tele.cor == "preto")
    //System.out.println("ligar");


    //else
    //System.out.println("o telefone é invalido");

    //}
    public void ligar(Contato contato){
        if(contato.nome == "juliana")
            System.out.println("ligar para juliana");
        else
            System.out.println(" o contato não é a juliana");
    }




}

