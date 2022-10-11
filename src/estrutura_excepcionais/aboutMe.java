package estrutura_excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {


        try { // bloco de c�digo conforme esperado


            Locale.setDefault(Locale.US);
            Scanner input = new Scanner(System.in);

            System.out.println("Digite seu nome :");
            String nome = input.next();
            System.out.println("Digite seu sobrenome :");
            String sobreNome = input.next();

            System.out.println("Digite sua idade : ");
            int idade = input.nextInt();

            System.out.println("Digite sua altura : ");
            double altura = input.nextDouble();

        /*
        Exce�oes que podem acontecer :
         = n�o informar o nome e sobrenome
         = o valor da idade ter um caractere N�O num�rico
         = o valor da altura ter uma v�rgula ou inv�s de ser um ponto(conforme padr�o americano)
         */

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobreNome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura � " + altura + " cm");

            input.close();

        } catch (InputMismatchException e ){// precisamos saber qual exce��o // bloco de c�digo captura  as exce��es que podem acontecer
            //em caso de fluxo n�o previsto
        System.out.println("Os campos idade e altura presisam ser n�mericos");
        }

    }

}
