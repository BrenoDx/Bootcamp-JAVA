import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro parâmetro: ");
        numero1 = input.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        numero2 =input.nextInt();
        try{
            contar(numero1, numero2);
        
       }catch(ParametrosInvalidosException exception){
        System.out.println("O primeiro parâmetro não pode ser maior do que o segundo parâmetro");
       }
       input.close();


    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){
        int contagem = numero1 - numero2;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }else{
        throw new ParametrosInvalidosException();
    }
    }
}
