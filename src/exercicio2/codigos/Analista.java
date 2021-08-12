package exercicio2.codigos;

public class Analista extends Funcionario{
    private String[] responsabilidades;

    public Analista() {
    }

    public Analista(String nome, String cargo, double salario, String admissao, String departamento, String[] responsabilidades) {
        super(nome, cargo, salario, admissao, departamento);
        this.responsabilidades = responsabilidades;
    }

    public String[] getResponsabilidades() {
        return this.responsabilidades;
    }

    public void setResponsabilidades(String[] responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
}
