import java.util.ArrayList;
import java.util.Scanner;

public class Atvd_empregados {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Empregado> empregados = new ArrayList<Empregado>();
        int opcao;

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar novo empregado");
            System.out.println("2 - Promover empregado");
            System.out.println("3 - Aumentar salário do empregado");
            System.out.println("4 - Demitir empregado");
            System.out.println("5 - Fazer aniversário do empregado");
            System.out.println("6 - Mostrar detalhes dos empregados");
            System.out.println("7 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    Empregado emp = new Empregado();

                    System.out.println("Digite o nome do empregado: ");
                    leitor.nextLine(); // Consumir a nova linha pendente
                    String nome = leitor.nextLine();
                    emp.setNome(nome);

                    System.out.println("Digite a idade do empregado: ");
                    int idade = leitor.nextInt();
                    emp.setIdade(idade);

                    System.out.println("Digite o salário do empregado: ");
                    double salario = leitor.nextDouble();
                    emp.setSalario(salario);

                    empregados.add(emp);
                    System.out.println("Empregado " + emp.getNome() + " criado!");
                    break;
                case 2:
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        System.out.println("Digite o número do empregado: ");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + " - " + empregados.get(i));
                        }
                        int indice = leitor.nextInt();

                        if (indice >= 0 && indice < empregados.size()) {
                            Empregado empregado = empregados.get(indice);
                            empregado.promover();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 3:
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        System.out.println("Digite o número do empregado: ");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + " - " + empregados.get(i));
                        }
                        int indice = leitor.nextInt();

                        if (indice >= 0 && indice < empregados.size()) {
                            Empregado empregado = empregados.get(indice);
                            System.out.println("Digite o percentual de aumento: ");
                            double percentual = leitor.nextDouble();
                            empregado.aumentarSalario(percentual);
                            System.out.println("Salário do empregado " + empregado.getNome() + " aumentado!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 4:
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        System.out.println("Digite o número do empregado: ");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + " - " + empregados.get(i));
                        }
                        int indice = leitor.nextInt();

                        if (indice >= 0 && indice < empregados.size()) {
                            Empregado empregado = empregados.get(indice);
                            System.out.println("Digite o motivo da demissão (1: Justa causa, 2: Decisão do empregador, 3: Aposentadoria): ");
                            int motivo = leitor.nextInt();
                            empregado.demitir(motivo);
                            empregados.remove(indice);
                            System.out.println("Empregado demitido.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 5:
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        System.out.println("Digite o número do empregado: ");
                        for (int i = 0; i < empregados.size(); i++) {
                            System.out.println(i + " - " + empregados.get(i));
                        }
                        int indice = leitor.nextInt();

                        if (indice >= 0 && indice < empregados.size()) {
                            Empregado empregado = empregados.get(indice);
                            empregado.fazerAniversario();
                            System.out.println("Aniversário do empregado " + empregado.getNome() + " realizado!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 6:
                    if (empregados.isEmpty()) {
                        System.out.println("Nenhum empregado cadastrado.");
                    } else {
                        for (Empregado empregado : empregados) {
                            System.out.println(empregado);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 7);

        leitor.close();
    }
}
