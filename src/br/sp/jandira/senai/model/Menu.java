package br.sp.jandira.senai.model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    Animais referenciaAnimal = new Animais();
    Mamiferos referenciaMamifero = new Mamiferos();
    Aves referenciaAve = new Aves();
    Repteis referenciaReptil = new Repteis();

    boolean continuar = true;
    int respostaMenu, repostaEspecie, repostaAlojamento;
    public void menu(){

        while (continuar) {

            boolean condicaoListaAnimal = referenciaAnimal.verificaListaAnimais();

//            if (condicaoListaAnimal){
//
//
//            }else {

            System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
            System.out.println("               Menu");
            System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
            System.out.println("[1- Cadastrar animal]");
            System.out.println("[2- Exibir animais]");
            System.out.println("[3- Alojamento]");
            System.out.println("[4- Sair]");
            System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
            respostaMenu = scanner.nextInt();
            scanner.nextLine();

            switch (respostaMenu) {

                case 1:

                    System.out.println("");
                    System.out.println("Que espécie você deseja cadastrar?");
                    System.out.println("[1- Mamífero]");
                    System.out.println("[2- Ave]");
                    System.out.println("[3- Réptil]");
                    repostaEspecie = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("");

                    switch (repostaEspecie) {

                        case 1:
                            Mamiferos novoMamifero = new Mamiferos();
                            novoMamifero.cadastrarAnimal();
                            referenciaAnimal.adicionarAnimal(novoMamifero);
                            break;

                        case 2:
                            Aves novaAve = new Aves();
                            novaAve.cadastrarAnimal();
                            referenciaAnimal.adicionarAnimal(novaAve);
                            break;

                        case 3:
                            Repteis novoReptil = new Repteis();
                            novoReptil.cadastrarAnimal();
                            referenciaAnimal.adicionarAnimal(novoReptil);
                            break;

                    }

                    break;

                case 2:
                    referenciaAnimal.exibirAnimais();
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Que alojamento você deseja exibir?");
                    System.out.println("[1- Mamífero]");
                    System.out.println("[2- Ave]");
                    System.out.println("[3- Réptil]");
                    repostaAlojamento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("");

                    switch (repostaAlojamento) {

                        case 1:
                            referenciaAnimal.exibirMamiferos();
                            break;

                        case 2:
                            referenciaAnimal.exibirAves();
                            break;

                        case 3:
                            referenciaAnimal.exibirRepteis();
                            break;

                    }
                    break;

                case 4:
                    continuar = false;
                    break;

//                }

            }

        }

    }

}
