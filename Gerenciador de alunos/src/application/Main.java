package application;

import entities.*;
import util.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean menu = true;
        String opcao;
        int matriculaCounter = 0;

        do {
            System.out.println("Sistema de Cadastro de Alunos");
            System.out.println("Menu:");
            System.out.println("-----------------------------------");
            System.out.println("1 - Adicionar um Aluno ao sistema");
            System.out.println("2 - Listar Alunos do sistema");
            System.out.println("3 - Deletar Aluno do sistema");
            System.out.println("4 - Buscar Aluno por nome");
            System.out.println("5 - Buscar Aluno por matrícula");
            System.out.println("6 - Editar os dados de um aluno");
            System.out.println("sair - Sair do sistema");
            System.out.println("-----------------------------------");
            System.out.print("Opção: ");
            opcao = sc.nextLine();
            System.out.println();

            switch (opcao){


                case "1":
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade do aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    int matricula = matriculaCounter + 1;
                    matriculaCounter++;

                    System.out.println("Cursos disponíveis para matrícula:");
                    System.out.println("1 - Computação");
                    System.out.println("2 - Musica");
                    System.out.println("3 - Pintura");
                    String opcaoCurso = sc.nextLine();

                    switch (opcaoCurso){
                        case "1":
                            AlunoDeComputacao alunoComputacao = new AlunoDeComputacao(nome, idade, matricula);
                            CadastroAlunos.adicionarAlunos(alunoComputacao);

                            System.out.println("-------------------------------");
                            System.out.println("Aluno cadastrado com sucesso");
                            System.out.println("-------------------------------");
                            break;
                        case "2":
                            AlunoDeMusica alunoMusica = new AlunoDeMusica(nome, idade, matricula);
                            CadastroAlunos.adicionarAlunos(alunoMusica);

                            System.out.println("-------------------------------");
                            System.out.println("Aluno cadastrado com sucesso");
                            System.out.println("-------------------------------");
                            break;
                        case "3":
                            AlunoDePintura alunoPintura = new AlunoDePintura(nome, idade, matricula);
                            CadastroAlunos.adicionarAlunos(alunoPintura);

                            System.out.println("-------------------------------");
                            System.out.println("Aluno cadastrado com sucesso");
                            System.out.println("-------------------------------");
                            break;
                    }

                    break;
                case "2":
                    System.out.println(CadastroAlunos.listarAlunos());
                    break;
                case "3":
                    System.out.println("Digite a matrícula do aluno para excluir");
                    int matriculaPesquisa = sc.nextInt();
                    CadastroAlunos.deletarAluno(matriculaPesquisa);
                    sc.nextLine();
                    break;
                case "4":
                    System.out.println("Digite O nome do aluno para buscar: ");
                    String nomeBusca = sc.nextLine();
                    CadastroAlunos.buscarAlunoPeloNome(nomeBusca);
                    break;
                case "5":
                    System.out.println("Digite a matrícula do aluno para buscar: ");
                    int matriculaBusca = sc.nextInt();
                    sc.nextLine();
                    CadastroAlunos.buscarAlunoPorMatricula(matriculaBusca);
                    break;
                case "6":
                    System.out.println("Digite a matrícula do aluno para buscar: ");
                    int matriculaBuscaParaEditar = sc.nextInt();
                    sc.nextLine();

                    CadastroAlunos.buscarAlunoPorMatricula(matriculaBuscaParaEditar);
                    System.out.println();

                    Aluno alunoParaEditar = CadastroAlunos.getAlunoPorMatricula(matriculaBuscaParaEditar);

                    if (alunoParaEditar != null) {
                        System.out.println("Você deseja:");
                        System.out.println("1 - Editar nome do aluno");
                        System.out.println("2 - Editar idade do aluno");
                        int opcaoEdicao = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoEdicao) {
                            case 1:
                                System.out.println("Digite o novo nome do aluno:");
                                String novoNome = sc.nextLine();
                                alunoParaEditar.setNome(novoNome);
                                System.out.println("Nome do aluno atualizado com sucesso.");
                                break;

                            case 2:
                                System.out.println("Digite a nova idade do aluno:");
                                int novaIdade = sc.nextInt();
                                sc.nextLine();
                                alunoParaEditar.setIdade(novaIdade);
                                System.out.println("Idade do aluno atualizada com sucesso.");
                                break;

                            default:
                                System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case "sair":
                    menu = false;
            }
        }while(menu);




        sc.close();


    }
}