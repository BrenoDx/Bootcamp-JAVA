/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author breno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco bb = new Banco();
        Cliente cliente1 = new Cliente("Breno", 22);
        Cliente cliente2 = new Cliente("Alves", 20);
        Cliente cliente3 = new Cliente("Teste", 19);
        bb.adicionarCadastro(cliente1);
        bb.adicionarCadastro(cliente2);
        bb.adicionarCadastro(cliente3);
        
        
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);
        Conta cc2 = new ContaCorrente(cliente3);
        
        cc.depositar(100);
        
        cc.transferir(50, cp);
        
        System.out.println("Clientes do banco....");
        bb.listar();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
    
}
