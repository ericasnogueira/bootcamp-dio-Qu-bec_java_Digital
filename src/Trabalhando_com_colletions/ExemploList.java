package Trabalhando_com_colletions;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
         //dada uma lista com 7 notas de aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], fa�a :

        System.out.println("Crie uma lista e adicione as sete notas : ");


        List<Double> notas = new ArrayList<>(); //lista criada

        //adicionando notas na lista
        notas.add(7d);//0 // adicionado a nota na lista // d � por conta do double // pode ser assim ou assim 7.0
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
        //exibindo a posi��o
        System.out.println("Exiba a posi��o da nota 5.0 ? " + notas.indexOf(5d));

        System.out.println("====================");
        System.out.println("Adicionando na lista a nota 8 na posi��o 4:");
        //posi��a, elemento
        notas.add(4,8d);
        System.out.println(notas);// mostrando as notas com o novo elemento e na posi��o que foi inserido
        System.out.println("===============");

        //substituindo um elemento pelo o outro
        System.out.println("Substitua a nota 5.0 pela nota 6.0 :");
        //posi��o que deseja substituir e o elemento que ira ficar na posi��o
        notas.set(notas.indexOf(5d),6.0); // pode usar o indexOf dessa forma quando n�o souber a posi��o no n�mero
        //mostrando a nova lista de notas com o numero substituido
        System.out.println(notas);
        System.out.println("=================");

        // verificando se um elemento se encontra na lista
        System.out.println("Confira se a nota 5.0 est� na lista : " + notas.contains(5d));// vai retorna um boolean

        System.out.println("=================");
        System.out.println("Exibindo todas as notas na ordem em que foram informados : ");// ele j� faz isso sozinho
        System.out.println(notas);
    }
}
