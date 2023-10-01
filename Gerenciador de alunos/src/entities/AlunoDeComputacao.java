package entities;

public class AlunoDeComputacao extends Aluno{
    public String linguagemDeProgramacao;

    public AlunoDeComputacao(String nome, int idade, int matricula, String linguagemDeProgramacao){
        super(nome, idade, matricula);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }
    public AlunoDeComputacao(String nome, int idade, int matricula){
        super(nome, idade, matricula);
        this.linguagemDeProgramacao = null;
    }

    @Override
    public String mostrarDetalhes() {
        return super.mostrarDetalhes() + "\nCurso: Ciências da computação";
    }

    public String getLinguagemDeProgramacao(){
        return this.linguagemDeProgramacao;
    }

}
