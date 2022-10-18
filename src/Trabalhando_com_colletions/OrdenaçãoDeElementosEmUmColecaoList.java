package Trabalhando_com_colletions;

import java.util.ArrayList;
import java.util.Collections;
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
