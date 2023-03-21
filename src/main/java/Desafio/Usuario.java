package Desafio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int cont;
            do {
                System.out.println("---- Menu prinpal ----");
                System.out.println("Informe a opção desejada ou '99' para sair.");
                System.out.println("1 | Cadastrar novo Usuário.");
                System.out.println("2 | Cadastrar Bilhete.");
                System.out.println("3 | Recarregar Bilhete.");
                System.out.println("4 | Pagar Passagem.");
                System.out.println("5 | Listar Bilhetes.");
                System.out.println("6 | Pesquisar Bilhete por CPF.");
                System.out.println("Informe sua decisão: ");
                cont = input.nextInt();

                switch (cont) {
                    case 1:
                        CadastrarUsuario();
                        break;

                    case 2:
                        CadastrarBilhete();
                        break;

                    case 3:
                        recarregarBilhete();
                        break;

                    case 4:
                        pagarPassagem();
                        break;
                    case 5:
                        listar();
                        break;
                    case 6:
                        pesquisaPorCPF();
                        break;
                    case 23:
                        System.out.println("Esse é o número favorita do desenvolvedor  ASS:Erick filipe");

                    default:
                        if (cont != 99){
                            System.out.println("--- Valor invalido, digite uma nova opção ---");
                            break;
                        }else {
                            System.out.println("--- O programa será fechado ---");
                        }

                }

            } while (cont != 99);

            input.close();

        }catch (InputMismatchException e){
            System.out.println("Valor inválido, Informe um valor válido(Número inteiro)");
            System.out.println("O programa deverá ser reiniciado");
        }

    }

    static BilheteUnicoPadrao salvar;
    static BilheteUnicoPadrao salvar2;
    static ArrayList<Login> usuarios = new ArrayList<Login>();
    static ArrayList<BilheteUnicoPadrao> bilhetes = new ArrayList<BilheteUnicoPadrao>();
    private static void CadastrarUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Aba: Cadastrar novo Usuário ---");
        System.out.println("Informe o nome: ");
        String guardaNome = input.nextLine();
        System.out.println("Informe o CPF: ");
        String guardaCPF = input.nextLine();
        System.out.println("Informe o e-mail: ");
        String guardaEmail = input.nextLine();
        System.out.println("Informe o telefone: ");
        String guardaTelefone = input.nextLine();

        Login usuario = new Login(guardaNome, guardaCPF, guardaEmail, guardaTelefone);
        usuarios.add(usuario);
    }

    private static void  CadastrarBilhete(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Aba: Cadastrar Bilhete ---");
        System.out.println("Informe seu CPF: ");
        String cpfBilhete = input.nextLine();
        Login guardaUsuario = new Login(" "," "," "," ");

        for (Login usuario:usuarios) {
            if (cpfBilhete.equals(usuario.getCPF())){
                guardaUsuario = usuario;
                System.out.println("Qual tipo de Bilhete: ");
                System.out.println("1 - Bilhete unico");
                System.out.println("2 - bilhete estudante");
                int escolha = input.nextInt();

                BilheteUnicoPadrao bilhete;

                if (escolha == 1){
                    bilhete = new BilheteUnico(guardaUsuario);
                    bilhetes.add(bilhete);
                }else {
                    bilhete = new BilheteDoEstudante(guardaUsuario);
                    bilhetes.add(bilhete);
                }
                System.out.println("Ação concluida");
            }else {
                System.out.println("CPF não encontrada");
            }
        }

    }
    private static void listar() {
        System.out.println("---Lista de Bilhetes---");
        if (bilhetes.isEmpty()) {
            System.out.println("Não há bilhetes cadastrados.");
        } else {
            for (BilheteUnicoPadrao bilhete : bilhetes) {
                System.out.println(bilhete.toString());
            }
        }
    }

    private static void pesquisaPorCPF(){
        Scanner input = new Scanner(System.in);
        System.out.println("---  Aba: de pesquisa ---");
        System.out.println("Digite o Cpf do Usúario a ser pesquisado: ");
        String salvarCpf = input.nextLine();
        for (BilheteUnicoPadrao bilhete : bilhetes) {
            if (salvarCpf.equals(bilhete.getUsuario().getCPF())) {
                salvar = bilhete;
                System.out.println("Esse é o Bilhete: " + bilhete);
            }else {
                System.out.println("CPF não encontrado");
            }
        }
    }

    private static void pagarPassagem(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Aba: Pagar Passagem ---");
        System.out.println("Informe o codigo de bilhete: ");
        String codigoBilhete2 = input.nextLine();
        for (BilheteUnicoPadrao bilhete : bilhetes) {
            if (codigoBilhete2.equals(bilhete.getCodigo())) {
                salvar = bilhete;
            }
        }
        if (salvar instanceof BilheteDoEstudante){
            salvar.pagarPassagem();
            System.out.println("Ação concluída");
        }else {
            double desconto = 5;
            salvar.pagarPassagem(desconto);
        }
    }

    private static void recarregarBilhete(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- Aba: Recarregar Bilhete ---");
        System.out.println("Informe o codigo de bilhete: ");
        String codigoBilhete = input.nextLine();
        String guardacodigo;
        for (BilheteUnicoPadrao bilhete : bilhetes) {
            if (codigoBilhete.equals(bilhete.getCodigo())) {
                salvar2 = bilhete;
            }
        }
        if (salvar2 instanceof BilheteDoEstudante){
            salvar2.recargaBilhete();
            System.out.println("Ação concluída");
        }else {
            System.out.println("Informe de quanto será a recarga");
            double adicao = input.nextInt();
            salvar2.recargaBilhete(adicao);
        }
    }

}

