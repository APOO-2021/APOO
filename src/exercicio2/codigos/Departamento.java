package exercicio2.codigos;

public class Departamento {
    private String nome;
    private Funcionario[] funcionario;

    public Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString(){
        String result;

        result = String.format("Departamento: %s\n", this.nome);

        return(result);
    }
}
