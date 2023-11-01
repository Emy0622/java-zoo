package br.sp.jandira.senai.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aves extends Animais{
    List<Aves> listaAves = new ArrayList<>();

    public Aves pesquisarAves(int RGA) {
        for (Aves aves : listaAves) {
            int validaRGA = aves.getRGA();
            if (validaRGA == RGA) {
                return aves;
            }
        }
        return null;
    }

    public void listarAves() {
        for (Aves aves: listaAves) {
            System.out.println(aves.getNome());
            System.out.println(aves.getRGA());
        }
    }

    public void adicionarAves(Aves aves) {
        listaAves.add(aves);
    }

    public void cadastrarAves() {

        System.out.println("/-/-/-/-/-/  Cadastro Aves  /-/-/-/-/-/");
        System.out.print("Informe o que animal está ave é: ");
        especie = scanner.nextLine();
        System.out.print("Informe o nome da ave: ");
        nome = scanner.nextLine();
        System.out.print("Informe o sexo da ave: ");
        sexo = scanner.nextLine();
        System.out.print("Informe a idade da ave: ");
        idade = scanner.nextInt();
        System.out.println("Informe o RGA da ave: ");
        RGA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("------  Cadastro Finalizado ------");

    }
}
