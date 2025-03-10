/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.banco;

/**
 *
 * @author breno
 */
public class Conta {

    private double saldo = 0, chequeEspecial, chequeEspecialUsado = 0, limite;


    public void depositar(double deposito) {
        if (deposito > 500) {
            chequeEspecial = deposito * 0.5;
            saldo += deposito;
            limite += chequeEspecial + saldo;
            taxaChequeEspecial();
        } else if (deposito <= 500) {
            chequeEspecial = 50;
            saldo += deposito;
            limite = chequeEspecial + saldo;
            taxaChequeEspecial();
        }
    }

    public void sacar(double saque) {
        if (saque <= saldo) {
            saldo -= saque;
        } else if (saque > saldo && saque <= limite) {
            chequeEspecialUsado = saque - saldo;
            saldo = 0;
            limite= saque - limite;
            chequeEspecial = limite;
            
            
            System.out.println("Está usando cheque especial para concluir essa transação");
        } else {
            System.out.println("Erro! sem saldo e limite especial para essa transação");
        }
    }

    public void pagarBoleto(double boleto) {
        if (boleto <= saldo) {
            saldo -= boleto;
            System.out.println("Boleto pago com sucesso");
        } else if (boleto > saldo && boleto <= limite) {
            chequeEspecialUsado = boleto - saldo;
            saldo = 0;
            limite = boleto - limite;
            chequeEspecial = limite;
            System.out.println("Está usando cheque especial para concluir essa transação");
            System.out.println("Boleto pago com sucesso");
        } else {
            System.out.println("Erro! sem saldo e limite especial para essa transação");
        }
    }

    private void taxaChequeEspecial() {
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.2;
            saldo -= taxa;
            chequeEspecialUsado = 0;
            System.out.println("Cheque especial regularizando com taxa de 20%");
        }
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getLimite() {
        return limite;
    }

}
