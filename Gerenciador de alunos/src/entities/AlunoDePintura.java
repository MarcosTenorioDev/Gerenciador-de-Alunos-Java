package entities;

public class AlunoDePintura extends Aluno{
    String estiloPintura;
    int quadrosPintados;

    public AlunoDePintura(String nome, int idade, int matricula, String estiloPintura){
        super(nome, idade, matricula);
        this.estiloPintura = estiloPintura;
        this.quadrosPintados = 0;
    }
    public AlunoDePintura(String nome, int idade, int matricula){
        super(nome, idade, matricula);
        this.estiloPintura = null;
        this.quadrosPintados = 0;
    }

    @Override
    public String mostrarDetalhes() {
        return super.mostrarDetalhes() + "\nCurso: Artes";
    }

    public void pintarQuadro(){
        quadrosPintados++;
        System.out.println("O aluno está pintando um quadro no estilo: " + estiloPintura);
    }

    public String getEstiloPintura(){
        return this.estiloPintura;
    }

    public int getQuadrosPintados(){
        return this.quadrosPintados;
    }
}
