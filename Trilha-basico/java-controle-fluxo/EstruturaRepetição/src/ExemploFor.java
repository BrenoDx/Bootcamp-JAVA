public class ExemploFor {
    public static void main(String[] args) throws Exception {
        for(int i = 1; i <= 3; i++){
            System.out.printf("%d Carneirinho\n", i);
        }

        //For em Arrays
        String alunos[] = {"BRENO", "JONAS", "JULIA", "RAFAEL"};
        for(int i=0; i<alunos.length; i++){
            System.out.println("O aluno no indice i= " + i + " é " + alunos[i]);
        }

        //For Each
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

        //BreakContinue
        for(int i = 1; i <= 5; i++){
            if(i==3)
            //continue;
           // break;

            System.out.println(i);
        }
    }
}
