package com.curso.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu(){


        Banco banco = new Banco();
        List<Conta> contas = new ArrayList<Conta>();
        banco.setNome("Banco DIO");
        int opc = -1;
        do{
            System.out.println(String.format("=========== %s ===========",banco.getNome()));
            System.out.println("""
                    Selecione qual operacao realizar:
                     1 - Criar Conta
                     2 - Acessar Conta
                     3 - Sair""");
            Scanner scan = new Scanner(System.in);
            opc = scan.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("****Criar nova conta****");
                    contas.add(NovaConta.novaConta());
                    for (int i = 0; i < contas.size();i++){
                        Conta extratoConta = contas.get(i);
                        extratoConta.extrato();
                    }
                    break;
                }
                case 2:{
                    System.out.println("Informe o numero da conta a ser acessada:");
                    int numeroConta = scan.nextInt();
                    Conta contaSelecionada = contas.get(numeroConta-1);
                    Operacao.realizarOperacoes(contaSelecionada);
                    break;

                }
            }

        }while(opc!=0);
    }
}
