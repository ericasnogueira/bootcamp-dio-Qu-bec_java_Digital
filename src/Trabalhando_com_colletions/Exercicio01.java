package Trabalhando_com_colletions;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        /*
        fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
         */
        List<Double> temperatura = new ArrayList<Double>();// criando lista

        //adicionando as temperaturas na lista
        int cont = 0;
        for (int i = 0; i <=5;i++){
            System.out.print("Digite a temperatura : ");
            double temp = entrada.nextDouble();
            //chamando a lista e adicionando as temperaturas nela
            temperatura.add(temp);
        }
        System.out.println("---------------------");
        //exibindo as temperaturas
        System.out.println(temperatura);



    }

}
