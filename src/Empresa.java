package exercicio1.codigos;

public class Empresa {
    private String nome;
    private String cnpj;
    private Departamento departamento;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void imprimeEmpresa(){
        System.out.println("Empresa: "+this.nome+" - CNPJ: "+this.cnpj);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setNomeDep(Departamento departamento) {
        this.departamento = departamento;
    }
}
