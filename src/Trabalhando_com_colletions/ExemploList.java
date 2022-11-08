package Trabalhando_com_colletions;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
         //dada uma lista com 7 notas de aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça :

        System.out.println("Crie uma lista e adicione as sete notas : ");


        List<Double> notas = new ArrayList<>(); //lista criada

        //adicionando notas na lista
        notas.add(7d);//0 // adicionado a nota na lista // d é por conta do double // pode ser assim ou assim 7.0
        notas.add(8.5);//1
        notas.add(9.3);//2
        notas.add(5d);//3
        notas.add(7d);//4
        notas.add(0d);//5
        notas.add(3.6);//6

        //imprimindo a lista com as notas
        System.out.println(notas); // pode ser assim OU
        System.out.println(notas.toString());// asssim

        System.out.println("===================");
        //exibindo a posição
        System.out.println("Exiba a posição da nota 5.0 ? " + notas.indexOf(5d));

        System.out.println("====================");
        System.out.println("Adicionando na lista a nota 8 na posição 4:");
        //posiçõa, elemento
        notas.add(4,8d);
        System.out.println(notas);// mostrando as notas com o novo elemento e na posição que foi inserido
        System.out.println("===============");

        //substituindo um elemento pelo o outro
        System.out.println("Substitua a nota 5.0 pela nota 6.0 :");
        //posição que deseja substituir e o elemento que ira ficar na posição
        notas.set(notas.indexOf(5d),6.0); // pode usar o indexOf dessa forma quando não souber a posição no número
        //mostrando a nova lista de notas com o numero substituido
        System.out.println(notas);
        System.out.println("=================");

        // verificando se um elemento se encontra na lista
        System.out.println("Confira se a nota 5.0 está na lista : " + notas.contains(5d));// vai retorna um boolean

        System.out.println("=================");
        System.out.println("Exibindo todas as notas na ordem em que foram informados : ");// ele já faz isso sozinho
        System.out.println(notas);

        System.out.println("=============");
        //mostrando o numero com base na sua posição
        System.out.println("Exibindo a terceira nota adicionada : " + notas.get(2));
        System.out.println("================");

        //exibindo a menor nota
        System.out.println("Exibindo a menor nota : "+ Collections.min(notas));//usando o metodo de colletions // list faz parte de colletions
        System.out.println("===================");

        //exibindo a maior nota
        System.out.println("Exibindo a maior nota : "+ Collections.max(notas));
        System.out.println("==============================");

        //exibindo a soma das notas
        System.out.println("Exibindo a soma das notas");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibindo a soma : " + soma);

        System.out.println("===================");
        System.out.println("Exibindo a media das notas "+ (soma/ notas.size()));

        System.out.println("===============");
        System.out.println("Removendo a nota");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("==================");
        //removendo nota pela a posição novamente
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("====================");
        System.out.println("Removendo as notas menores que 7 e exibindo a nova lista");
        Iterator <Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas );
        System.out.println("=======================");

        System.out.println("Apagando toda a lista");
        notas.clear();
        System.out.println(notas);
        //conferindo se a lista esta vazia
        System.out.println("Conferindo se a lista esta vazia : " + notas.isEmpty());// é do tipo boolean
    }
}
