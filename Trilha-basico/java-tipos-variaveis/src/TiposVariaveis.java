public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        double salarioMinimo = 2500;
        float salarioFloat = 2500f;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Constantes
        int numero = 5;
        numero = 10;
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.5; Valor não pode ser alterado!

        System.out.println("Variável número: " + numero);
        System.out.println("Constante: " + VALOR_DE_PI);

        //String e Char
        String meuNome = "Breno Alves";
        char genero = 'M';

        System.out.println("Nome: " + meuNome);
        System.out.println("Gênero: " + genero);
    }
}
