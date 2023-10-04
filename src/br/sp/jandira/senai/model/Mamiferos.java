package br.sp.jandira.senai.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamiferos {

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

    List<Mamiferos> listaMamiferos = new ArrayList<>();

    public Mamiferos pesquisarMamifero(int RGA) {
        for (Mamiferos mamifero : listaMamiferos) {
            int validaRGA = mamifero.getRGA();
            if (validaRGA == RGA) {
                return mamifero;
            }
        }
        return null;
    }

    public void listarMamiferos() {
        for (Mamiferos mamifero : listaMamiferos) {
            System.out.println(mamifero.getNome());
            System.out.println(mamifero.getRGA());
        }
    }

    public void adicionarMamifero(Mamiferos mamifero) {
        listaMamiferos.add(mamifero);
    }

    public void cadastrarMamifero() {

        System.out.println("/-/-/-/-/-/  Cadastro Mamifero  /-/-/-/-/-/");
        System.out.print("Informe o que animal este mamífero é: ");
        animal = scanner.nextLine();
        System.out.print("Informe o nome do mamífero: : ");
        nome = scanner.nextLine();
        System.out.print("Informe o sexo do mamífero: : ");
        sexo = scanner.nextLine();
        System.out.print("Informe a idade do mamífero: ");
        idade = scanner.nextInt();
        System.out.println("Informe o RGA do mamífero: ");
        RGA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("/-/-/-/-/  Cadastro Finalizado /-/-/-/-/-/");

    }
}