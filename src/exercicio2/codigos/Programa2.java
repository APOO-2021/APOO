package exercicio2.testes;

import exercicio2.codigos.Empresa;
import exercicio2.codigos.Departamento;
import exercicio2.codigos.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args){

        Integer escolha = 0;
        String nomeFunc;
        String cargoFunc = null;
        double salarioFunc;
        String admissaoFunc;
        String departFunc;

        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        do {
            if (empresa.getNome() != null){
                System.out.println("----------------------------------------");
                System.out.println(empresa.getNome()+" - "+empresa.getCnpj());
                System.out.println("----------------------------------------");
            }
            menu();
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:  //Cadastra empresa
                    System.out.printf("Insira o nome da empresa:");
                    empresa.setNome(scanner.next());
                    System.out.printf("Insira o CNPJ da empresa:");
                    empresa.setCnpj(scanner.next());
                    break;
                case 2:  //Cadastra departamento
                    System.out.printf("Insira o nome do departamento:");
                    departamentos.add(new Departamento(scanner.next()));
                    break;
                case 3:  //Cadastra funcionário
                    System.out.printf("Insira o nome do funcionário:");
                    nomeFunc = scanner.next();
                    System.out.println("Insira o número do cargo:");
                    cargo();
                    switch (scanner.nextInt()) {
                        case 1:
                            cargoFunc = "Gerente";
                            break;
                        case 2:
                            cargoFunc = "Analísta";
                            break;
                        case 3:
                            cargoFunc = "Técnico";
                            break;
                        default:
                            break;
                    }
                    System.out.printf("Insira o salário do funcionário:");
                    salarioFunc = scanner.nextDouble();
                    System.out.printf("Insira a data de admissão do funcionário:");
                    admissaoFunc = scanner.next();
                    System.out.printf("Insira o departamento do funcionário:");
                    departFunc = scanner.next();
                    funcionarios.add(new Funcionario(nomeFunc, cargoFunc, salarioFunc, admissaoFunc, departFunc) {});
                    break;
                case 4:  //Aumento salarial por setor
                    System.out.println("Informe o departamento a receber aumento salarial:");
                    departFunc = scanner.next();
                    confirmaAumento();
                    if(scanner.nextInt() == 1) {
                        for (Funcionario funcionario : funcionarios) {
                            //if (funcionario.getDepartamento() == departFunc) {
                            if (departFunc.equals(funcionario.getDepartamento())) {
                                funcionario.setSalario(funcionario.getSalario()*1.10);
                                System.out.println("Novo salário do "+departFunc+": "+funcionario.getSalario());
                            }
                        }
                    }
                    break;
                case 5:  //Aumento salarial de gerentes
                    confirmaAumento();
                    if(scanner.nextInt() == 1) {
                        for (Funcionario funcionario : funcionarios) {
                            if (funcionario.getCargo() == "Gerente") {
                                funcionario.setSalario(funcionario.getSalario()*1.15);
                                System.out.println("Novo salário dos Gerentes "+funcionario.getSalario());
                            }
                        }
                    }
                    break;
                case 6:  //Busca funcionário
                    System.out.println("Insira o funcionário a buscar:");
                    nomeFunc = scanner.next();
                    for (Funcionario funcionario : funcionarios){
                        if(nomeFunc.equals(funcionario.getNome())) {
                            System.out.println(funcionario.getCargo() + " " + funcionario.getNome());
                        }
                    }
                    break;
                case 7:  //Imprimir departamentos
                    for (Departamento departamento : departamentos){
                        System.out.printf("%s", departamento.toString());
                    }
                    break;
                case 8:  //Imprimir funcionários
                    for (Funcionario funcionario : funcionarios){
                        System.out.printf("%s", funcionario.toString());
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while (escolha != 0);
    }

    public static void menu() {
        System.out.println("----- Tela de Trabalho -----");
        System.out.println("1) Cadastra empresa");
        System.out.println("2) Cadastra departamento");
        System.out.println("3) Cadastra funcionário");
        System.out.println("4) Aumento salarial por setor");
        System.out.println("5) Aumento salarial de gerentes");
        System.out.println("6) Busca funcionario");
        System.out.println("7) Imprimir departamentos");
        System.out.println("8) Imprimir funcionários");
        System.out.println("0) Sair do programa");
        System.out.printf("Escolha uma opcao: ");
    }

    public static void cargo(){
        //System.out.println("---- Informe o cargo: ----");
        System.out.println("1) Gerente");
        System.out.println("2) Analísta");
        System.out.println("3) Técnico");
        System.out.printf("Escolha um cargo: ");
    }

    public static void confirmaAumento(){
        System.out.println("---- Confirmação de aumento salarial: ----");
        System.out.println("1) Confirmar");
        System.out.println("2) Cancelar");
        System.out.println("Escolha uma opção: ");
    }
}