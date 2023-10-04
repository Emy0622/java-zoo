package br.sp.jandira.senai.model;

import java.util.Scanner;

public class Menu {

    Mamiferos referenciaMamifero = new Mamiferos();
    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean continuar = true;

        while (continuar) {
            System.out.println("//-------  Menu  --------//");
            System.out.println("1 - Cadastrar Ave ");
            System.out.println("2 - Cadastrar Mamífero ");
            System.out.println("3 - Cadastrar Réptil");
            System.out.println("4 - Consultar Animais");
            System.out.println("5 - Sair");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int option = scanner.nextInt();

            switch (option) {

                case 1:

                    break;

                case 2:
                    Mamiferos mamifero = new Mamiferos();
                    mamifero.cadastrarMamifero();
                    referenciaMamifero.adicionarMamifero(mamifero);
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    continuar = false;
                    break;
            }
        }
    }
}
