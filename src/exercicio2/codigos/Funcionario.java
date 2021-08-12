package exercicio2.codigos;

public abstract class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String admissao;
    private String departamento;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, double salario, String admissao, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.admissao = admissao;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAdmissao() {
        return this.admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        String result;

        result = String.format("Cargo.......: %s\n", this.cargo)+
                 String.format("Nome........: %s\n", this.nome)+
                 String.format("Salario.....: %s\n", this.salario)+
                 String.format("Data........: %s\n", this.admissao)+
                 String.format("Departamento: %s\n", this.departamento);

        return(result);
    }
}
