package edu.breno.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        // Declaração variáveis
        String meuNome = "Breno";
        String segundoNome = "Alves";
        int ano = 2002;
        boolean simNao = true;

        String nomeCompleto = nomeCompleto(meuNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    //Método
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}