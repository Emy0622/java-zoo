package br.sp.jandira.senai.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animais {

    public String animal, nome, sexo;

    public int idade, RGA;

    Scanner scanner = new Scanner(System.in);

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setRGA(int RGA) {
        this.RGA = RGA;
    }

    public int getRGA() {
        return RGA;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}