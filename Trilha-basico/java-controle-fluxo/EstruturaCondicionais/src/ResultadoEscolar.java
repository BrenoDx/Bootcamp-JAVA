public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        int nota2 = 5;
        int nota3 = 8;

        //Condicional composta
        if(nota >= 6)
        System.out.println("Aluno 1 Aprovado");
        else
        System.out.println("Aluno 1 Reprovado");

        //Condicional encadeada
        if(nota2 >= 7)
        System.out.println("Aluno 2 Aprovado");
        else if(nota2 >= 5 && nota2 < 7)
        System.out.println("Aluno 2 Prova de recuperação");
        else
        System.out.println("Aluno 2 Reprovado");

        //Condição ternária
        String resultado = nota3 >= 7 ? "Aprovado" : nota3 >= 5 ? "Recuperação" : "Reprovado";
        System.out.println("Aluno 3: " + resultado);
        
    }
}
