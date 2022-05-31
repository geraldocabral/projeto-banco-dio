package com.curso.java;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operacao {

    public static void realizarOperacoes(Conta conta){
        int opc = 0;
        do {
            conta.extrato();
            System.out.println("        QUAL OPERACAO REALIZAR:");
            System.out.println("1 - DEPOSITO");
            System.out.println("2 - SAQUE");
            System.out.println("3 - SAIR");
            Scanner scan = new Scanner(System.in);
            opc = scan.nextInt();

            switch (opc){
                case 1:{
                    System.out.println("Digite a quantia a ser depositada : ");
                    double valor = scan.nextDouble();
                    conta.depositar(valor);
                    conta.extrato();
                    break;
                }
                case 2:{
                    System.out.println("Digite a quantia a ser sacada : ");
                    double valor = scan.nextDouble();
                    conta.depositar(valor);
                    conta.extrato();
                    break;
                }
            }
        }while (opc != 3);
    }
}
