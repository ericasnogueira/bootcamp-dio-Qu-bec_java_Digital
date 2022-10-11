package estrutura_excepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //  Number valor = ouble.valueOf("a1.75");
        //System.out.println(valor);


        /*
        valor = NumberFormat.getInstance().parse("a1.75");
        System.out.println(valor);
         */

    }
}
