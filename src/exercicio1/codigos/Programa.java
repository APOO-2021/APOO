package exercicio1.testes;

import java.util.ArrayList;
import java.util.Scanner;
import exercicio1.codigos.Empresa;
import exercicio1.codigos.Funcionario;

public class Programa {
    public static void main(String[] args) {
        int numFunc = 0;
        int opcao = 0;
        double porcentagemAumento = 0.1;
        String nome;
        double salario;
        String data;
        String departamento;
        Integer escolha = 0;

        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa("Grande Empresa", "55.4444.333/2222-11");
        empresa.imprimeEmpresa();
        ArrayList<Funcionario> funcionario = new ArrayList<>();

        do {

            menu();

            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:  //Cadastra empresa
                    System.out.printf("Informe o número de funcionários: ");
                    numFunc = scanner.nextInt();

                    for (int i = 0; i < numFunc; i++) {
                        System.out.print("Nome do Funcionario........: ");
                        nome = scanner.next();
                        System.out.print("Salario do Funcionario.....: ");
                        salario = scanner.nextDouble();
                        System.out.print("Data de Admissão...........: ");
                        data = scanner.next();
                        System.out.print("Departamento do Funcionario: ");
                        departamento = scanner.next();
                        funcionario.add(new Funcionario(nome, salario, data, departamento));
                    }
                    break;
                case 2:  //Aumento de 10%

                    System.out.println("----Deseja aplicar o aumento de salário----");
                    System.out.println("Tecle 1 para Sim e 2 para N:");
                    opcao = scanner.nextInt();
                    if (opcao == 1) {
                        System.out.println("Informe o departamento para o aumento: ");
                        departamento = scanner.next();
                        for (Funcionario func : funcionario) {
                            if (func.getDepartamento().equals(departamento)) {  //Como String é uma Classe, recebe tratamento diferente de tipos primitivos
                                func.setSalario(func.getSalario() + (func.getSalario() * porcentagemAumento));
                            }
                        }
                    }
                    break;
                case 3:  //Imprime funcionários
                    for (Funcionario func : funcionario) {
                        System.out.printf("%s\n", func.toString());
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while (escolha != 0);
    }

    public static void menu() {
        System.out.println("----- Tela de Trabalho -----");
        System.out.println("1) Cadastra funcionário");
        System.out.println("2) Aumento salarial por departamento");
        System.out.println("3) Imprimir funcionários");
        System.out.println("0) Sair do programa");
        System.out.printf("Escolha uma opcao: ");
    }
}