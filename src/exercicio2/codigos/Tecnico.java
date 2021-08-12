package exercicio2.codigos;

public class Tecnico extends Funcionario{
    private int nivel;

    public Tecnico(int nivel) {
        this.nivel = nivel;
    }

    public Tecnico(String nome, String cargo, double salario, String admissao, String departamento, int nivel) {
        super(nome, cargo, salario, admissao, departamento);
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
