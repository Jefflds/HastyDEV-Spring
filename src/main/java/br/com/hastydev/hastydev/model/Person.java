package br.com.hastydev.hastydev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getId(){
        return id;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setId(int id){
        this.id = id;
    }
}
