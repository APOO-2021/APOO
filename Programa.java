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

        /**
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionario = new ArrayList<>();

        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastra empresa");
            System.out.println("Opção 2 - Cadastra funcionários");
            System.out.println("Opção 3 - Imprime dados funcionarios");
            System.out.println("Opção 4 - Aumenta salários");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            if(opcao == 1){
                Empresa empresa = new Empresa("Grande Empresa", "55.4444.333/2222-11");
                empresa.imprimeEmpresa();
            }else if(opcao == 2){
                //ArrayList<Funcionario> funcionario = new ArrayList<>();

                numFunc = qtdFuncionariosCadastrar();

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
            }else if(opcao == 3){
                aumento(funcionario, 0.1, "TI");
            }else if(opcao == 4){
                mostrar(funcionario);
            }
        } while (opcao != 0);*/




        Scanner scanner = new Scanner(System.in);

        Empresa empresa = new Empresa("Grande Empresa", "55.4444.333/2222-11");
        empresa.imprimeEmpresa();

        ArrayList<Funcionario> funcionario = new ArrayList<>();

        numFunc = qtdFuncionariosCadastrar();

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

        System.out.println("----Deseja aplicar o aumento de salário----");
        System.out.println("Tecle S para Sim e N para N:");
        opcao = scanner.nextInt();
        if(opcao == 1) {
            System.out.println("Informe o departamento para o aumento: ");
            departamento = scanner.next();
            aumento(funcionario, porcentagemAumento, departamento);
        }
        mostrar(funcionario);
    }

    public static void aumento(ArrayList<Funcionario> lista, double porcentagem, String departamento) {
        for (Funcionario func : lista) {
            if(func.getDepartamento().equals(departamento)){  //Como String é uma Classe, recebe tratamento diferente de tipos primitivos
                func.setSalario(func.getSalario()+(func.getSalario()*porcentagem));
            }
        }
    }

    public static int qtdFuncionariosCadastrar() {
        int numFunc = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o número de funcionários: ");
        numFunc = scanner.nextInt();
        return numFunc;
    }

    public static void mostrar(ArrayList<Funcionario> lista) {
        for (Funcionario func : lista) {
            System.out.printf("%s\n", func.toString());
            //System.out.println(func.getNome());
        }
    }
}











/**public class Programa {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionario = new ArrayList<>();

        funcionario.add(new Funcionario("Fulano", 4200, "02/03/1999", "TI"));
        funcionario.add(new Funcionario("Beltrano", 5300, "02/03/1999", "ADM"));
        funcionario.add(new Funcionario("Sicrono", 3900, "02/03/1999", "TI"));

        mostrar(funcionario);
    }

    public static void mostrar(ArrayList<Funcionario> lista) {
        for (Funcionario func : lista) {
            System.out.printf("%s\n", func.toString());
        }
    }
}*/




        //Funcionario[] funcionario = new Funcionario[];
        //funcionario[] = {"akakak", "ldldld"};

        //String nome1 = "aaaa";
        //String nome2 = "bbbb";
        //String nome3 = "cccc";

        //String[] arrayNomes1 = {"Fulano", "4200", "TI"};
        //String[] arrayNomes2 = {"Beltrano", "4600", "ADM"};
        //String[] arrayNomes3 = {"Cicrano", "5200", "DIR"};

        //String[][] matrizNomes = {arrayNomes1, arrayNomes2, arrayNomes3};

        //for (String[] array : matrizNomes) {
        //    for(String elemento : array) {
        //        System.out.println(elemento);
        //    }
        //}


















        //Empresa empresa = new Empresa("Nome da Empresa", "11.222.333/4444-55");
        //empresa.imprimeEmpresa();

        //Scanner scanner = new Scanner(System.in);
        //System.out.printf("Informe o número de funcionários: ");
        //numFunc = scanner.nextInt();
        //System.out.println(numFunc);

        //Funcionario[] funcionarios = new Funcionario[];

        //for (int i = 0; i < 3; i++) {
        //    nomeFunc = "Fulano";
        //    salarioFunc = 4200;
        //    dataFunc = "02/03/1999";
        //    nomeDep = "TI";
        //String[] arrayFunc = new String[]{nomeFunc, salarioFunc, dataFunc, nomeDep};
        //}

        //funcionarios[][0] = {"Fulano", 4200, "02/03/1999", "TI"};

        //Funcionario funcionario1 = new Funcionario("Fulano", 4200, "02/03/1999", "TI");
        //Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        //for (String dados : arrayFunc) {
        //    System.out.println(dados.length());
        //}


/**
        for(int i=0; i<numFunc; i++){
            System.out.println(i);
            System.out.print("Nome Funcionario: ");
            nomeFunc = scanner.next();
            System.out.println(nomeFunc);
        }

         Fazer um loop para inserção no array, até o número de funcionários informado. */

        //Funcionario funcionario1 = new Funcionario("Fulano", 4200, "02/03/1999", "TI");
        //Funcionario funcionario2 = new Funcionario("Beltrano", 5300, "02/03/1999", "ADM");
        //Funcionario funcionario3 = new Funcionario("Sicrono", 3900, "02/03/1999", "TI");

        //Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        /** Solicitar qual o setor e a margem a ser aumentada. Criar uma função no funcionário. */

        //for (Funcionario funcionario : funcionarios) {
        //    if(funcionario.getDepartamento() == "TI"){
        //        funcionario.setSalario(funcionario.getSalario()+(funcionario.getSalario()*0.1));
        //    }
        //    System.out.println(funcionario.getNome()+" - "+funcionario.getSalario()+" - "+funcionario.getData()+" - "+funcionario.getDepartamento());
        //}
    //}
//}