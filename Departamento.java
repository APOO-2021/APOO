package exercicio1.codigos;

public class Departamento {
    private String nome;
    private Funcionario funcionario;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public Departamento(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}