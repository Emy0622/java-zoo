package br.sp.jandira.senai.model;

import java.util.ArrayList;
import java.util.List;

public class Repteis extends Animais{
    List<Aves> listaRepteis = new ArrayList<>();

    public Aves pesquisarRepteis(int RGA) {
        for (Aves repteis : listaRepteis) {
            int validaRGA = repteis.getRGA();
            if (validaRGA == RGA) {
                return repteis;
            }
        }
        return null;
    }

    public void listarRepteis() {
        for (Aves repteis: listaRepteis) {
            System.out.println(repteis.getNome());
            System.out.println(repteis.getRGA());
        }
    }

    public void adicionarAves(Aves aves) {
        listaRepteis.add(aves);
    }

    public void cadastrarAves() {

        System.out.println("/-/-/-/-/-/  Cadastro Rpteis /-/-/-/-/-/");
        System.out.print("Informe o que animal está ave é: ");
        especie = scanner.nextLine();
        System.out.print("Informe o nome da repteis: ");
        nome = scanner.nextLine();
        System.out.print("Informe o sexo da repteis: ");
        sexo = scanner.nextLine();
        System.out.print("Informe a idade da repteis: ");
        idade = scanner.nextInt();
        System.out.println("Informe o RGA da repteis: ");
        RGA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("------  Cadastro Finalizado ------");

    }
}
