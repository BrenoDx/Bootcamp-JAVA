package escola;

/**
 *
 * @author breno
 */
public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Junior");
        felipe.setIdade(8);
        System.out.println("O Aluno "+ felipe.getNome() +  " tem " + felipe.getIdade() + " anos");
    }
}
