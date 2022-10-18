package Trabalhando_com_colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaçãoDeElementosEmUmColecaoList {
    public static void main(String[] args) {
        /*
        Dados as seguintes informações sobre gatos, crie uma lista
        e ordene esta lista exibindo:
        (nome - idade(meses) - cor);

        gato1 = nome: jon, idade: 18, cor : preto
        gato2 = nome: simba, idade: 6, cor : tigrado
        gato1 = nome: jon, idade: 12, cor : amarelo
         */

        //criando uma lista
        //<tipo>
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon", 18,"preto"));
            add(new Gato("simba", 6,"tigrado"));
            add(new Gato("jon", 12,"amarelo"));
        }};
        //mostrando a lista
        System.out.println(meusGatos);
        System.out.println("================");

        System.out.println("Ordem de inserção : ");
        System.out.println(meusGatos);
        System.out.println("=================");
        System.out.println();

        System.out.println("Mostrando na ordem aleatória");
        Collections.shuffle(meusGatos); // usa o colletions
        System.out.println(meusGatos);
        System.out.println("==================");
        System.out.println();


        //ira usar a interface do comparable
        System.out.println("Mostrando na ordem natural (nome) : ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println();

        //ordem de idade
        System.out.println("Ordem Idade");
        //dessas duas formas funcionam
        Collections.sort(meusGatos,new ComparatorIdade());
        //meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("===================");
        System.out.println();

        System.out.println("Ordem cor");
       // meusGatos.sort(new ComparatorCor());
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println();
        System.out.println("===================");

        System.out.println("Ordem nome/cor/idade");
        //Collections.sort(meusGatos,new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //da interface para fazer a comparação dos nomes
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

//classe
class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {
        return  g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements  Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) {
            return nome;
        }
        int cor= g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0 ){
            return cor;
        }
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}