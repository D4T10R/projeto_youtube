package principal;

import java.net.IDN;
import java.util.Scanner;

import entities.Livros;
import entities.dao.DaoFactory;
import entities.model.dao.LivrosDAO;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LivrosDAO livrosDao = DaoFactory.createLivrosDao();

        System.out.println("O que deseja fazer: ");
        System.out.println("( 1 ) - Inserir Livros");
        System.out.println("( 2 ) - Inserir Autores ");
        System.out.println("( 3 ) - Visualizar Livros ");
        System.out.println("( 4 ) - Visualizar Autores ");
        System.out.println("( 0 ) - Finalizar o Programa");
        System.out.print("Escolha: ");
        int digito = sc.nextInt();

        if (digito == 1) {
            
        }
        else if (digito == 3) {
            System.out.println("Qual o ID do livro? ");
            Integer id = sc.nextInt();
            Livros livro = livrosDao.procurarId(id);
            System.out.println(livro);
        }


    }
}
