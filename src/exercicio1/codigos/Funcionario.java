package exercicio1.codigos;

public class Funcionario {
    private String nome;
    private double salario;
    private String data;
    private String departamento;

    public Funcionario(String nome, double salario, String data, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.data = data;
        this.departamento = departamento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
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

        result = String.format("Nome........: %s\n", this.nome)+
                 String.format("Salario.....: %s\n", this.salario)+
                 String.format("Data........: %s\n", this.data)+
                 String.format("Departamento: %s\n", this.departamento);

        return(result);
    }
}