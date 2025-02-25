public class Operadores {
    public static void main(String[] args) throws Exception {
        //Unários
        int numero = 5;

        numero = -numero;
        System.out.println("Valor 1: " + numero);
        numero = numero * -1; //Transformar número positivo
        System.out.println("Valor 2: " + numero);

        //Incremento & Decremento
        numero++;
        System.out.println("Incremento " + numero);
        numero--;
        System.out.println("Decremento " + numero);

        //Ternário
        int a = 5;
        int b = 6;
        String resultado = a==b ? "Verdadeiro": "falso";

        System.out.println("Resultado é de: " + resultado);

        //Aritméticos
        int n1 = 5;
        int n2 = 2;
        int soma;

        soma = n1 + n2;
        soma = n1 / n2;
        soma = n1 * n2;
        soma = n1 - n2;

    }
}
