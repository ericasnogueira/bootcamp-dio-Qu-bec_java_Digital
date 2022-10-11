package estrutura_excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {


        try { // bloco de código conforme esperado


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
        Exceçoes que podem acontecer :
         = não informar o nome e sobrenome
         = o valor da idade ter um caractere NÃO numérico
         = o valor da altura ter uma vírgula ou invês de ser um ponto(conforme padrão americano)
         */

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobreNome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");

            input.close();

        } catch (InputMismatchException e ){// precisamos saber qual exceção // bloco de código captura  as exceções que podem acontecer
            //em caso de fluxo não previsto
        System.out.println("Os campos idade e altura presisam ser númericos");
        }

    }

}
