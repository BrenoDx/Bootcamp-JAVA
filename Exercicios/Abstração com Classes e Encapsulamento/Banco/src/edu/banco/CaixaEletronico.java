/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banco;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto para capturar entrada de dados
        int opcao = 0;

        Conta conta = new Conta();
        System.out.println("Saldo inicial");
        conta.depositar(sc.nextDouble());

        //Do-While para executar menu do caixa
        do {
            System.out.println("----------Caixa Eletronico BBP-----------");
            System.out.println("1 - Consultar saldo.");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagamentos");
            System.out.println("6 - Status conta");
            System.out.println("7 - Sair");

            System.out.println("Selecione a opção(numero) desejada!");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo da conta: " + conta.getSaldo());
                    System.out.println("Cheque especial: " + conta.getChequeEspecial());
                    break;
                case 2:
                    System.out.println("Cheque especial: " + conta.getChequeEspecial());
                    break;
                case 3:
                    System.out.println("Informe o valor para deposito!");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        conta.depositar(deposito);
                    } else {
                        System.out.println("Valor do deposito precisa ser maior que 0");
                    }
                    break;
                case 4:
                    System.out.println("Informe o valor para sacar o dinheiro");
                    double saque = sc.nextDouble();
                    if (saque > 0) {
                        conta.sacar(saque);
                    } else {
                        System.out.println("Valor do saque precisa ser maior que 0");
                    }
                    break;
                case 5:
                    System.out.println("Informe o valor do boleto:");
                    double valor = sc.nextDouble();
                    if(valor > 0 )
                        conta.pagarBoleto(valor);
                        
                    else 
                        System.out.println("Valor do boleto precisa ser maior que 0");
                    break;

                case 6:
                    break;
                case 7:
                    System.out.println("Encerrando o atendimento via caixa eletronico, obrigado por usar");
                    break;
                default:
                    System.out.println("Selecione a opção correta!");
                    ;
            }
        } while (opcao != 7);
    }
}
