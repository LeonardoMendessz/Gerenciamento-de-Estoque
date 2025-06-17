package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int id;

    //GETTERS

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getId(){
        return id;
    }

    //SETTERS

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setId(int id){
        this.id=id;
    }
    // CONSTRUTOR
    public Produto(int id,String nome,double preco){
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }
}
