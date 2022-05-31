package com.curso.java;

public class Cliente {
    private String nome;
    private int senha;
    private Double cpf;

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
