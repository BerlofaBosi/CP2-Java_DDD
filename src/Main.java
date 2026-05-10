import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Entregador> entregadores = new ArrayList<>();
        List<Entrega> entregas = new ArrayList<>();
        int contadorEntregas = 1;

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\n--- SISTEMA DE LOGÍSTICA FIAP ---");
            System.out.println("1. Cadastrar Entregador");
            System.out.println("2. Criar Nova Entrega");
            System.out.println("3. Listar Entregas");
            System.out.println("4. Atribuir Entrega");
            System.out.println("5. Atualizar Status (Sobrecarga)");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Tipo (1-Moto, 2-Bike, 3-Carro): ");
                    int tipo = scanner.nextInt();
                    if (tipo == 1) entregadores.add(new EntregadorMoto(nome));
                    else if (tipo == 2) entregadores.add(new EntregadorBike(nome));
                    else entregadores.add(new EntregadorCarro(nome));
                    System.out.println("Entregador cadastrado!");
                    break;
                case 2:
                    System.out.print("Endereço de destino: ");
                    String destino = scanner.nextLine();
                    entregas.add(new Entrega(contadorEntregas++, destino));
                    System.out.println("Entrega registrada!");
                    break;
                case 3:
                    for (Entrega e : entregas) System.out.println(e.getResumo());
                    break;
                case 4:
                    // Lógica simples de atribuição por índice
                    if (entregas.isEmpty() || entregadores.isEmpty()) {
                        System.out.println("Erro: Cadastre entregas e entregadores primeiro.");
                    } else {
                        entregas.get(0).setEntregador(entregadores.get(0));
                        entregas.get(0).atualizarStatus("EM ROTA");
                        System.out.println("Entrega 1 atribuída a " + entregadores.get(0).getNome());
                    }
                    break;
                case 5:
                    if (!entregas.isEmpty()) {
                        System.out.println("1. Atualizar simples | 2. Atualizar com observação");
                        int subOpcao = scanner.nextInt();
                        scanner.nextLine(); // ADICIONE ESTA LINHA PARA LIMPAR O BUFFER

                        if (subOpcao == 1) {
                            System.out.print("Novo status: ");
                            String statusInput = scanner.nextLine(); // Agora ele vai esperar o seu input
                            entregas.get(0).atualizarStatus(statusInput);
                        }
                        else {
                            System.out.print("Novo status: ");
                            String statusInput = scanner.nextLine();

                            System.out.print("Observação: ");
                            String observacaoInput = scanner.nextLine();

                            entregas.get(0).atualizarStatus(statusInput, observacaoInput);
                        }
                    }
                    break;
            }
        }
        scanner.close();
    }
}