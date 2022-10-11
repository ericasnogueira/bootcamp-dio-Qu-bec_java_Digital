package estrutura_excepcionais.ExcecoesCustomizadas;

public class FormatadoCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formataCep("2376506"); // aqui não tem 8 numeros
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("cep não corresponde com as regras de negocio");
            throw new RuntimeException(e);
        }
    }

    static String formataCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
            //simulando um cep formatado
            return "23.765-064" ;

    }
}
