package Lista4;

import java.util.Scanner;

public class Desafio {
    static int posicao;
    static String[] numeros = new String[20];
    static String[] nomes = new String[20];
    static String salvarcontatoaserexcluido;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        int cont;


        do {
            System.out.println("Menu prinpal");
            System.out.println("Informe a opção desejada ou 99 para sair");
            System.out.println("1 = Cadastrar novo contato na Agenda.");
            System.out.println("2 = excluir contato da Agenda.");
            System.out.println("3 = listar contato da Agenda.");
            System.out.println("4 = Limpar todos os contatos.");

            System.out.println("Informe sua decição: ");
            cont = input.nextInt();

            switch (cont) {

                case 1:
                    System.out.println("Aba: Cadastrar contatos");
                    input.nextLine();
                    System.out.println("Informe o nome desse contato:");
                    String nomeDoUser = input.nextLine();
                    System.out.println("Informe o número:");
                    String numeroDoUser = input.nextLine();
                    Cadastrar(nomeDoUser, numeroDoUser);
                    System.out.println("Contato salvo");
                    posicao++;
                    break;


                case 2:
                    System.out.println("Aba: Excluir contatos");
                    if (posicao == 0) {
                        System.out.println("Nenhum contato cadastrado");
                        break;
                    }

                    System.out.println("Digite o nome do contato a ser excluido");
                    input.nextLine();
                    salvarcontatoaserexcluido = input.nextLine();
                    excluirContatos();
                    System.out.println("Ação concluida");
                    break;

                case 3:
                    if (posicao == 0) {
                        System.out.println("Nenhum contato cadastrado");
                        break;
                    }
                    System.out.println("Aba: Listar contatos");
                    listar();
                    break;

                case 4:
                    System.out.println("Aba: Limpar todos os contatos");
                    apagartodososcontatos();
                    System.out.println("AÇÃO CONCLUÍDA");
                    break;

                case 23:
                    System.out.println("Esse é o número favorita do desenvolvedor  ASS:Erick filipe");

                default:
                    System.out.println("Valor invalido");
                    break;
            }

        } while (cont != 99);

        System.out.println("teste de continueidade");

        input.close();
    }

    public static void Cadastrar(String nome, String numero) {
        nomes[posicao] = nome;
        numeros[posicao] = numero;
    }

    public static void listar() {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                String contato = "Nome:" + nomes[i] + " " + "|" + " Número" + numeros[i];
                System.out.println(contato);
            }
        }

    }


    public static void excluirContatos() {

        String exclusaoDeContato = salvarcontatoaserexcluido;
        for (int i = 0; i < posicao; i++) {
            if (nomes[i].equals(exclusaoDeContato)) {
                for (int j = 0; j < posicao - 1; j++) {
                    nomes[j] = nomes[j + 1];
                    numeros[j] = numeros[j + 1];
                }

                nomes[posicao - 1] = null;
                numeros[posicao - 1] = null;
                posicao--;
                String sucesso = nomes[i] + numeros[i];
                System.out.println(sucesso);
            }
        }

    }


    public static void apagartodososcontatos() {

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                nomes[i] = null;
                numeros[i] = null;
                posicao--;
            }
        }
    }

}
