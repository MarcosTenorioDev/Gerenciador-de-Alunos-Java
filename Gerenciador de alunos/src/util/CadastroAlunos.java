package util;

import entities.Aluno;

import java.util.ArrayList;

public class CadastroAlunos {
    private static ArrayList<Aluno> listaAlunos;

    public static void adicionarAlunos(Aluno aluno){
        if(listaAlunos == null){
            listaAlunos = new ArrayList<>();
        }

        listaAlunos.add(aluno);
    }
    public static String listarAlunos(){

        if(listaAlunos == null){
            return "Você não tem alunos para listar";
        }else {
            if(listaAlunos.isEmpty()){
                return "Você tem zero alunos ativos na instituição";
            }else{
                String result = "";
                for(Aluno aluno : listaAlunos){
                    result += aluno.mostrarDetalhes() + "\n--------------------------------------\n";
                }
                return result;
            }
        }

    }

    public static void deletarAluno(int matricula){

        if(listaAlunos == null){
            System.out.println("Você não tem alunos para listar");
        }else{
            Aluno alunoParaRemover = null;

            for (Aluno aluno : listaAlunos){
                if(aluno.getMatricula() == matricula){
                    alunoParaRemover = aluno;
                    break;
                }
            }

            if (alunoParaRemover != null) {
                listaAlunos.remove(alunoParaRemover);
                System.out.println("Você deletou o aluno " + alunoParaRemover.getNome() + " do sistema.");

            } else {

                System.out.println("Não foi possível achar um aluno com esse número de matrícula no sistema");
            }


        }
        }

    public static void buscarAlunoPeloNome(String nome){
        if(listaAlunos == null){
            System.out.println("Você não tem alunos para buscar");
        }else if(listaAlunos.isEmpty()){
            System.out.println("A sua lista de alunos não possui nenhum aluno ativo");
        }else {
            for (Aluno aluno : listaAlunos) {
                if (aluno.getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Aluno encontrado:");
                    System.out.println("--------------------------------");
                    System.out.println(aluno.mostrarDetalhes());
                    System.out.println("--------------------------------");
                }else{
                    System.out.println("Não foi possível achar esse aluno no sistema");
                    break;
                }
            }
        }
        }

    public static void buscarAlunoPorMatricula(int matricula){
        if(listaAlunos == null){
            System.out.println("Você não tem alunos para buscar");
        }else if(listaAlunos.isEmpty()){
            System.out.println("A sua lista de alunos não possui nenhum aluno ativo");
        }else {
            for (Aluno aluno : listaAlunos) {
                if (aluno.getMatricula() == matricula ) {
                    System.out.println("Aluno encontrado:");
                    System.out.println("--------------------------------");
                    System.out.println(aluno.mostrarDetalhes());
                    System.out.println("--------------------------------");
                }else{
                    System.out.println("Não foi possível achar esse aluno no sistema");
                    break;
                }
            }
        }
    }

    public static Aluno getAlunoPorMatricula(int matricula) {
        if (listaAlunos == null) {
            return null;
        }else if(listaAlunos.isEmpty()){
            System.out.println("A sua lista de alunos não possui nenhum aluno ativo");
        }else{
            for (Aluno aluno : listaAlunos) {
                if (aluno.getMatricula() == matricula) {
                    return aluno;
                }
            }
        }



        return null;
    }


}









