package com.curso.java;

import java.util.Scanner;

public class NovaConta {
    public static Conta novaConta(){

        Scanner scan = new Scanner(System.in);

        Conta conta;
        Cliente cliente = new Cliente();
        System.out.println("Digite o nome do titular da conta a ser criada: ");
        cliente.setNome(scan.next());

        System.out.println("Que tipo de conta deseja criar" +
                "1 - Conta Corrente" +
                "2 - Conta Poupança" +
                "3 - Conta Corrente e Conta Poupança");
        int opc = scan.nextInt();

        if (opc == 1){
            conta = new ContaCorrente(cliente);
            System.out.println("Informe Uma senha de 4 digitos para sua conta : ");
            cliente.setSenha(scan.nextInt());
            System.out.println("Informe seu cpf (somente numeros) : ");
            cliente.setCpf(scan.nextDouble());

        }
        else{
            conta = new ContaPoupanca(cliente);
            System.out.println("Informe Uma senha de 4 digitos para sua conta : ");
            cliente.setSenha(scan.nextInt());
            System.out.println("Informe seu cpf (somente numeros) : ");
            cliente.setCpf(scan.nextDouble());
        }
        return conta;

    }

}
