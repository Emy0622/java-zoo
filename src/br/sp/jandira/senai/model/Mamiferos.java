package br.sp.jandira.senai.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamiferos extends Animais{

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