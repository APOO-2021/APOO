package exercicio2.codigos;

public class Gerente extends Funcionario {
    private String caracteristica; //chefe, lider, gestor, administrador

    public Gerente() {
    }

    public Gerente(String nome, String cargo, double salario, String admissao, String departamento, String caracteristica) {
        super(nome, cargo, salario, admissao, departamento);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
