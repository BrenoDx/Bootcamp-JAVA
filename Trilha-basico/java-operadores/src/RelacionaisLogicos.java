public class RelacionaisLogicos {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior que numero2?" + simNao);

        //Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }else{
            System.out.println("As condições são falsas.");
        }

        if(condicao1 || condicao2){
            System.out.println("Umas das condições é verdadeira.");
        }
    }
}