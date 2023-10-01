package entities;

public class AlunoDeMusica extends Aluno{

    private String instrumento;

    public AlunoDeMusica(String nome, int idade, int matricula, String instrumento){
        super(nome, idade, matricula);
        this.instrumento = instrumento;
    }

    public AlunoDeMusica(String nome, int idade, int matricula){
        super(nome, idade, matricula);
        this.instrumento = null;
    }

    @Override
    public String mostrarDetalhes() {
        return super.mostrarDetalhes() + "\nCurso: Música";
    }

    public String getInstrumento(){
        return this.instrumento;
    }

}
