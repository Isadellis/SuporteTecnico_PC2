package callCenter;

import suporte.Interpretadora;
import suporte.SuporteTecnico;

import java.util.HashSet;
import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        Interpretadora interpretadora = new Interpretadora();
        SuporteTecnico suporteTecnico = new SuporteTecnico();

        System.out.println("AVISO: Em caso de demora da resposta, pressione enter novamente.\r\n");
        System.out.println("Bem-vindo ao sistema de Suporte Técnico!");
        while (continuar) {
            System.out.println("Pressione <enter> para continuar ou digite 'sair' para sair do sistema.");
            String retorno = scanner.nextLine();
            scanner.nextLine(); //"Limpa" o buffer do teclado

            //Verifica o que o usuário deseja fazer
            if (retorno.toLowerCase().equals("sair")) {
                continuar = false;
            } else if (!retorno.isEmpty()) {
                System.out.println("Opção inválida!");
            } else {

                System.out.println("Descreva seu problema de maneira sucinta.");
                interpretadora.interpretarTexto(scanner.nextLine().toLowerCase());
                scanner.nextLine(); //"Limpa" o buffer do teclado

                System.out.println(suporteTecnico.buscarSolucao(interpretadora.getPalavrasChave()));
                interpretadora.getPalavrasChave().clear(); //Limpa as palavras-chave
            }

            System.out.println();
        }

        System.out.println("Obrigado por utilizar nossos serviços!");
    }
}
