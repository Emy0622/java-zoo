package br.sp.jandira.senai.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Animais {

        Scanner scanner = new Scanner(System.in);

        String nome, dieta, especie, sexo;

        int idade, habitat, RGA;

        double peso;

        private LocalDateTime date;

        List<Animais> listaAnimais = new ArrayList<>();

        public void cadastrarAnimal() {


            System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
            System.out.println("         Cadastrar Animais");
            System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
            System.out.print("Informe o nome do animais: ");
            this.nome = scanner.nextLine();
            System.out.print("Informe o sexo do animais: ");
            this.sexo = scanner.nextLine();
            System.out.print("Informe a dieta do animais: ");
            this.dieta = scanner.nextLine();
            System.out.print("Informe a idade do animais: ");
            this.idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Informe o peso do animais: ");
            this.peso = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
            System.out.println("");


            this.setDate(LocalDateTime.now());
            System.out.println(getDate());

        }

        public void adicionarAnimais(Animais animais) {
            listaAnimais.add(animais);
        }

        public boolean verificaListaAnimais() {
            if (listaAnimais.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }


        public void exibirAnimais() {

            if (!listaAnimais.isEmpty()) {
                for (Animais animais : listaAnimais) {
                    System.out.println("");

                    System.out.println("Nome do animal: " + animais.nome);
                    System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                    System.out.println("Sexo do animal: " + animais.sexo);
                    System.out.println("Idade do animal: " + animais.idade);
                    System.out.println("Espécie do animal: " + animais.especie);
                    System.out.println("Peso do animal: " + animais.peso);
                    System.out.println("Dieta do animal: " + animais.dieta);

                    System.out.println("");
                }
            } else {
                System.out.println("");
                System.out.println("ERRO: Você não cadastrou nenhum animal ainda");
                System.out.println("");
            }

        }

        public void exibirMamiferos() {

            for (Animais animais : listaAnimais) {

                if (animais.habitat == 1) {

                    System.out.println("");

                    System.out.println("Nome do animal: " + animais.nome);
                    System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                    System.out.println("Sexo do animal: " + animais.sexo);
                    System.out.println("Idade do animal: " + animais.idade);
                    System.out.println("Espécie do animal: " + animais.especie);
                    System.out.println("Peso do animal: " + animais.peso);
                    System.out.println("Dieta do animal: " + animais.dieta);

                    System.out.println("");

                }

            }

        }

        public void exibirAves() {

            for (Animais animais : listaAnimais) {

                if (animais.habitat == 2) {

                    System.out.println("");

                    System.out.println("Nome do animal: " + animais.nome);
                    System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                    System.out.println("Sexo do animal: " + animais.sexo);
                    System.out.println("Idade do animal: " + animais.idade);
                    System.out.println("Espécie do animal: " + animais.especie);
                    System.out.println("Peso do animal: " + animais.peso);
                    System.out.println("Dieta do animal: " + animais.dieta);

                    System.out.println("");

                }

            }

        }

        public void exibirRepteis() {

            for (Animais animais : listaAnimais) {

                if (animais.habitat == 3) {

                    System.out.println("");

                    System.out.println("Nome do animal: " + animais.nome);
                    System.out.println("•·•·•·•·•·•·•·•·•·••·•·•·•·•·•·•·•");
                    System.out.println("Sexo do animal: " + animais.sexo);
                    System.out.println("Idade do animal: " + animais.idade);
                    System.out.println("Espécie do animal: " + animais.especie);
                    System.out.println("Peso do animal: " + animais.peso);
                    System.out.println("Dieta do animal: " + animais.dieta);

                    System.out.println("");

                }

            }

        }

        public LocalDateTime getDate() {
            return date;
        }

        public void setDate(LocalDateTime date) {
            this.date = date;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDieta() {
            return dieta;
        }

        public void setDieta(String dieta) {
            this.dieta = dieta;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public int getHabitat() {
            return habitat;
        }

        public void setHabitat(int habitat) {
            this.habitat = habitat;
        }
        public void setRGA(int RGA) {
            this.RGA = RGA;
        }

        public int getRGA() {
            return RGA;
        }


        public void adicionarAnimal(Repteis novoReptil) {
        }
    }

