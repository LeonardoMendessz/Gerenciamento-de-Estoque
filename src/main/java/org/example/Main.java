package org.example;
import java.sql.Connection;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConexaoDAO conexaoDao = new ConexaoDAO(); // crio o objeto de conexao
        Connection conexao = conexaoDao.conetardb(); // uso o metodo de conexao do objeto

        /*Produto p = new Produto(1,"Luva",20.0);*/
        ProdutoDAO prod = new ProdutoDAO();
        Scanner teclado = new Scanner(System.in);
        int escolha = 0;

        do{
            System.out.println("------------------------");
            System.out.println(" GERENCIADOR DE ESTOQUE");
            System.out.println("------------------------");
            System.out.println("DIGITE 1 PARA ADICIONAR UM PRODUTO:");
            System.out.println("DIGITE 2 PARA DELETAR UM PRODUTO:");
            System.out.println("DIGITE 3 PARA LISTAR OS PRODUTOS:");
            System.out.println("DIGITE 4 PARA SAIR DO PROGRAMA:");
            escolha = teclado.nextInt();
            teclado.nextLine();
            switch(escolha){
                case 1:
                    System.out.println("Digite o ID do produto:");
                    int idProd = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite o NOME do produto:");
                    String nomeProd = teclado.nextLine();
                    System.out.println("Digite o PREÇO do produto:");
                    double precoProd = teclado.nextDouble();
                    Produto p = new Produto(idProd,nomeProd,precoProd);
                    prod.inserirProduto(p);
                    break;

                case 2:
                    System.out.println("Digite o ID do produto para ser deletado:");
                    int idDelet = teclado.nextInt();
                    prod.deletarProduto(idDelet);
                    break;

                case 3:
                    prod.Listar();
                    break;
                case 4:
                    System.out.println("OBRIGADO POR UTILIZAR NOSSO SITEMA!");
                    break;

                default:
                    System.out.println("DIGITE UM NÚMERO VALIDO!");
                    break;
            }
        }while(escolha !=4);

teclado.close();



    }
}