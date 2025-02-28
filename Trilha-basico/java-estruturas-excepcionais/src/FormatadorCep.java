public class FormatadorCep {
    public static void main(String[] args) {
       try {
        String cepFormatado = formatarCep("23796096");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        System.out.println("O cep não corresponde com as regras de negocio");
    }
    }
     //Exceções customizadas
    static String formatarCep(String cep)throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();
        return"23.796-064";
    }
}
