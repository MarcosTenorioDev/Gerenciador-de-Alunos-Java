package entities;

public class Aluno {
   private String nome;
   private int idade;
   private int matricula;


    public Aluno(String nome, int idade, int matricula) {
            this.nome = nome;
            this.idade = idade;
            this.matricula = matricula;
    }

    public String mostrarDetalhes(){
        return "Nome: " + nome + "\nidade: " + idade + "\nmatricula: " + matricula;
    }
    public void estudar(){
        System.out.println("O aluno está estudando");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
