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


    }
}
